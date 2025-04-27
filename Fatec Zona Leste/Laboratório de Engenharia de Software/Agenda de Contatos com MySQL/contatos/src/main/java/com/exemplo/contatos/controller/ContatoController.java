package com.exemplo.contatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.contatos.model.Contato;
import com.exemplo.contatos.repository.ContatoRepository;

@RestController
@RequestMapping("/contatos")
@CrossOrigin(origins = "*")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@PostMapping
	public Contato criarContato(@RequestBody Contato contato) {
		System.out.println(contato.getNome() + ", " + contato.getTelefone());
		return contatoRepository.save(contato);
	}
	
	@GetMapping
	public List<Contato> listarContatos() {
		return contatoRepository.findAll();
	}
}
