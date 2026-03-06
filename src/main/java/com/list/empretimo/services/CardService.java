package com.list.empretimo.services;

import com.list.empretimo.entities.CardLibrary;
import com.list.empretimo.repositories.CardLibraryRepository;
import com.list.empretimo.resquestsDTO.CardRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardLibraryRepository cardRepo;

    public CardService(CardLibraryRepository cardRepo) {
        this.cardRepo = cardRepo;
    }

    public String newWallet(CardRequestDTO dto){
        CardLibrary wallet = new CardLibrary(dto);
        return "Card created sucefully";
    }
}
