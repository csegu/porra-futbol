package com.github.csegu.porrafutbol;

import com.github.csegu.porrafutbol.model.Team;
import com.github.csegu.porrafutbol.repository.TeamRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class Initializer implements CommandLineRunner {

    private TeamRepository teamRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", (Object)args);
        teamRepository.save(new Team(1L, "Real Madrid C.F.", "Real Madrid", "Spain", "RMA"));
        teamRepository.save(new Team(2L, "F.C. Barcelona", "Barcelona", "Spain", "FCB"));
        teamRepository.save(new Team(3L, "Bayern Munchen", "Bayern", "Germany", "BYM"));
        teamRepository.save(new Team(4L, "Juventus", "Juventus", "Italy", "JUV"));
        log.trace("Carga inicial de equipos.");
    }
}
