package com.github.csegu.porrafutbol.core.service;

import com.github.csegu.porrafutbol.core.dto.MatchDto;
import com.github.csegu.porrafutbol.core.model.Match;
import com.github.csegu.porrafutbol.core.repository.MatchRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class MatchService {

    private MatchRepository matchRepository;

    @Transactional
    public void addMatch(MatchDto matchDto) {
        Match match = new Match(matchDto.getMatchId(), matchDto.getMatchDay(), matchDto.getGroup(), 
                matchDto.getMatchDate(), matchDto.getHomeTeam(), matchDto.getAwayTeam(),matchDto.getResult(), matchDto.getVenue());
        matchRepository.save(match);
    }

    public List<MatchDto> listMatchs() {
        return matchRepository.findAll().stream().map(MatchService::map).collect(Collectors.toList());
    }

    public MatchDto findById(Long id) {
        return MatchService.map(matchRepository.getOne(id));
    }

    public static MatchDto map(Match match) {
        MatchDto result = null;
        if (match != null) {
            result = new MatchDto(match.getMatchId(), match.getMatchDay(), match.getGroup(), 
                match.getMatchDate(), match.getHomeTeam(), match.getAwayTeam(),match.getResult(), match.getVenue());
        }
        return result;
    }
}
