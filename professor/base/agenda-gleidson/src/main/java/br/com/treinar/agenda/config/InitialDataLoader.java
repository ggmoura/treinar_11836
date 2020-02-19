package br.com.treinar.agenda.config;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.treinar.agenda.model.Contato;
import br.com.treinar.agenda.model.Email;
import br.com.treinar.agenda.model.Provedor;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Email e = new Email();
		e.setProvedor(Provedor.GMAIL);
		e.setDescricao("mariavalentina@gmail.com");
		
		
		Contato c = new Contato();
		c.setDataNascimento(new Date());
		c.setEmails(Arrays.asList(e));
		c.setNome("Maria Sophia");
		
		e.setContato(c);
		
		entityManager.persist(c);
		
		
		
		Contato d = entityManager.find(Contato.class, 1L);
		
		System.out.println(d);
		
	}

	
}
