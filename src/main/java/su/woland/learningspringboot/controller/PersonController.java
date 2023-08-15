package su.woland.learningspringboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;
import su.woland.learningspringboot.controller.mapper.RequestMapper;
import su.woland.learningspringboot.service.PersonService;

@AllArgsConstructor
@ControllerAdvice
@RestController
public class PersonController {

    private final PersonService personService;
    private final RequestMapper requestMapper;

    @PostMapping("/person")
    public PersonResponseDto save(@RequestBody PersonRequestDto personRequestDto) {
        return requestMapper.fromServiceDto(personService.savePerson(requestMapper.toServiceDto(personRequestDto)));
    }

}
