package kr.co.kpcard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VueSpringBootApplication {

	public static Logger logger = LoggerFactory.getLogger(VueSpringBootApplication.class);

	public static void main(String[] args) {
		logger.info("String Java Project Starting.....");
		SpringApplication.run(VueSpringBootApplication.class, args);
	}

}
