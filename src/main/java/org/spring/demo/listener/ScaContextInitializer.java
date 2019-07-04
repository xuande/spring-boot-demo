package org.spring.demo.listener;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScaContextInitializer implements ServletContextInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("start listener ...");
		ScaComponentFactory.map = new HashMap<>();
		ScaComponentFactory.map.put("test", "this is a demo");
	}

}
