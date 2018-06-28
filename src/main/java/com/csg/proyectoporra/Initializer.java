package com.csg.proyectoporra;

import com.csg.proyectoporra.model.Team;
import com.csg.proyectoporra.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
@Component
public class Initializer {

    private TeamRepository TeamRepository;

    @Autowired
    public Initializer(TeamRepository TeamRepository) {
        this.TeamRepository = TeamRepository;
        LoadTeams();
    }

    private void LoadTeams() {
        TeamRepository.save(new Team(1L, "Real Madrid C.F."));
    }
}
