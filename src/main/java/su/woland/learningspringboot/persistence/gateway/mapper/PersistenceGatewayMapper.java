package su.woland.learningspringboot.persistence.gateway.mapper;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.entity.PersonEntity;
import su.woland.learningspringboot.persistence.gateway.dto.PersistenceGatewayDto;

@Log4j2
@Component
public class PersistenceGatewayMapper {
    public PersonEntity toEntity(PersistenceGatewayDto persistenceGatewayDto) {
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(persistenceGatewayDto.getName());
        personEntity.setAge(persistenceGatewayDto.getAge());

        log.info("toEntity in: " + persistenceGatewayDto.getName());
        log.info("toEntity out: " + personEntity.getName());
        return personEntity;
    }

    public PersistenceGatewayDto fromEntity(PersonEntity personEntity) {
        PersistenceGatewayDto personResponseDto = new PersistenceGatewayDto();

        personResponseDto.setId(personEntity.getId());
        personResponseDto.setName(personEntity.getName());
        personResponseDto.setAge(personEntity.getAge());

        log.info("fromEntity in: " + personEntity.getName());
        log.info("fromEntity out: " + personResponseDto.getName());
        return personResponseDto;
    }
}
