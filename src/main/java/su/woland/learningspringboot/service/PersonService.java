package su.woland.learningspringboot.service;

import su.woland.learningspringboot.service.dto.PersonServiceDto;

public interface PersonService {
    PersonServiceDto savePerson(PersonServiceDto personServiceDto);
}
