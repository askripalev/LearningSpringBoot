package su.woland.learningspringboot.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import su.woland.learningspringboot.persistence.repository.entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
