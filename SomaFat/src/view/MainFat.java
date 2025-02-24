package view;

import java.util.Scanner;
import controller.*;

public class MainFat {
	
	public static void main(String[] args) {
		
		Somatoria somatoria = new Somatoria();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro (N): ");
	    int n = scanner.nextInt();
	    scanner.close();
	    
	    if (n <= 0) {
	        System.out.println("O número deve ser maior que zero.");
	    } else {
	        double resultado = somatoria.Somatoria(n);
	        System.out.println("O resultado da somatória é: " + resultado);
	    }
		
	}

	
	
}
