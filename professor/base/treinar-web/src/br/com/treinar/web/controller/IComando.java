package br.com.treinar.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IComando {

	String executar(HttpServletRequest request, HttpServletResponse response);

}
