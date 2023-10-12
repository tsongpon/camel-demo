package io.songpon.cameldemo;

import io.songpon.cameldemo.route.RouteBuilder;
import org.apache.camel.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelDemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CamelDemoApplication.class, args);

//		Main main = new Main();
//		main.configure().addRoutesBuilder(new RouteBuilder());
//		main.run(args);
	}

}
