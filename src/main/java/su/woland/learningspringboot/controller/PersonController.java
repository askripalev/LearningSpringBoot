package su.woland.learningspringboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import su.woland.learningspringboot.service.PersonService;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;

@AllArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;

    @PostMapping("person")
    public PersonResponseDto save(@RequestBody PersonRequestDto personRequestDto) {
        return personService.savePerson(personRequestDto);
    }

}
