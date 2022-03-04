package com.silva.foodapi.service;

import com.silva.foodapi.notificacao.NivelUrgencia;
import com.silva.foodapi.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.silva.foodapi.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class AtivacaoClienteService {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	public void ativar(Cliente cliente){
		cliente.ativar();

		//"Seu cadastro está ativo!"
		eventPublisher.publishEvent(new ClienteAtivadoEvento(cliente));
	}
}
