package su.woland.learningspringboot.service.mapper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.PersonEntity;
import su.woland.learningspringboot.service.dto.PersonServiceDto;

@Component
public class ServiceMapper {

    public PersonEntity toPersonEntity(@NotNull PersonServiceDto personServiceDto) {
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(personServiceDto.getName());
        personEntity.setAge(personServiceDto.getAge());

        return personEntity;
    }

    public PersonServiceDto toPersonServiceDto(@NotNull PersonEntity personEntity) {
        PersonServiceDto personServiceDto = new PersonServiceDto();

        personServiceDto.setId(personEntity.getId());
        personServiceDto.setName(personEntity.getName());
        personServiceDto.setAge(personEntity.getAge());

        return personServiceDto;
    }

}
