package tp.stage.crudFormation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tp.stage.crudFormation.model.Formation;
import tp.stage.crudFormation.service.FormationService;

@RestController
@RequestMapping("/formations")
public class FormationController {

    @Autowired
    private FormationService formationService;

    @GetMapping
    public ResponseEntity<Iterable<Formation>> getAllFormations() {
        Iterable<Formation> formations = formationService.getAllFormations();
        return new ResponseEntity<>(formations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formation> getFormationById(@PathVariable Long id) {
        Optional<Formation> formation = formationService.getFormationById(id);
        return formation.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Formation> saveFormation(@RequestBody Formation formation) {
        Formation savedFormation = formationService.saveFormation(formation);
        return new ResponseEntity<>(savedFormation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Formation> updateFormation(@PathVariable Long id, @RequestBody Formation updatedFormation) {
        Optional<Formation> existingFormation = formationService.getFormationById(id);
        if (existingFormation.isPresent()) {
            updatedFormation.setId(id);
            Formation savedFormation = formationService.saveFormation(updatedFormation);
            return new ResponseEntity<>(savedFormation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("del/{id}")
    public ResponseEntity<Void> deleteFormation(@PathVariable Long id) {
        Optional<Formation> existingFormation = formationService.getFormationById(id);
        if (existingFormation.isPresent()) {
            formationService.deleteFormation(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
