package su.woland.learningspringboot.service;

import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.storage.entity.PersonEntity;

public interface PersonService {
    PersonEntity savePerson(PersonRequestDto personRequestDto);
}
