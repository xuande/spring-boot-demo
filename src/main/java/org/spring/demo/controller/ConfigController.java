package org.spring.demo.controller;

import java.util.Map;

import org.spring.demo.listener.ScaComponentFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

	private Map<String, Object> configMap = ScaComponentFactory.getComponent();

	@GetMapping("/properties/{key}")
	public Object getConfig(@PathVariable("key") String key) {
		return configMap.get(key);
	}
}
