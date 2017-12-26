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
public class Service2{

	@RequestMapping("/api2")
	public String callService3() {
		 restTemplate().getForObject("http://localhost:9003/api3", String.class); 
		 return restTemplate().getForObject("http://localhost:9007/api7", String.class);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(Service2.class, "--spring.application.name=service2", "--server.port=9000");
	}
}
