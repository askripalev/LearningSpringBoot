package su.woland.learningspringboot.storage.repository;

import org.springframework.data.repository.CrudRepository;
import su.woland.learningspringboot.storage.entity.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
