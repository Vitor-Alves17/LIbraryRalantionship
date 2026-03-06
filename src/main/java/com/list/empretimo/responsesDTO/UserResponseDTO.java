package com.list.empretimo.responsesDTO;

import com.list.empretimo.entities.User;
import lombok.Getter;

@Getter
public class UserResponseDTO {

    private String name;
    private String email;

    public UserResponseDTO(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
