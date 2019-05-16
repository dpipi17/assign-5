package web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import account_manager.AccountManager;

/**
 * Application Lifecycle Listener implementation class WebListenerClass
 *
 */
@WebListener
public class WebListenerClass implements ServletContextListener {

	private AccountManager aM;
    /**
     * Default constructor. 
     */
    public WebListenerClass() {
    	aM = new AccountManager();
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
     
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	sce.getServletContext().setAttribute("accountManager", aM);
    }
	
}
