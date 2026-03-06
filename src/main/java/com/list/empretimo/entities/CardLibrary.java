package com.list.empretimo.entities;

import com.list.empretimo.resquestsDTO.CardRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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
public class CardLibrary {

    @Id
    private long id;
    private long cardNumber;
    private LocalDate emissionDate;
    private boolean isValid;

    @OneToOne
    @MapsId
    private User user;

    public CardLibrary(CardRequestDTO dto) {
        this.cardNumber = dto.getCardNumber();
        this.emissionDate = LocalDate.now();
        this.isValid = dto.isValid();
    }
}
