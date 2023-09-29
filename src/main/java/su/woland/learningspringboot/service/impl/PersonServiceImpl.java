package su.woland.learningspringboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.persistence.entity.Person;
import su.woland.learningspringboot.persistence.gateway.PersistenceGateway;
import su.woland.learningspringboot.service.PersonService;
import su.woland.learningspringboot.service.dto.PersonServiceData;
import su.woland.learningspringboot.service.mapper.ServicePersistenceMapper;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final ServicePersistenceMapper servicePersistenceMapper;
    private final PersistenceGateway persistenceGateway;

    @Override
    public PersonServiceData savePerson(PersonServiceData personServiceData) {
        Person person = persistenceGateway.savePerson(servicePersistenceMapper.toPerson(personServiceData));

        return servicePersistenceMapper.toPersonServiceData(person);
    }

}
