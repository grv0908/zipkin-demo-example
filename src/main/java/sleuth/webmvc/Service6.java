package sleuth.webmvc;

import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service6 {
	
	
  @RequestMapping("/api6") public String printDate() {	  

    return "Service 6 Response";
  }

  public static void main(String[] args) {
    SpringApplication.run(Service6.class,
        "--spring.application.name=service6",
        "--server.port=9006"
    );
  }
}
