package su.woland.learningspringboot.controller.mapper;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;
import su.woland.learningspringboot.service.dto.PersonServiceDto;

@Component
public class RequestMapper {

    public PersonServiceDto toServiceDto(@NotNull PersonRequestDto personRequestDto) {
        PersonServiceDto personServiceDto = new PersonServiceDto();

        personServiceDto.setName(personRequestDto.getName());
        personServiceDto.setAge(personRequestDto.getAge());

        return personServiceDto;
    }

    public PersonResponseDto toPersonResponseDto(@NotNull PersonServiceDto personServiceDto) {
        PersonResponseDto personResponseDto = new PersonResponseDto();

        personResponseDto.setId(personServiceDto.getId());
        personResponseDto.setName(personServiceDto.getName());
        personResponseDto.setAge(personServiceDto.getAge());

        return personResponseDto;
    }

}
