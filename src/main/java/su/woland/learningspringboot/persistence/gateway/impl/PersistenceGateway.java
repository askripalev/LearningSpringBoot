package su.woland.learningspringboot.persistence.gateway.impl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.Person;
import su.woland.learningspringboot.persistence.repository.PersonRepository;

@Component
@AllArgsConstructor
@Log4j2
public class PersistenceGateway implements su.woland.learningspringboot.persistence.gateway.PersistenceGateway {

    PersonRepository personRepository;

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

}
