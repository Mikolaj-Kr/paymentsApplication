package com.krawczak.netflixPayments.service;

import com.krawczak.netflixPayments.domain.dto.UsersDto;
import com.krawczak.netflixPayments.domain.entity.Users;
import com.krawczak.netflixPayments.mapper.MapUserToDto;
import com.krawczak.netflixPayments.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  @Autowired
  MapUserToDto mapUserToDto;

  public Users findUserByUsername(String username) {
    return userRepository.findUsersByUsername(username);
  }

  public List<UsersDto> findAllUsers() {
    List<UsersDto> usersDtoList = new ArrayList<>();
    userRepository.findAll().forEach(users -> usersDtoList.add(mapUserToDto.userToDto(users)));
    return usersDtoList;
  }

  public void confirmAccount(String username) {
  Users user = findUserByUsername(username);
  user.setEnabled(1);
  saveUser(user);
  }

  public Users findUserByPasswordCode(Long code){
    return userRepository.findUsersByChangePasswordCode(code);
  }

  public void saveUser(Users users) {
    userRepository.save(users);
  }
}
