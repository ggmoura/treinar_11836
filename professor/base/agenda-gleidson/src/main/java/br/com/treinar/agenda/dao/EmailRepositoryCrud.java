package br.com.treinar.agenda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.treinar.agenda.dto.EmailDto;
import br.com.treinar.agenda.model.Email;
import br.com.treinar.agenda.model.Provedor;

public interface EmailRepositoryCrud extends CrudRepository<Email, Long> {

	List<Email> findByProvedor(Provedor provedor);

	@Query(name = "", nativeQuery = true)
	List<EmailDto> recuperarEmailDto();
	
}
