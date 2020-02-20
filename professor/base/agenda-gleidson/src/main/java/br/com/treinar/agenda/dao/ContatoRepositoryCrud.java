package br.com.treinar.agenda.dao;

import org.springframework.data.repository.Repository;

import br.com.treinar.agenda.model.Contato;

public interface ContatoRepositoryCrud extends Repository<Contato, Long> {

	Contato save(Contato c);
	
	default void salvar(Contato c) {
		
	}
	
}
