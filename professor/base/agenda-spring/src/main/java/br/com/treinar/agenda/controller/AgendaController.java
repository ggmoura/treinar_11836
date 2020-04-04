package br.com.treinar.agenda.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinar.agenda.model.Transaction;
import br.com.treinar.agenda.util.ResponseWrapper;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

	@GetMapping
	public ResponseEntity<ResponseWrapper<Transaction>> find() {
		List<Transaction> transactions = new ArrayList<>();
		Transaction t = new Transaction();
		t.setAmount(new BigDecimal("100"));
		t.setAutorizationNumber("10481");
		t.setId(4884L);
		List<String> links = new ArrayList<>();
		links.add("gleidson.gmoura@gmail.com");
		links.add("valentina@gmail.com");
		t.setLinks(links);
		transactions.add(t);
		
		ResponseWrapper<Transaction> resposta = new ResponseWrapper<>();
		resposta.setItems(transactions);
		
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping(path = "/{id}")
	public Transaction findById(@PathVariable("id") long id) {
		Transaction t = new Transaction();
		t.setAmount(new BigDecimal("999"));
		t.setAutorizationNumber("65465465");
		t.setId(48845L);
		List<String> links = new ArrayList<>();
		links.add("gleidson.gmoura@gmail.com");
		links.add("valentina@gmail.com");
		return t;
	}

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public void create(@RequestBody Transaction transaction) {
		System.out.println(transaction);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") long id) {
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Void> update(@PathVariable("id") long id, @RequestBody Transaction transaction) {
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/nsu")
	public Transaction getBayNsu() {
		return null;
	}

}
