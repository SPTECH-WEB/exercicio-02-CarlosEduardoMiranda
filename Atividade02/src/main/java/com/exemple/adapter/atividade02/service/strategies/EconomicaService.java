package com.exemple.adapter.atividade02.service.strategies;

import com.exemple.adapter.atividade02.repository.FreteRepository;
import org.springframework.stereotype.Component;

@Component
public class EconomicaService implements FreteRepository {
    @Override
    public double calcular(double peso){
        return peso * 0.5;
    }

    @Override
    public String modalidade(){
        return "economica";
    }
}
