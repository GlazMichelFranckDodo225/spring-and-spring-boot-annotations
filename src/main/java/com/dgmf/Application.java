package com.dgmf;

import com.dgmf.controller.MyController;
import com.dgmf.controller.PizzaController;
import com.dgmf.lazy.LazyLoader;
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

		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

		MyIService myIService = context.getBean(MyIServiceImpl.class);
		System.out.println(myIService.hello());

		MyIRepository myIRepository = context.getBean(MyIRepositoryImpl.class);
		System.out.println(myIRepository.hello());

		LazyLoader lazyLoader = context.getBean(LazyLoader.class);
	}

}
