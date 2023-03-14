package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // HAZ TU MAGIA SPRING
@RestController  // PREPARATE PARA RECIBIR PETICIONES HTTP //las @ son anotaciones que nos evitan tener que escribir codigo
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/") //
	String hello()
	{
		return "Hello World!";
	}

	@RequestMapping("/hola") //
	String hola()
	{
		return "Hola mundo";
	}

	@RequestMapping("/mimedicina") //
	String mimedicacion ()
	{
		return "tomate las pastillas";
	}

}
