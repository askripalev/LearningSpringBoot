package su.woland.learningspringboot.persistence.gateway.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.PersonEntity;
import su.woland.learningspringboot.persistence.gateway.PersistenceGateway;
import su.woland.learningspringboot.persistence.PersonPersistence;

@Component
@AllArgsConstructor
public class PersistenceGatewayImpl implements PersistenceGateway {
    PersonPersistence personPersistence;

    @Override
    public PersonEntity savePerson(PersonEntity personEntity) {
        return personPersistence.save(personEntity);
    }
}
