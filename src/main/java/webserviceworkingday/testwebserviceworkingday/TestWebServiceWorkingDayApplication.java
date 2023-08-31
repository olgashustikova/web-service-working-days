package webserviceworkingday.testwebserviceworkingday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TestWebServiceWorkingDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWebServiceWorkingDayApplication.class, args);
	}

}
