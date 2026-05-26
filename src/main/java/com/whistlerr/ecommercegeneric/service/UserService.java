package com.whistlerr.ecommercegeneric.service;

import com.whistlerr.ecommercegeneric.dto.UserDto;
import com.whistlerr.ecommercegeneric.entity.UserEntity;
import com.whistlerr.ecommercegeneric.model.UserModel;
import com.whistlerr.ecommercegeneric.repository.UserRepository;
import com.whistlerr.ecommercegeneric.util.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean registerNewUser(UserModel userModel){

        UserDto userDto = new UserDto(userModel.getFirstName(),
                userModel.getLastName(),
                userModel.getEmailId(),
                userModel.getUserPhone(),
                userModel.getPassword());

        UserEntity userEntity =  UserEntity.builder()
                .first_name(userDto.firstName())
                .last_name(userDto.lastName())
                .email_id(userDto.emailId())
                .user_phone(userDto.userPhone())
                .password_hash(userDto.password())
                .user_role(UserRole.APP_USER)
                .user_status("ACTIVE")
                .created_dt(String.valueOf(System.currentTimeMillis()))
                .updated_dt(String.valueOf(System.currentTimeMillis()))
                .build();

        return userRepository.save(userEntity) == userEntity;
    }
}
