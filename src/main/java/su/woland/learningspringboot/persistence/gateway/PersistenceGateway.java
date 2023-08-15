package su.woland.learningspringboot.persistence.gateway;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.PersonRepository;
import su.woland.learningspringboot.persistence.entity.PersonEntity;

@Component
@AllArgsConstructor
public class PersistenceGateway {
    PersonRepository personRepository;

    public PersonEntity savePerson(PersonEntity personEntity) {
        return personRepository.save(personEntity);
    }
}
