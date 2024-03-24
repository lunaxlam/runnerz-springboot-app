package com.lunalam.runnerz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
//		// context is a huge container of all your application classes; classes must be in the same level as the main package, i.e. com.lunalam.runnerz
//		ConfigurableApplicationContext context = SpringApplication.run(RunnerzApplication.class, args);

//		WelcomeMessage welcomeMessage = (WelcomeMessage) context.getBean("welcomeMessage");
//		System.out.println(welcomeMessage);

		SpringApplication.run(Application.class, args);

		log.info("Application successfully started!");

		WelcomeMessage welcomeMessage = new WelcomeMessage();
		String message = welcomeMessage.getWelcomeMessage();
		System.out.println(message);
		log.info("Something changed...");
		log.info("Another change...");
	}
}
