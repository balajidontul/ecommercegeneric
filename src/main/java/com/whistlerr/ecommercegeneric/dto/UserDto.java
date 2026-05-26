package com.whistlerr.ecommercegeneric.dto;

public record UserDto(
        String firstName,
        String lastName,
        String emailId,
        String userPhone,
        String password
) {
}
