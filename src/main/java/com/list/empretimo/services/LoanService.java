package com.list.empretimo.services;

import com.list.empretimo.entities.Loan;
import com.list.empretimo.entities.User;
import com.list.empretimo.repositories.LoanRepository;
import com.list.empretimo.repositories.UserRepository;
import com.list.empretimo.responsesDTO.LoanResponseDTO;
import com.list.empretimo.responsesDTO.UserResponseDTO;
import com.list.empretimo.resquestsDTO.LoanRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private final LoanRepository loanRepository;
    private final UserRepository userRepository;

    public LoanService(LoanRepository loanRepository, UserRepository userRepository) {
        this.loanRepository = loanRepository;
        this.userRepository = userRepository;
    }

    public String newLoan(LoanRequestDTO dto, long user_id){
        User user = userRepository.findById(user_id).orElseThrow(() -> new RuntimeException("User o found"));
        Loan loan = new Loan(dto);
        loan.setUser(user);
        loanRepository.save(loan);
        return "Loan created sucefully";

    }
    public LoanResponseDTO getLoanById(long id){
        Loan loan = loanRepository.findById(id).orElseThrow(() -> new RuntimeException("User o found"));
        UserResponseDTO userR = new UserResponseDTO(loan.getUser());
        LoanResponseDTO loanRes = new LoanResponseDTO(loan, userR);
        return loanRes;
    }

    public String updateReturnDate(LoanRequestDTO dto, long id){
        Loan loan = loanRepository.findById(id).orElseThrow(() -> new RuntimeException("User o found"));
        loan.setReturnDate(dto.getReturnDate());
        loanRepository.save(loan);
        return "update sucefully";
    }

    public String deleteLoanById(long id){
        if (loanRepository.existsById(id)){
            loanRepository.deleteById(id);
            return "Loan deleted sucefully";
        }else {
            return "Loan not found";
        }
    }
}
