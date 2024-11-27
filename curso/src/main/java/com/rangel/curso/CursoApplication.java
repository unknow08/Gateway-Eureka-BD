package com.rangel.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.rangel.common.CommonUsuario.models.entity"})
public class CursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

}
