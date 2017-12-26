package sleuth.webmvc;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Service5 {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@RequestMapping("/api5")
	public String printDate() {
		return restTemplate().getForObject("http://localhost:9008/api8", String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Service5.class, "--spring.application.name=service5", "--server.port=9005");
	}
}
