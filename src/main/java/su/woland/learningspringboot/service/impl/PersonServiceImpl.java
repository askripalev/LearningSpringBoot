package su.woland.learningspringboot.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import su.woland.learningspringboot.persistence.entity.Person;
import su.woland.learningspringboot.persistence.gateway.PersistenceGateway;
import su.woland.learningspringboot.service.PersonService;
import su.woland.learningspringboot.service.dto.PersonServiceProps;
import su.woland.learningspringboot.service.mapper.ServicePersistenceMapper;

@AllArgsConstructor
@Service
public class PersonServiceImpl implements PersonService {

    private final ServicePersistenceMapper servicePersistenceMapper;
    private final PersistenceGateway persistenceGateway;

    @Override
    public PersonServiceProps savePerson(PersonServiceProps personServiceProps) {
        Person person = persistenceGateway.savePerson(servicePersistenceMapper.toPerson(personServiceProps));

        return servicePersistenceMapper.toPersonServiceProps(person);
    }

}
