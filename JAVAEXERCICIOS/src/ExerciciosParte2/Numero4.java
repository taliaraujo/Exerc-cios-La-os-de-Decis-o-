package ExerciciosParte2;

import java.util.Scanner;

public class Numero4 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner (System.in);
	
	double num, raiz, quadrado, divisao, resto = 0;
	
	System.out.println("Insira um n�mero: ");
	num = ler.nextDouble();
	
	divisao = num / 2;  
	resto = num % 2;
	
	if (resto != 0) {
	System.out.println("Esse n�mero � �mpar.");
	quadrado = num * num;
	System.out.println("Esse n�mero ao quadrado �: " + quadrado);
			
	}
	else  {
	System.out.println("Esse n�mero � par.");
	raiz = Math.sqrt(num);
	System.out.println("A raiz desse n�mero �: " + raiz);
	}

	
		
		
	}

}
