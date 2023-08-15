package su.woland.learningspringboot.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;
import su.woland.learningspringboot.controller.mapper.RequestMapper;
import su.woland.learningspringboot.service.PersonService;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;

@AllArgsConstructor
@RestController
public class PersonController implements ErrorController {

    private final PersonService personService;
    private final RequestMapper requestMapper;

    @RequestMapping("/error")
    public String error(HttpServletResponse response) {
        return "Something went wrong: " + response.getStatus();
    }

    @PostMapping("/person")
    public PersonResponseDto save(@RequestBody PersonRequestDto personRequestDto) {
        return requestMapper.fromServiceDto(personService.savePerson(requestMapper.toServiceDto(personRequestDto)));
    }

}
