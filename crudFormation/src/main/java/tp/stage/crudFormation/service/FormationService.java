package tp.stage.crudFormation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tp.stage.crudFormation.model.Formation;
import tp.stage.crudFormation.repository.FormationRepository;

@Service
public class FormationService {
    
    @Autowired
    private FormationRepository fRepository;

    public Iterable<Formation> getAllFormations() {
        return fRepository.findAll();
    }

    public Optional<Formation> getFormationById(Long id) {
        return fRepository.findById(id);
    }

    public Formation saveFormation(Formation formation) {
        return fRepository.save(formation);
    }

    public void deleteFormation(Long id) {
        fRepository.deleteById(id);
    }


    
}
