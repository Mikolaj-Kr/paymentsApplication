package com.krawczak.netflixPayments.mapper;

import com.krawczak.netflixPayments.domain.dto.UserDto;
import com.krawczak.netflixPayments.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class MapUserToDto {



  public UserDto userToDto(User user){
    UserDto userDto = new UserDto();

    userDto.setId(user.getId());
    userDto.setLogin(user.getEmail());
    userDto.setName(user.getName());
    userDto.setSurname(user.getSurname());
    userDto.setPassword(user.getPassword());

    return userDto;
  }

}