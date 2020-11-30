package br.com.solucitiva.projetoestudospring.infrastructure;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.solucitiva.projetoestudospring.domain.model.Cidade;
import br.com.solucitiva.projetoestudospring.domain.repository.CidadeRepository;

@Repository
public class CidadeImplement implements CidadeRepository {

	@Override
	public List<Cidade> listar() {
		return List.of(new Cidade(1l, "Natal"), new Cidade(2l, "Mossoró"));
	}

}
