package su.woland.learningspringboot.persistence.gateway.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.PersonEntity;
import su.woland.learningspringboot.persistence.gateway.PersistenceGateway;
import su.woland.learningspringboot.persistence.repository.PersonRepository;

@Component
@AllArgsConstructor
public class PersistenceGatewayImpl implements PersistenceGateway {

    PersonRepository personRepository;

    @Override
    public PersonEntity savePerson(PersonEntity personEntity) {
        return personRepository.save(personEntity);
    }

}
