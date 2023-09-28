package su.woland.learningspringboot.service.mapper;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.PersonEntity;
import su.woland.learningspringboot.service.dto.PersonServiceDto;

@Log4j2
@Component
public class ServiceMapper {
    public PersonEntity toPersonEntity(PersonServiceDto personServiceDto) {
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(personServiceDto.getName());
        personEntity.setAge(personServiceDto.getAge());

        return personEntity;
    }

    public PersonServiceDto toPersonServiceDto(PersonEntity personEntity) {
        PersonServiceDto personServiceDto = new PersonServiceDto();

        personServiceDto.setId(personEntity.getId());
        personServiceDto.setName(personEntity.getName());
        personServiceDto.setAge(personEntity.getAge());

        return personServiceDto;
    }
}
