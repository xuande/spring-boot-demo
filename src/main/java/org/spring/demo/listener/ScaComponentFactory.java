package org.spring.demo.listener;

import java.util.Collections;
import java.util.Map;

public class ScaComponentFactory {

	protected static Map<String, String> map = null;

	public static String getComponent(String key) {
		return map.get(key);
	}

	public static Map<String, Object> getComponent() {
		return Collections.unmodifiableMap(map);
	}
}
