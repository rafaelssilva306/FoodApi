package com.silva.foodapi.listener;

import com.silva.foodapi.service.ClienteAtivadoEvento;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvento evento){
        System.out.println("Emitindo nota fiscal para " + evento.getCliente().getNome());
    }
}
