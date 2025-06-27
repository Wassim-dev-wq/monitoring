package org.monitoring.monitoringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MonitoringDemoApplication {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MonitoringDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MonitoringDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		logger.info("Received request for /hello endpoint");
		return ResponseEntity.ok().body("Hello, World!");
	}
}
