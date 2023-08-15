package su.woland.learningspringboot.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import su.woland.learningspringboot.persistence.entity.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> { }
