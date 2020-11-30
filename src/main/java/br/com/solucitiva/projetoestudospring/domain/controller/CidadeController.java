package br.com.solucitiva.projetoestudospring.domain.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.solucitiva.projetoestudospring.domain.model.Cidade;
import br.com.solucitiva.projetoestudospring.domain.repository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
public class CidadeController {
	
	private CidadeRepository cidadeRepository;
	
	public CidadeController(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}
	
	@GetMapping
	public List<Cidade> listar(){
		return cidadeRepository.listar();
	}
	
	

}
