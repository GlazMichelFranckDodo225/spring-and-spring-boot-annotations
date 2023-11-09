package com.dgmf;

import com.dgmf.atscopeannotattion.PrototypeBean;
import com.dgmf.atscopeannotattion.SingletonBean;
import com.dgmf.atvalueannotation.ValueAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);

		// SingletonBean Class uses Singleton Scope
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());
		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		// PrototypeBean Class uses Prototype Scope
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());
		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());

		// @Value Annotation
		ValueAnnotation valueAnnotation = context.getBean(ValueAnnotation.class);
		System.out.println(valueAnnotation.getDefaultName());
	}

}
