package su.woland.learningspringboot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.persistence.repository.entity.PersonEntity;
import su.woland.learningspringboot.persistence.repository.PersonRepository;

@AllArgsConstructor
@Service
public class DbService {
    private final PersonRepository personRepository;

    public PersonEntity store(String name, String age) {
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(name);
        personEntity.setAge(Integer.parseInt(age));

        return personRepository.save(personEntity);
    }

}
