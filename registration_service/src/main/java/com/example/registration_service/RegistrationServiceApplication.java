package com.example.registration_service;

import com.example.registration_service.entities.Owner;
import com.example.registration_service.entities.Vehicle;
import com.example.registration_service.repositories.OwnerRepository;
import com.example.registration_service.repositories.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class RegistrationServiceApplication {
	Random random = new Random();
	public static void main(String[] args) {
		SpringApplication.run(RegistrationServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(VehicleRepository vehicleRepository, OwnerRepository ownerRepository) {
		return args -> {
			Stream.of("Wahiba BOUZYAN", "Nabila KASSI", "Jawad ALAMI",
					"Salma AIT ALI ", "Anwar BASSAM").forEach(name -> {
				String em = name.replaceAll(" ","");
				Owner owner1 = Owner.builder()
						.name(name)
						.email(em+ "@gmail.com")
						.birthDate(new Date())
						.build();
				ownerRepository.save(owner1);
			});
			ownerRepository.findAll().forEach(owner -> {
				for (int i = 0; i < 3; i++) {
					Vehicle vehicle = Vehicle.builder()
							.regestrationNumber(UUID.randomUUID().toString())
							.fiscalPower(Double.valueOf(random.nextInt(1000)))
							.brand("brand" + random.nextInt(20))
							.model("model" + random.nextInt(20))
							.owner(owner)
							.build();
					vehicleRepository.save(vehicle);
				}
			});
		};
	}
}
