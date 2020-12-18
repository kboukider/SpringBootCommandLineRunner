package com.koussaila.SpringBootCommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.koussaila.SpringBootCommandLineRunner.model.City;
import com.koussaila.SpringBootCommandLineRunner.repository.CityRepository;

@Component
public class MyRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);
	
	@Autowired
	private CityRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		repository.save(new City("Bratislava", 432000));
		repository.save(new City("Kabylie", 1759000));
        repository.save(new City("Bejaia", 1280000));
        
        repository.findAll().forEach((city) -> {
        	
        	logger.info("{}" , city);
        	
        } );
	}

}
