package com.silva.foodapi.notificacao;

import com.silva.foodapi.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}