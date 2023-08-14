package su.woland.learningspringboot.service;

import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;

public interface PersonService {
    PersonResponseDto savePerson(PersonRequestDto personRequestDto);
}
