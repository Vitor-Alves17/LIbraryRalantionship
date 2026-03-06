package com.list.empretimo.entities;

import com.list.empretimo.resquestsDTO.UserRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private CardLibrary card;

    @OneToMany(mappedBy = "user")
    List<Loan> loans;

    public User(UserRequestDTO dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
    }
}
