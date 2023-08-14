package su.woland.learningspringboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.storage.entity.PersonEntity;
import su.woland.learningspringboot.storage.repository.PersonRepository;
import su.woland.learningspringboot.service.PersonService;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;

    public PersonEntity savePerson(PersonRequestDto personRequestDto) {
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(personRequestDto.getName());
        personEntity.setAge(personRequestDto.getAge());

        return personRepository.save(personEntity);
    }

}
