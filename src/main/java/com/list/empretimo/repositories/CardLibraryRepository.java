package com.list.empretimo.repositories;

import com.list.empretimo.entities.CardLibrary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardLibraryRepository extends JpaRepository<CardLibrary, Long> {
}
