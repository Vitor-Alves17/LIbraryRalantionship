package com.list.empretimo.responsesDTO;

import com.list.empretimo.entities.Loan;
import com.list.empretimo.entities.User;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class LoanResponseDTO {

    private LocalDate lonDate;
    private LocalDate returnDate;
    private UserResponseDTO user;

    public LoanResponseDTO(Loan loan, UserResponseDTO dto) {
        this.lonDate = loan.getLonDate();
        this.returnDate = loan.getReturnDate();
        this.user = dto;
    }
}
