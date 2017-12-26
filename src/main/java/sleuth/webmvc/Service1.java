package sleuth.webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class Service1 {

  @RequestMapping("/") public String callService2() {
	  restTemplate().getForObject("http://localhost:9004/api4", String.class);
    return restTemplate().getForObject("http://localhost:9000/api2", String.class);
  }

  @Bean RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(Service1.class,
        "--spring.application.name=service1",
        "--server.port=8081"
    );
  }
}
