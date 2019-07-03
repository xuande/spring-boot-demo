package org.spring.demo;

import org.spring.demo.listener.ScaContextListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	@Bean
	public ServletListenerRegistrationBean<?> scaListenerRegistrationBean() {
		ServletListenerRegistrationBean<ScaContextListener> registration = new ServletListenerRegistrationBean<ScaContextListener>();
		registration.setListener(new ScaContextListener());
		return registration;
	}

}
