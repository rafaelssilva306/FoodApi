package com.silva.foodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.silva.foodapi.modelo.Cliente;
import com.silva.foodapi.service.AtivacaoClienteService;

@Controller
public class ControllerExample {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public ControllerExample(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController: " + ativacaoClienteService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente joao = new Cliente("João", "joao@gmail.com", "3499951400");
		
		ativacaoClienteService.ativar(joao);
			
				
		return "Hello!";
	}
}
