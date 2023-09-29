package su.woland.learningspringboot.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import su.woland.learningspringboot.persistence.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
