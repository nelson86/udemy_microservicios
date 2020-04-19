package com.formacionbdi.springboot.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.formacionbdi.springboot.app.commons.usuarios.models.entity"})
public class UdemyMicroservicioServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdemyMicroservicioServicioUsuarioApplication.class, args);
	}

}
