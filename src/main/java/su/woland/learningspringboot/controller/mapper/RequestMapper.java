package su.woland.learningspringboot.controller.mapper;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;
import su.woland.learningspringboot.service.dto.PersonServiceDto;

@Log4j2
@Component
public class RequestMapper {
    public PersonServiceDto toServiceDto(PersonRequestDto personRequestDto) {
        PersonServiceDto personServiceDto = new PersonServiceDto();

        personServiceDto.setName(personRequestDto.getName());
        personServiceDto.setAge(personRequestDto.getAge());

        log.info("toServiceDto in: " + personRequestDto.getName());
        log.info("toServiceDto out: " + personServiceDto.getName());
        return personServiceDto;
    }

    public PersonResponseDto fromServiceDto(PersonServiceDto personServiceDto) {
        PersonResponseDto personResponseDto = new PersonResponseDto();

        personResponseDto.setId(personServiceDto.getId());
        personResponseDto.setName(personServiceDto.getName());
        personResponseDto.setAge(personServiceDto.getAge());

        log.info("fromServiceDto in: " + personServiceDto.getName());
        log.info("fromServiceDto out: " + personResponseDto.getName());
        return personResponseDto;
    }
}
