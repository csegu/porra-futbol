package com.github.csegu.porrafutbol.core.service;

import com.github.csegu.porrafutbol.adapter.footballdata.model.FootballDataTeam;
import com.github.csegu.porrafutbol.core.dto.TeamDto;
import com.github.csegu.porrafutbol.core.model.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper {
    final TeamMapper MAPPER = Mappers.getMapper(TeamMapper.class);

    @Mappings({
    })
    TeamDto map(Team team);

    Team map(TeamDto team);
    
    @Mappings({
        @Mapping(target = "country", source = "fdt.area.name")
    })
    Team map (FootballDataTeam fdt);
}
