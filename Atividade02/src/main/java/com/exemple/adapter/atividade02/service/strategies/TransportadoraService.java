package com.exemple.adapter.atividade02.service.strategies;

import com.exemple.adapter.atividade02.repository.FreteRepository;
import org.springframework.stereotype.Component;

@Component
public class TransportadoraService implements FreteRepository {
    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }

    @Override
    public String modalidade() {
        return "transportadora";
    }
}