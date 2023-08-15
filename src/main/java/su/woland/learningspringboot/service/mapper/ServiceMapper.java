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

        log.info("toPersonEntity in: " + personServiceDto.getName());
        log.info("toPersonEntity out: " + personEntity.getName());
        return personEntity;
    }

    public PersonServiceDto fromPersonEntity(PersonEntity personEntity) {
        PersonServiceDto personServiceDto = new PersonServiceDto();

        personServiceDto.setId(personEntity.getId());
        personServiceDto.setName(personEntity.getName());
        personServiceDto.setAge(personEntity.getAge());

        log.info("fromPersonEntity in: " + personEntity.getName());
        log.info("fromPersonEntity out: " + personServiceDto.getName());
        return personServiceDto;
    }
}
