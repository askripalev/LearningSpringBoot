package su.woland.learningspringboot.service.mapper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.Person;
import su.woland.learningspringboot.service.dto.PersonServiceData;

@Component
public class ServicePersistenceMapper {

    public Person toPerson(@NotNull PersonServiceData personServiceData) {
        Person person = new Person();

        person.setName(personServiceData.getName());
        person.setAge(personServiceData.getAge());

        return person;
    }

    public PersonServiceData toPersonServiceData(@NotNull Person person) {
        PersonServiceData personServiceData = new PersonServiceData();

        personServiceData.setId(person.getId());
        personServiceData.setName(person.getName());
        personServiceData.setAge(person.getAge());

        return personServiceData;
    }

}
