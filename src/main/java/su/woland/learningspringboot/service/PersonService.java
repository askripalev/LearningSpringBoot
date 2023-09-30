package su.woland.learningspringboot.service;

import su.woland.learningspringboot.service.dto.PersonServiceProps;

public interface PersonService {

    PersonServiceProps savePerson(PersonServiceProps personServiceProps);

}
