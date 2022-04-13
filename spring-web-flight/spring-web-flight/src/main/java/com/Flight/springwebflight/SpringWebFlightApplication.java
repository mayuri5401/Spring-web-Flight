package com.Flight.springwebflight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringWebFlightApplication extends SpringBootServletInitializer {
	
	
	@Autowired
	private FlightRepository repo;
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
        return builder.sources(SpringWebFlightApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringWebFlightApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner initDB() {
		return (args) -> {
			repo.save(new Flight("AirIndia", "pune","mumbai","2022-03-02","2022-03-03", 40,4000));
			repo.save(new Flight("GoIndia", "delhi","chennai","2022-03-02","2022-03-03", 50,5000));
			repo.save(new Flight("AirTrek", "Surat","bihar","2022-03-02","2022-03-03", 70,7000));
		};
	}


}
