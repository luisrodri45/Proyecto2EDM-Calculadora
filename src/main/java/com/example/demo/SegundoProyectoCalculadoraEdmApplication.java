package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.CalculadoraController;

@SpringBootApplication
public class SegundoProyectoCalculadoraEdmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoProyectoCalculadoraEdmApplication.class, args);
		CalculadoraController nuevoControlador=new CalculadoraController();
		nuevoControlador.resolverOperaciones();
	}

}
