package com.list.empretimo.resquestsDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoanRequestDTO {

    private LocalDate lonDate;
    private LocalDate returnDate;
}
