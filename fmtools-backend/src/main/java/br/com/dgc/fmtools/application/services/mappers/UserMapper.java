package br.com.dgc.fmtools.application.services.mappers;

import org.springframework.stereotype.Component;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.SignInRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.SignInResponseDto;
import br.com.dgc.fmtools.infrastructure.adapters.outbound.persistence.entities.UserEntity;

@Component
public class UserMapper {
    public UserEntity toUserEntity(SignInRequestDto signInRequestDto) {
        return new UserEntity(signInRequestDto.username());
    }

    public SignInResponseDto toSignInResponseDto(UserEntity userEntity) {
        return new SignInResponseDto(userEntity.getId());
    }
}
