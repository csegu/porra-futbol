package com.csg.proyectoporra.repository;

import com.csg.proyectoporra.model.Team;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
public interface TeamRepository extends Repository<Team, Long> {

    /**
     * Saves the given {@link Customer}.
     *
     * @param <S>
     * @param team
     * @return
     */
    <S extends Team> S save(S team);

    /**
     * Sample method to derive a query from using JDK 8's {@link Optional} as
     * return type.
     *
     * @param id
     * @return
     */
    @Query("select t from Team t where t.id = :id")
    Team findTeamById(long id);

    @Query("select t from Team t where t.name = :name")
    Team findTeamByName(@Param("name") String name);
    
    @Query("select t from Team t")
    List<Team> ListAllTeams();

}
