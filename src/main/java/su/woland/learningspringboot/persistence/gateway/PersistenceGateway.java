package su.woland.learningspringboot.persistence.gateway;

import su.woland.learningspringboot.persistence.entity.Person;

public interface PersistenceGateway {

    Person savePerson(Person person);

}
