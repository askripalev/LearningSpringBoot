package su.woland.learningspringboot.controller.mapper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.controller.dto.PersonRequest;
import su.woland.learningspringboot.controller.dto.PersonResponse;
import su.woland.learningspringboot.service.dto.PersonServiceData;

@Component
public class RequestResponseMapper {

    public PersonServiceData toPersonServiceDto(@NotNull PersonRequest personRequest) {
        PersonServiceData personServiceData = new PersonServiceData();

        personServiceData.setName(personRequest.getName());
        personServiceData.setAge(personRequest.getAge());

        return personServiceData;
    }

    public PersonResponse toPersonResponseDto(@NotNull PersonServiceData personServiceData) {
        PersonResponse personResponse = new PersonResponse();

        personResponse.setId(personServiceData.getId());
        personResponse.setName(personServiceData.getName());
        personResponse.setAge(personServiceData.getAge());

        return personResponse;
    }

}
