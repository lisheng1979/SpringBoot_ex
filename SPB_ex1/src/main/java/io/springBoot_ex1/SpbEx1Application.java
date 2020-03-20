package io.springBoot_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpbEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpbEx1Application.class, args);
		
		
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
