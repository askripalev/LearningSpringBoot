package su.woland.learningspringboot.persistence.gateway.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.Person;
import su.woland.learningspringboot.persistence.repository.PersonRepository;

@Component
@AllArgsConstructor
public class PersistenceGateway implements su.woland.learningspringboot.persistence.gateway.PersistenceGateway {

    private final PersonRepository personRepository;

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

}
