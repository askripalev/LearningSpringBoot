package su.woland.learningspringboot.service.mapper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.Person;
import su.woland.learningspringboot.service.dto.PersonServiceProps;

@Component
public class ServicePersistenceMapper {

    public Person toPerson(@NotNull PersonServiceProps personServiceProps) {
        Person person = new Person();

        person.setName(personServiceProps.getName());
        person.setAge(personServiceProps.getAge());

        return person;
    }

    public PersonServiceProps toPersonServiceProps(@NotNull Person person) {
        PersonServiceProps personServiceProps = new PersonServiceProps();

        personServiceProps.setId(person.getId());
        personServiceProps.setName(person.getName());
        personServiceProps.setAge(person.getAge());

        return personServiceProps;
    }

}
