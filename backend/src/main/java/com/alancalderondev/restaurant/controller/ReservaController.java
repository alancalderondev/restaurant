package com.alancalderondev.restaurant.controller;

import com.alancalderondev.restaurant.model.Reserva;
import com.alancalderondev.restaurant.service.ReservaService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    private final ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping
    public List<Reserva> findAll() {
        return reservaService.findAll();
    }

    @PostMapping
    public Reserva saveReserva(@RequestBody Reserva reserva) {
        return reservaService.saveReserva(reserva);
    }
    
}
