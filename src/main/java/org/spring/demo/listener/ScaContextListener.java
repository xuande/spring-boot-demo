package org.spring.demo.listener;

import java.util.HashMap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ScaContextListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("start listener ...");
		ScaComponentFactory.map = new HashMap<>();
		ScaComponentFactory.map.put("test", "this is a demo");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		ScaComponentFactory.map.clear();
		ScaComponentFactory.map = null;
	}
}
