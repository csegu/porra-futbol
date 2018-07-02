package com.github.csegu.porrafutbol;

import com.github.csegu.porrafutbol.model.Team;
import com.github.csegu.porrafutbol.repository.TeamRepository;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Cristian Segura <jordison@gmail.com>
 */
@Component
public class Initializer implements CommandLineRunner{

    @Autowired
    private TeamRepository TeamRepository;
    
    Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");


    @Override
    public void run(String...args) throws Exception {
        logger.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", Arrays.toString(args));
                
        TeamRepository.save(new Team(1L, "Real Madrid C.F."));
        TeamRepository.save(new Team(2L, "F.C. Barcelona"));
        TeamRepository.save(new Team(3L, "Bayern Munchen"));
        TeamRepository.save(new Team(4L, "Juventus"));
        logger.trace("Carga inciial de equipos.");
        
    }

}
