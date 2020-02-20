package br.com.treinar.agenda.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.treinar.agenda.dto.ContatoDto;
import br.com.treinar.agenda.model.Contato;

@Component
public class ContatoRepository  {

	@Autowired
	private EntityManager entityManager;
	
	public List<ContatoDto> findAll() {
		List<ContatoDto> emails = entityManager.createQuery("SELECT new br.com.treinar.agenda.dto.ContatoDto(e.contato.nome, e.descricao) FROM Email e", ContatoDto.class).getResultList();
		return emails;
	}
	
	public Contato save(Contato contato) {
		entityManager.persist(contato);
		return contato;
	}

}
