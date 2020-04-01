package ru.neoflex.vtb.saveloadstatic;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.core.DatabaseClient;

@Log4j2
@SpringBootApplication
public class SaveLoadStaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaveLoadStaticApplication.class, args);
		log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);

	}

}
