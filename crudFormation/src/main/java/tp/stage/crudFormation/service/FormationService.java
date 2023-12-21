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

    public Iterable<Formation> getAllFormation(){
        return fRepository.findAll();
    }

    public Optional<Formation> getFormationById(Long id){
        return fRepository.findById(id);
    }

    
}
