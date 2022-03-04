package com.silva.foodapi.listener;

import com.silva.foodapi.notificacao.NivelUrgencia;
import com.silva.foodapi.notificacao.Notificador;
import com.silva.foodapi.notificacao.TipoDoNotificador;
import com.silva.foodapi.service.ClienteAtivadoEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvento evento){
    notificador.notificar(evento.getCliente(), " Seu cadastro está ativo!");
    }
}
