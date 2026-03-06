package com.list.empretimo.responsesDTO;

import com.list.empretimo.entities.Loan;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class LoanResponseDTO {

    private LocalDate lonDate;
    private LocalDate returnDate;

    public LoanResponseDTO(Loan loan) {
        this.lonDate = loan.getLonDate();
        this.returnDate = loan.getReturnDate();
    }
}
