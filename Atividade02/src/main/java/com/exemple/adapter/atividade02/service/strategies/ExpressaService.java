package com.exemple.adapter.atividade02.service.strategies;

import com.exemple.adapter.atividade02.repository.FreteRepository;
import org.springframework.stereotype.Component;

@Component
public class ExpressaService implements FreteRepository {
    @Override
    public double calcular(double peso){
        return peso * 2.0;
    }

    @Override
    public String modalidade(){
        return "expressa";
    }
}
