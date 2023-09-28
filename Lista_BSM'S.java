package com.generation.listasbsms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bsms")
public class ListaBsmsController {
	
	@GetMapping
	public String listaBsms() {
		return "Persistência, mentalidade de crescimento, Orientação ao futuro, Responsabilidade pessoal, Trabalho em equipe, Comunicação, Orientação aos detalhes e Proatividade";
	}

}
