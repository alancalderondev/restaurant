package com.alancalderondev.restaurant.repository;

import com.alancalderondev.restaurant.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
}
