package su.woland.learningspringboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import su.woland.learningspringboot.persistence.repository.entity.PersonEntity;
import su.woland.learningspringboot.service.DbService;

@AllArgsConstructor
@RestController
public class MyController {

    private final DbService dbService;

    @GetMapping("/db/{name}/{age}")
    public PersonEntity json(@PathVariable String name, @PathVariable String age) {
        return dbService.store(name, age);
    }
}
