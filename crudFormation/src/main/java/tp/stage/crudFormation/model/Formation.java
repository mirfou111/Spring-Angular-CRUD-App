package tp.stage.crudFormation.model;

import java.util.Collection;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@ Data @AllArgsConstructor @NoArgsConstructor
public class Formation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   

    private String libelle;

    @ElementCollection
    private Collection<String> prerequis;

    @ElementCollection
    private Collection<String> debouches;

}
