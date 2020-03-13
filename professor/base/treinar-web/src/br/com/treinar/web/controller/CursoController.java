package br.com.treinar.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CursoController implements IComando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Professor");
		return "/curso.jsp";
	}

}