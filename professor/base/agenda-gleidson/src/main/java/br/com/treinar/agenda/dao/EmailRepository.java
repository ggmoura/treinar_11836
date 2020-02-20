package br.com.treinar.agenda.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.treinar.agenda.dto.EmailDto;
import br.com.treinar.agenda.model.Email;
import br.com.treinar.agenda.model.Provedor;

@Component
public class EmailRepository  {

	@Autowired
	private EntityManager entityManager;
	
	
	public Email save(Email contato) {
		entityManager.persist(contato);
		return contato;
	}
	
	public List<Email> findAll() {
		List<Email> emails = entityManager.createQuery("SELECT e FROM Email e", Email.class).getResultList();
		entityManager.createNativeQuery("select * from contato");
		
		return emails;
	}
	
	public List<EmailDto> findAll0() {
		List<EmailDto> emails = entityManager.createQuery("SELECT new br.com.treinar.agenda.dto.EmailDto(e.descricao, e.provedor) FROM Email e", EmailDto.class).getResultList();
		return emails;
	}
	
	public List<Email> findAll2() {
		List<Email> emails = entityManager.createNamedQuery("Email.LISTA_EMAILS_GMAIL", Email.class).getResultList();
		return emails;
	}
	
	public List<Email> findAll3() {
		TypedQuery<Email> query = entityManager.createNamedQuery("Email.LISTA_EMAILS_PROVEDOR", Email.class);
		query.setParameter("provedor", Provedor.GMAIL);
		List<Email> emails = query.getResultList();
		return emails;
	}

}
