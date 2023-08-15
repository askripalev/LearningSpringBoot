package su.woland.learningspringboot.persistence.gateway;

import su.woland.learningspringboot.persistence.entity.PersonEntity;

public interface PersistenceGateway {
    PersonEntity savePerson(PersonEntity personEntity);
}
