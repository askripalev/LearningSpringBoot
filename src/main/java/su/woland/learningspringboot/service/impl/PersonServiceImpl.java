package su.woland.learningspringboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;
import su.woland.learningspringboot.converter.PersonConverter;
import su.woland.learningspringboot.storage.repository.PersonRepository;
import su.woland.learningspringboot.service.PersonService;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonResponseDto savePerson(PersonRequestDto personRequestDto) {
        PersonConverter personConverter = new PersonConverter();

        return personConverter.entityToResponse(personRepository.save(personConverter.requestToEntity(personRequestDto)));
    }

}
