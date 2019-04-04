package com.github.csegu.porrafutbol.core.batch;

import com.github.csegu.porrafutbol.adapter.footballdata.services.FootballDataWsService;
import com.github.csegu.porrafutbol.core.model.Team;
import com.github.csegu.porrafutbol.core.repository.GroupRepository;
import com.github.csegu.porrafutbol.core.repository.GroupTableRepository;
import com.github.csegu.porrafutbol.core.repository.MatchRepository;
import com.github.csegu.porrafutbol.core.repository.TeamRepository;
import com.github.csegu.porrafutbol.core.service.TeamMapper;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class FootballDataBatchService {

    private static final Object MUTEX = new Object();

    private FootballDataWsService footballDataWsService;
    
    private TeamRepository teamRepository;

    private MatchRepository matchRepository;

    private GroupRepository groupRepository;

    private GroupTableRepository groupTableRepository;

    private TeamMapper teamMapper;

    @Synchronized("MUTEX")
    @CacheEvict(cacheNames = "teams", allEntries = true)
    @Scheduled(cron = "${football-data.ws.teams.check.cron}")
    public void updateTeams() {
        log.trace("Update Teams");
        List<Team> teams = footballDataWsService.obtenerDetalleEquipos().stream()
                .map(t -> teamMapper.map(t)).collect(Collectors.toList());
        teamRepository.saveAll(teams);
    }
}
