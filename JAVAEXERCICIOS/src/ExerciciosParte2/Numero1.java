package ExerciciosParte2;

import java.util.Scanner;

public class Numero1 {
	
	public static void main(String args[]) {
	
	Scanner ler = new Scanner(System.in);
	
	int n1, n2, n3;
	int igual;
	
	System.out.println("Digite 3 n�meros: \n");
	n1 = ler.nextInt();
	n2 = ler.nextInt();
	n3 = ler.nextInt();
	
	if(n1 > n2) {
	System.out.println("O n�mero maior �: " + n1);
	}
	    else if(n1 > n3) { 
		System.out.println("O n�mero maior �: " + n1);
	    }
		else if(n2 > n1) {
		System.out.println("O n�mero maior �: " + n2);
	    }
	    else if(n2 > n3) {
	    System.out.println("O n�mero maior �: " + n2);
	    }
	    else if(n3 > n1) {
	    System.out.println("O n�mero maior �: " + n3);
	    } 
	    else if(n3 > n2) {
	    System.out.println("O n�mero maior �: " + n3);
	
	
	    }
	
    
         }
	
	}
		
	

