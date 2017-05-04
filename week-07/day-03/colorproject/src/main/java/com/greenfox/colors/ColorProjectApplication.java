package com.greenfox.colors;

import com.greenfox.colors.config.ColorProjectConfig;
import com.greenfox.colors.controller.Colors;
import com.greenfox.colors.models.Blue;
import com.greenfox.colors.models.Green;
import com.greenfox.colors.models.Red;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorProjectApplication.class, args);
		AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext(ColorProjectConfig.class);

		Colors red = factory.getBean(Red.class);
		red.printColor();

		Colors green = factory.getBean(Green.class);
		green.printColor();

		Colors blue = factory.getBean(Blue.class);
		blue.printColor();
	}
}
