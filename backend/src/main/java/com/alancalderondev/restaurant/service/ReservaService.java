package com.alancalderondev.restaurant.service;

import com.alancalderondev.restaurant.model.Reserva;
import com.alancalderondev.restaurant.repository.ReservaRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaService(ReservaRepository reservaRepository) {
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
    
}
