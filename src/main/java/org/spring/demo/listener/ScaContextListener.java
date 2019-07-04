package org.spring.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ScaContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		ScaComponentFactory.map.clear();
		ScaComponentFactory.map = null;
	}
}
