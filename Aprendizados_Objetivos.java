package com.generation.aprendizadoseobjetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizados-e-objetivos")
public class AprendizadosObjetivosController {
	
	@GetMapping
	public String aprendizadosEObjetivos() {
		return "Banco de Dados.sql, Mentorias, Peatch, Seção de empregabilidade, Introdução ao Spring Boot, e meu objetivo é aplicar tudo o que eu aprendo no dia a dia para que eu possa aprender e desenvolver melhor minhas habilidades";
	}

	
}
