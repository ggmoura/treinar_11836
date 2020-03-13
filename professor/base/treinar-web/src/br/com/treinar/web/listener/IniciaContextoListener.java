package br.com.treinar.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class IniciaContextoListener
 *
 */
@WebListener
public class IniciaContextoListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public IniciaContextoListener() {
    	System.out.println("contexto de minha aplicacao estah sendo inicializado!");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("contexto de minha aplicacao estah sendo finalizado!");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
