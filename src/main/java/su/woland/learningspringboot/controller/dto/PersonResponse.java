package su.woland.learningspringboot.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonResponse {

    private Long id;
    private String name;
    private Integer age;

}
