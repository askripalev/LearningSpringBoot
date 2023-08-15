package su.woland.learningspringboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.persistence.gateway.PersistenceGateway;
import su.woland.learningspringboot.service.PersonService;
import su.woland.learningspringboot.service.dto.PersonServiceDto;
import su.woland.learningspringboot.service.mapper.ServiceMapper;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {
    private final ServiceMapper serviceMapper;
    private final PersistenceGateway persistenceGateway;

    @Override
    public PersonServiceDto savePerson(PersonServiceDto personServiceDto) {
        return serviceMapper.fromPersonEntity(persistenceGateway.savePerson(serviceMapper.toPersonEntity(personServiceDto)));
    }

}
