package br.com.treinar.controller;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.model.Sexo;

@ApplicationScoped
@ManagedBean(name = "treinar")
public class TreinarApplicationScope {
	private List<Sexo> sexos;
	
	public TreinarApplicationScope() {
		sexos = Arrays.asList(Sexo.values());
	}
	
	public List<Sexo> getSexos() {
		return sexos;
	}

	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}
}
