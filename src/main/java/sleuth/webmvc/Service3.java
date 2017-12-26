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
public class Service3 {

  @RequestMapping("/api3") public String printDate() {
	  restTemplate().getForObject("http://localhost:9008/api8", String.class);
    return "Service 3 Response";
  }
  
  @Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

  public static void main(String[] args) {
    SpringApplication.run(Service3.class,
        "--spring.application.name=service3",
        "--server.port=9003"
    );
  }
}
