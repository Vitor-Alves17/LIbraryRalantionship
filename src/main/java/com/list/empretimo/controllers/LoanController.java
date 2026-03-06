package com.list.empretimo.controllers;

import com.list.empretimo.responsesDTO.UserResponseDTO;
import com.list.empretimo.resquestsDTO.UserRequestDTO;
import com.list.empretimo.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LoanController {

    private final UserService userService;

    public LoanController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/getusers")
//    public List<UserResponseDTO> getUsers() {
//        return userService.getUser();
//    }
    @PostMapping("/user/cadatrar")
    public ResponseEntity<?> addUser(@Valid @RequestBody UserRequestDTO userRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.newUser(userRequestDTO));
    }
    @PutMapping("/user/update/{id}")
    public ResponseEntity<?> updateUser(@PathVariable long id, @Valid @RequestBody UserRequestDTO userRequestDTO) {
        return ResponseEntity.ok(userService.updateUser(userRequestDTO, id));
    }
    @DeleteMapping("user/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        return ResponseEntity.ok(userService.deleteUserById(id));
    }
}
