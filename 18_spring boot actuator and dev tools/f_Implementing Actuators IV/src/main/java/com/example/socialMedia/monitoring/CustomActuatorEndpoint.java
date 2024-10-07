package com.example.socialMedia.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id="custom")
@Component
public class CustomActuatorEndpoint {
	
	@ReadOperation
	public Map<String, String> customActuator(String memory) {
		Map<String, String> metricMap= new HashMap<>();
		metricMap.put("Compute", "78%");
		metricMap.put("Memory Usage", memory);
		
		return metricMap;
	}
}
