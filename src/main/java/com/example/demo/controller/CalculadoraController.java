package com.example.demo.controller;

import com.example.demo.model.Calculadora;

public class CalculadoraController {
	public void resolverOperaciones(){
		int num1=6,num2=3;
		
		Calculadora nuevaCalculadora=new Calculadora();//tipo "Calculadora"	
		nuevaCalculadora.setA(num1);
		nuevaCalculadora.setB(num2);
		nuevaCalculadora.sumarDosNumeros();
		nuevaCalculadora.restarDosNumeros();
		nuevaCalculadora.multiplicarDosNumeros();
		nuevaCalculadora.dividirDosNumeros();
		System.out.println("La suma: "+nuevaCalculadora.sumarDosNumeros());
		System.out.println("La resta: "+nuevaCalculadora.restarDosNumeros());
		System.out.println("La multiplicacion: "+nuevaCalculadora.multiplicarDosNumeros());
		System.out.println("La division: "+nuevaCalculadora.dividirDosNumeros());
	}	
}
