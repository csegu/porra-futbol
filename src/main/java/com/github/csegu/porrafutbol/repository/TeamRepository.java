package com.github.csegu.porrafutbol.repository;

import com.github.csegu.porrafutbol.model.Team;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TeamRepository extends JpaRepository<Team, Long> {

    
    @Query("select t from Team t where t.id = :id")
    Team findTeamById(long id);

    @Query("select t from Team t where t.name = :name")
    Team findTeamByName(@Param("name") String name);
    
    @Query("select t from Team t")
    List<Team> ListAllTeams();

}
