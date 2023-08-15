package su.woland.learningspringboot.persistence.gateway;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.persistence.gateway.dto.PersistenceGatewayDto;
import su.woland.learningspringboot.persistence.gateway.mapper.PersistenceGatewayMapper;
import su.woland.learningspringboot.persistence.PersonRepository;

@Component
@AllArgsConstructor
public class PersistenceGateway {
    PersistenceGatewayMapper persistenceGatewayMapper;
    PersonRepository personRepository;

    public PersistenceGatewayDto savePerson(PersistenceGatewayDto persistenceGatewayDto) {
        return persistenceGatewayMapper.fromEntity(personRepository.save(persistenceGatewayMapper.toEntity(persistenceGatewayDto)));
    }
}
