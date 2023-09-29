package su.woland.learningspringboot.service;

import su.woland.learningspringboot.service.dto.PersonServiceData;

public interface PersonService {

    PersonServiceData savePerson(PersonServiceData personServiceData);

}
