package dia02;

import java.util.Scanner;

public class AreaRetangulo {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Esse algoritmo calcula a �rea de um ret�ngulo");  
        System.out.println("");
        
        System.out.print("Por favor digite a base do ret�ngulo: ");        
        float base = scanner.nextFloat();      
        
        System.out.print("Por favor digite a altura do ret�ngulo: ");
        float altura = scanner.nextFloat();
        
        System.out.println("");
        float area = base * altura;
        System.out.println("A �rea do ret�ngulo �: " + area);
        
        scanner.close();

	}

}