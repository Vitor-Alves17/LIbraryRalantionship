package com.list.empretimo.resquestsDTO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardRequestDTO {

    private long cardNumber;
    private LocalDate emissionDate;
    private boolean isValid;
}
