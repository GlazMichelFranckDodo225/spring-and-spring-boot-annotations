package com.dgmf;

import com.dgmf.controller.MyController;
import com.dgmf.controller.PizzaController;
import com.dgmf.repository.MyIRepository;
import com.dgmf.repository.impl.MyIRepositoryImpl;
import com.dgmf.service.MyIService;
import com.dgmf.service.impl.MyIServiceImpl;
import com.dgmf.service.impl.NonVegPizza;
import com.dgmf.service.impl.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);

		// PizzaController pizzaController = context.getBean(PizzaController.class);
		/*PizzaController pizzaController =
				(PizzaController) context.getBean("pizzaController");

		System.out.println(pizzaController);
		System.out.println(pizzaController.getPizza());*/

		// System.out.println("====== Using @Bean Annotation ======");

		// Retrieving a VegPizza Bean using @Bean Annotation
		// VegPizza vegPizza = context.getBean(VegPizza.class);
		// The default given method name without the "name" Attribute of
		// the @Bean Annotation
		// VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
		// Explicitly Bean Name provided without the "name" Attribute of the
		// @Bean Annotation
		/*VegPizza vegPizza = (VegPizza) context.getBean("vegPizzaBean");
		NonVegPizza nonVegPizza = (NonVegPizza) context.getBean("nonVegPizza");
		System.out.println(vegPizza.getPizza());
		System.out.println(nonVegPizza.getPizza());*/

		/*PizzaController pizzaController =
				(PizzaController) context.getBean("pizzaController");

		System.out.println(pizzaController);
		System.out.println(pizzaController.getPizza());*/

		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

		MyIService myIService = context.getBean(MyIServiceImpl.class);
		System.out.println(myIService.hello());

		MyIRepository myIRepository = context.getBean(MyIRepositoryImpl.class);
		System.out.println(myIRepository.hello());
	}

}
