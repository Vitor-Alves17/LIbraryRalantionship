package com.list.empretimo.entities;

import com.list.empretimo.resquestsDTO.LoanRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate lonDate;
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Loan(LoanRequestDTO dto) {
        this.lonDate = LocalDate.now();
        this.returnDate = dto.getReturnDate();
    }
}
