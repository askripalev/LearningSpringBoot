package su.woland.learningspringboot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class PersonErrorController implements ErrorController {

    @RequestMapping("/error")
    String error(HttpServletResponse response) {
        return "Something went wrong: " + response.getStatus();
    }

}