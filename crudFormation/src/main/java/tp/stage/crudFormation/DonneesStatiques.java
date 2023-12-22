package tp.stage.crudFormation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tp.stage.crudFormation.model.Formation;
import tp.stage.crudFormation.service.FormationService;

import java.util.Arrays;

@Component
public class DonneesStatiques implements CommandLineRunner {

    @Autowired
    private FormationService formationService;

    @Override
    public void run(String... args) throws Exception {
        // Insérez ici votre code d'initialisation des données statiques

        Formation formation1 = new Formation(1L, "Big Data", Arrays.asList("Dase de donnees", "Algorithmique"), Arrays.asList("Data Scientist", "Data Analyst"));
        Formation formation2 = new Formation(2L, "Cybersecurite", Arrays.asList("Mathematiques", "Algorithmique"), Arrays.asList("Expert en securite informatique", "Consultant ..."));

        formationService.saveFormation(formation1);
        formationService.saveFormation(formation2);
    }
}

