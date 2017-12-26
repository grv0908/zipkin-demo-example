package sleuth.webmvc;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service9 {

  @RequestMapping("/api9") public String printDate() {
    return "Service 9 Response";
  }

  public static void main(String[] args) {
    SpringApplication.run(Service9.class,
        "--spring.application.name=service9",
        "--server.port=9009"
    );
  }
}
