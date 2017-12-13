package com.jk.jbase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jk.jbase.listener.MyApplicationEnvironmentPreparedEventListener;
import com.jk.jbase.listener.MyApplicationPreparedEventListener;
import com.jk.jbase.listener.MyApplicationStartedEventListener;

@SpringBootApplication
public class Application {
	
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		application.addListeners(new MyApplicationStartedEventListener());
		application.addListeners(new MyApplicationEnvironmentPreparedEventListener());
		application.addListeners(new MyApplicationPreparedEventListener());
		application.run(args);
		logger.info("Run!!!!");
	}
}
