package com.silva.foodapi.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

   public AtivacaoClienteService  ativacaoClienteService(){
        return new AtivacaoClienteService();
    }
}
