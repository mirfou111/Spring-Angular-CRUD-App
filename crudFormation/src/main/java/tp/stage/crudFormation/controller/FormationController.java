package tp.stage.crudFormation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tp.stage.crudFormation.model.Formation;
import tp.stage.crudFormation.service.FormationService;

@Controller
@RequestMapping("/")
public class FormationController {
    
    @Autowired
    private FormationService fService;

    @GetMapping("formations")
    public Iterable<Formation> touteLesFormation(){
        return fService.getAllFormation();
    }

}
