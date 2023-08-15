package su.woland.learningspringboot.service.mapper;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.gateway.dto.PersistenceGatewayDto;
import su.woland.learningspringboot.service.dto.PersonServiceDto;

@Log4j2
@Component
public class ServiceMapper {
    public PersistenceGatewayDto toPersistenceGatewayDto(PersonServiceDto personServiceDto) {
        PersistenceGatewayDto persistenceGatewayDto = new PersistenceGatewayDto();

        persistenceGatewayDto.setName(personServiceDto.getName());
        persistenceGatewayDto.setAge(personServiceDto.getAge());

        log.info("toPersistenceGatewayDto in: " + personServiceDto.getName());
        log.info("toPersistenceGatewayDto out: " + persistenceGatewayDto.getName());
        return persistenceGatewayDto;
    }

    public PersonServiceDto fromPersistenceGatewayDto(PersistenceGatewayDto persistenceGatewayDto) {
        PersonServiceDto personServiceDto = new PersonServiceDto();

        personServiceDto.setId(persistenceGatewayDto.getId());
        personServiceDto.setName(persistenceGatewayDto.getName());
        personServiceDto.setAge(persistenceGatewayDto.getAge());

        log.info("fromPersistenceGatewayDto in: " + persistenceGatewayDto.getName());
        log.info("fromPersistenceGatewayDto out: " + personServiceDto.getName());
        return personServiceDto;
    }
}
