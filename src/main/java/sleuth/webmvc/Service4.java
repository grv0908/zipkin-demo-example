package sleuth.webmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableAsync
public class Service4 {
	
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public void someLongTask() {
		try {
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	@RequestMapping("/api4")
	public String slowService() {
		someLongTask();
			restTemplate().getForObject("http://localhost:9005/api5", String.class);
		return restTemplate().getForObject("http://localhost:9006/api6", String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Service4.class, "--spring.application.name=service4", "--server.port=9004");
	}
}
