package com.uninter.aulaweb.demoweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/palavras")
public class PalavraController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/palavra/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "palavra/lista";
	}
}
