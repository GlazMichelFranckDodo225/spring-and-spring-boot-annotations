package com.dgmf.annotations.atconfiguration;

import com.dgmf.annotations.atconfiguration.sub1.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// var context = SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);

		// Bean Message
		Message message = context.getBean(Message.class);

		// Outputs
		System.out.println(message.getMessage());
	}

}
