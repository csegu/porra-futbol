package com.github.csegu.porrafutbol.core;

import com.github.csegu.porrafutbol.adapter.footballdata.model.FootballDataTeam;
import com.github.csegu.porrafutbol.adapter.footballdata.services.FootballDataWsService;
import com.github.csegu.porrafutbol.core.repository.TeamRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@Configuration
@EnableSwagger2
@ComponentScan(lazyInit = true)
@AllArgsConstructor(onConstructor = @__({
    @Autowired}))
public class Initializer implements CommandLineRunner {

    private TeamRepository teamRepository;

    private FootballDataWsService footballDataWsService;

    @Override
    public void run(String... args) throws Exception {
        log.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", (Object) args);
        log.trace("Carga inicial de equipos.");
        
        callTeamsWs();

    }

    @Autowired
    private void callTeamsWs() {
        List<FootballDataTeam> teams = footballDataWsService.obtenerDetalleEquipos();
        log.trace("Lista de equipos obtenidos por ws: {}", teams);
    }
}
