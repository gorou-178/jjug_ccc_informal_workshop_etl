package com.example.demo;

import com.example.demo.repository.AddressCsvRepository;
import com.example.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	public DemoApplication() {
		addressRepository = new AddressCsvRepository();
		loadZipFile();
	}

	public void loadZipFile() {
		List address = addressRepository.getAll();
		address.forEach(System.out::println);
		System.out.println("ETL");
	}
}
