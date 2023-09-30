package su.woland.learningspringboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import su.woland.learningspringboot.controller.dto.PersonRequest;
import su.woland.learningspringboot.controller.dto.PersonResponse;
import su.woland.learningspringboot.controller.mapper.RequestResponseMapper;
import su.woland.learningspringboot.service.PersonService;
import su.woland.learningspringboot.service.dto.PersonServiceProps;

@AllArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;
    private final RequestResponseMapper requestResponseMapper;

    @PostMapping("/person")
    public PersonResponse person(@RequestBody PersonRequest personRequest) {
        PersonServiceProps personServiceProps = personService.savePerson(requestResponseMapper.toPersonServiceDto(personRequest));

        return requestResponseMapper.toPersonResponseDto(personServiceProps);
    }

}
