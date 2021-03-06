package com.github.csegu.porrafutbol.core.repository;

import com.github.csegu.porrafutbol.core.model.Team;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("select t from Team t where t.id = :id")
    Team findTeamById(long id);

    @Query("select t from Team t where t.name = :name")
    Team findTeamByName(@Param("name") String name);
    
    @Query("select t from Team t")
    List<Team> listAllTeams();

}
