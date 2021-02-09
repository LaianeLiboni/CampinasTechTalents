package dia02;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Esse algoritmo calcula a área de um retângulo");  
        System.out.println("");
        
        System.out.print("Por favor digite a base do retângulo: ");        
        float base = scanner.nextFloat();      
        
        System.out.print("Por favor digite a altura do retângulo: ");
        float altura = scanner.nextFloat();
        
        System.out.println("");
        float area = base * altura;
        System.out.println("A área do retângulo é: " + area);
        
        scanner.close();

	}

}