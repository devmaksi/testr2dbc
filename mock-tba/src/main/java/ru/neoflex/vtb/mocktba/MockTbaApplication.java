package ru.neoflex.vtb.mocktba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.neoflex.vtb.mocktba.model.status.CardActivatedStatus;

@SpringBootApplication
public class MockTbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockTbaApplication.class, args);
	}
}
