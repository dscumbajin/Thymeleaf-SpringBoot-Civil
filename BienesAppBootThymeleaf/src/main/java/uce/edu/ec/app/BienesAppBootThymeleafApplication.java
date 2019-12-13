package uce.edu.ec.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "uce.edu.ec.app")
public class BienesAppBootThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(BienesAppBootThymeleafApplication.class, args);
	}

}
