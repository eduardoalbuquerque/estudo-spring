package br.com.solucitiva.projetoestudospring.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.solucitiva.projetoestudospring.domain.model.Cidade;
import br.com.solucitiva.projetoestudospring.domain.repository.CidadeRepository;

@Service
public class CidadeService {
	
	private CidadeRepository cidadeRepository;
	
	public CidadeService(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}
	
	public List<Cidade> listar(){
		return cidadeRepository.listar();
	}

}
