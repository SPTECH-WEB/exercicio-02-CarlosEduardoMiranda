package com.exemple.adapter.atividade02.service.adapters;

import com.exemple.adapter.atividade02.repository.FreteRepository;
import com.exemple.adapter.atividade02.service.strategies.TransportadoraService;
import org.springframework.stereotype.Service;

public class TransportadoraExternaService {
    @Service("transportadoraExterna")
    public class transportadoraexternaservice implements FreteRepository {
        private final TransportadoraService transportadoraService;

        public transportadoraexternaservice() {
            transportadoraService = new TransportadoraService();
        }

        @Override
        public double calcular(double peso) {
            System.out.println("Calculando frete com transportadora externa...");
            return transportadoraService.calcular(peso) * 1.2;
        }

        @Override
        public String modalidade() {
            return "transportadoraExterna";
        }
    }

}
