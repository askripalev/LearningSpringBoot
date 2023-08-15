package su.woland.learningspringboot.persistence.gateway.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersistenceGatewayDto {
    private Long id;
    private String name;
    private Integer age;
}