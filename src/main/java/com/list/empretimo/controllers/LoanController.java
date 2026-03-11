package com.list.empretimo.controllers;

import com.list.empretimo.responsesDTO.LoanResponseDTO;
import com.list.empretimo.responsesDTO.UserResponseDTO;
import com.list.empretimo.resquestsDTO.LoanRequestDTO;
import com.list.empretimo.resquestsDTO.UserRequestDTO;
import com.list.empretimo.services.LoanService;
import com.list.empretimo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/getloan/{id}")
    public LoanResponseDTO getLoan(@PathVariable long id) {
        return loanService.getLoanById(id);
    }
    @PostMapping("/loan/new/{user_id}")
    public ResponseEntity<?> addLoan(@Valid @RequestBody LoanRequestDTO loanRequestDTO, @PathVariable long user_id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(loanService.newLoan(loanRequestDTO, user_id));
    }
    @PutMapping("/loan/update/{id}")
    public ResponseEntity<?> updateLoan(@PathVariable long id, @Valid @RequestBody LoanRequestDTO loanRequestDTO) {
        return ResponseEntity.ok(loanService.updateReturnDate(loanRequestDTO, id));
    }
    @DeleteMapping("/loan/delete/{id}")
    public ResponseEntity<?> deleteLoan(@PathVariable int id) {
        return ResponseEntity.ok(loanService.deleteLoanById(id));
    }
}
