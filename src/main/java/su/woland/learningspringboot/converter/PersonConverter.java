package su.woland.learningspringboot.converter;

import org.springframework.stereotype.Component;
import su.woland.learningspringboot.controller.dto.PersonRequestDto;
import su.woland.learningspringboot.controller.dto.PersonResponseDto;
import su.woland.learningspringboot.storage.entity.PersonEntity;

@Component
public class PersonConverter {
    public PersonEntity requestToEntity(PersonRequestDto personRequestDto) {
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(personRequestDto.getName());
        personEntity.setAge(personRequestDto.getAge());

        return personEntity;
    }

    public PersonResponseDto entityToResponse(PersonEntity personEntity) {
        PersonResponseDto personResponseDto = new PersonResponseDto();

        personResponseDto.setId(personEntity.getId());
        personResponseDto.setName(personEntity.getName());
        personResponseDto.setAge(personEntity.getAge());

        return personResponseDto;
    }
}
