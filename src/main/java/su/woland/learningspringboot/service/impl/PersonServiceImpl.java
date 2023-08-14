package su.woland.learningspringboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;
import su.woland.learningspringboot.storage.entity.PersonEntity;
import su.woland.learningspringboot.storage.repository.PersonRepository;
import su.woland.learningspringboot.service.PersonService;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonResponseDto savePerson(PersonRequestDto personRequestDto) {
        PersonEntity personEntity = new PersonEntity();
        PersonResponseDto response = new PersonResponseDto();

        personEntity.setName(personRequestDto.getName());
        personEntity.setAge(personRequestDto.getAge());

        // Here will be shadowing. Is it okay?
        personEntity = personRepository.save(personEntity);

        response.setId(personEntity.getId());
        response.setName(personEntity.getName());
        response.setAge(personEntity.getAge());

        return response;
    }

}
