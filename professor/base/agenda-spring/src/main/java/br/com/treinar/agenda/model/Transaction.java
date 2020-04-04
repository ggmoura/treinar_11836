package br.com.treinar.agenda.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Transaction {

	private Long id;
	private String nsu;
	private String autorizationNumber;
	private LocalDateTime transactionDate;
	private BigDecimal amount;
	private String type;
	private List<String> links;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNsu() {
		return nsu;
	}

	public void setNsu(String nsu) {
		this.nsu = nsu;
	}

	public String getAutorizationNumber() {
		return autorizationNumber;
	}

	public void setAutorizationNumber(String autorizationNumber) {
		this.autorizationNumber = autorizationNumber;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getLinks() {
		return links;
	}

	public void setLinks(List<String> links) {
		this.links = links;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", nsu=" + nsu + ", autorizationNumber=" + autorizationNumber
				+ ", transactionDate=" + transactionDate + ", amount=" + amount + ", type=" + type + ", links=" + links
				+ "]";
	}
	
	

}