package com.list.empretimo.controllers;

import com.list.empretimo.resquestsDTO.CardRequestDTO;
import com.list.empretimo.services.CardService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/card/new")
    public ResponseEntity<?> addCard(@Valid @RequestBody CardRequestDTO cardRequestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(cardService.newCard(cardRequestDTO));
    }
}
