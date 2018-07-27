package service.discover.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServcieDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServcieDiscoveryServerApplication.class, args);
	}
}
