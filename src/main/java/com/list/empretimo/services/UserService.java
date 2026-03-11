package com.list.empretimo.services;

import com.list.empretimo.entities.User;
import com.list.empretimo.repositories.LoanRepository;
import com.list.empretimo.repositories.UserRepository;
import com.list.empretimo.responsesDTO.UserResponseDTO;
import com.list.empretimo.resquestsDTO.UserRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final LoanRepository loanRepository;

    public UserService(UserRepository userRepository, LoanRepository loanRepository) {
        this.userRepository = userRepository;
        this.loanRepository = loanRepository;
    }

    public String newUser(UserRequestDTO dto){
        User user = new User(dto);
        userRepository.save(user);
        return "User created sucefully";

    }
    public UserResponseDTO getUserById(long id){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User o found"));
        UserResponseDTO userRes = new UserResponseDTO(user);
        return userRes;
    }

    public String updateUser(UserRequestDTO dto, long id){
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User o found"));
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        userRepository.save(user);
        return "update sucefully";
    }

    public String deleteUserById(long id){
        if (userRepository.existsById(id)){
            userRepository.deleteById(id);
            return "User deleted sucefully";
        }else {
            return "User not found";
        }
    }
}
