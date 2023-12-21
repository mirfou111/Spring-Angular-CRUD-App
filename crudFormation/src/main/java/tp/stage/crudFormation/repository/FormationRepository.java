package tp.stage.crudFormation.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tp.stage.crudFormation.model.Formation;

@Repository
public interface FormationRepository extends CrudRepository<Formation, Long> {}
