package com.list.empretimo.responsesDTO;

import com.list.empretimo.entities.Loan;
import com.list.empretimo.entities.User;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class LoanResponseDTO {

    private LocalDate lonDate;
    private LocalDate returnDate;
    private User user;

    public LoanResponseDTO(Loan loan) {
        this.lonDate = loan.getLonDate();
        this.returnDate = loan.getReturnDate();
        this.user = loan.getUser();
    }
}
