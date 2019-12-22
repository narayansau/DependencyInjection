package com.example.dpenendencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DpenendencyinjectionApplication{

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run( DpenendencyinjectionApplication.class, args );
		Alien alien = context.getBean( Alien.class );
		//Alien alien1 = context.getBean( Alien.class );
		alien.show();
	}

}
