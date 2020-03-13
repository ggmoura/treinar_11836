package br.com.treinar.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.web.controller.IComando;

/**
 * Servlet implementation class TreinarController
 */
@WebServlet("*.trn")
public class TreinarController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao = request.getParameter("acao");

		try {
			Class<?> clazz = Class.forName(acao);
			IComando comando = (IComando) clazz.newInstance();
			String destino = comando.executar(request, response);
			request.getRequestDispatcher(destino).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
