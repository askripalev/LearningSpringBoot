package su.woland.learningspringboot.controller.mapper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.controller.dto.PersonRequest;
import su.woland.learningspringboot.controller.dto.PersonResponse;
import su.woland.learningspringboot.service.dto.PersonServiceProps;

@Component
public class RequestResponseMapper {

    public PersonServiceProps toPersonServiceDto(@NotNull PersonRequest personRequest) {
        PersonServiceProps personServiceProps = new PersonServiceProps();

        personServiceProps.setName(personRequest.getName());
        personServiceProps.setAge(personRequest.getAge());

        return personServiceProps;
    }

    public PersonResponse toPersonResponseDto(@NotNull PersonServiceProps personServiceProps) {
        PersonResponse personResponse = new PersonResponse();

        personResponse.setId(personServiceProps.getId());
        personResponse.setName(personServiceProps.getName());
        personResponse.setAge(personServiceProps.getAge());

        return personResponse;
    }

}
