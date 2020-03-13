package br.com.treinar.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.web.model.Aluno;

//guarde no escopo de sessao
public class AlunoController implements IComando {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Aluno");
		
		Aluno a = new Aluno();
		a.setNome("Maria Sophia");
		
		request.getParameter("p1");
		request.getParameter("p2");
		request.getParameter("p3");
		request.getParameter("p1");
		request.getParameter("p1");
		request.getParameter("p1");
		request.getParameter("p1");
		request.getParameter("p1");
		request.getParameter("p1");
		
		
		request.setAttribute("aluno", a);
		
		return "/aluno.jsp";
	}

}
