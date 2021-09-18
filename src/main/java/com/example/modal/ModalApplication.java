package com.example.modal;

import com.example.modal.models.Country;
import com.example.modal.repo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModalApplication implements CommandLineRunner {

	private CountryRepo countryRepo;

	@Autowired
	public ModalApplication(CountryRepo countryRepo) {
		this.countryRepo = countryRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(ModalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepo.save(new Country("1","1"));
		countryRepo.save(new Country("2","2"));
		countryRepo.save(new Country("3","3"));
		countryRepo.save(new Country("4","4"));
		countryRepo.save(new Country("5","5"));
	}
}
