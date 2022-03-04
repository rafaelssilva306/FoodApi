package com.silva.foodapi.service;

import com.silva.foodapi.modelo.Cliente;

public class ClienteAtivadoEvento {

    private Cliente cliente;

    public ClienteAtivadoEvento(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
