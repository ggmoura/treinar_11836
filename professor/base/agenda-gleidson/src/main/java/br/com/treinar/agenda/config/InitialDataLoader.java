package br.com.treinar.agenda.config;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.treinar.agenda.dao.ContatoRepository;
import br.com.treinar.agenda.dao.EmailRepository;
import br.com.treinar.agenda.dao.EmailRepositoryCrud;
import br.com.treinar.agenda.dto.EmailDto;
import br.com.treinar.agenda.model.Contato;
import br.com.treinar.agenda.model.Email;
import br.com.treinar.agenda.model.Provedor;

@Component
public class InitialDataLoader implements ApplicationListener<ContextRefreshedEvent> {

	
	@Value("${agenda.database.usuario}")
	private String usuario;
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private EmailRepository emailRepository;
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private EmailRepositoryCrud emailRepositoryCrud;
	
	

	@Override
	@Transactional
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(usuario);
		Email e = new Email();
		e.setProvedor(Provedor.GMAIL);
		e.setDescricao("mariavalentina@gmail.com");
		
		entityManager.merge(e);
		e.setDescricao("batata0@frita.com");
		entityManager.merge(e);
		e.setDescricao("batata1@frita.com");
		entityManager.merge(e);
		e.setDescricao("batata2@frita.com");
		entityManager.merge(e);
		e.setDescricao("batata3@frita.com");
		
		
		Contato c = new Contato();
		c.setDataNascimento(new Date());
		c.setEmails(Arrays.asList(e));
		c.setNome("Maria Sophia");
		
		e.setContato(c);
		
		entityManager.persist(c);
		
		emailRepositoryCrud.findById(1L);
		
		Contato d = entityManager.find(Contato.class, 1L);
		
		System.out.println(d);
		
		List<EmailDto> emails = emailRepository.findAll0();

		System.out.println(emails);
		
		System.out.println(contatoRepository.findAll());
		
	}

	
	
	
}
