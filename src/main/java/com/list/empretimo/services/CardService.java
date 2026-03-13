package com.list.empretimo.services;

import com.list.empretimo.entities.CardLibrary;
import com.list.empretimo.entities.User;
import com.list.empretimo.repositories.CardLibraryRepository;
import com.list.empretimo.repositories.UserRepository;
import com.list.empretimo.resquestsDTO.CardRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardLibraryRepository cardRepo;
    private final UserRepository userRepo;

    public CardService(CardLibraryRepository cardRepo, UserRepository userRepo) {
        this.cardRepo = cardRepo;
        this.userRepo = userRepo;
    }

    public String newCard(CardRequestDTO dto, long user_id){
        User user = userRepo.findById(user_id).orElseThrow(() -> new RuntimeException("User not found"));
        CardLibrary card = new CardLibrary(dto);
        card.setUser(user);
        return "Card created sucefully";
    }
}
