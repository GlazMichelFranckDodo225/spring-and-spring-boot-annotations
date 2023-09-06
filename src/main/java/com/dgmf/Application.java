package com.dgmf;

import com.dgmf.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);

		// PizzaController pizzaController = context.getBean(PizzaController.class);
		PizzaController pizzaController =
				(PizzaController) context.getBean("pizzaController");

		System.out.println(pizzaController);
		System.out.println(pizzaController.getPizza());
	}

}
