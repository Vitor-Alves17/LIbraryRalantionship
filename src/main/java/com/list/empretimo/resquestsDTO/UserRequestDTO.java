package com.list.empretimo.resquestsDTO;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserRequestDTO {

    private String name;
    @NotBlank(message = "You must to add a email")
    private String email;
}
