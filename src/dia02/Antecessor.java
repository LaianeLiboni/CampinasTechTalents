package dia02;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
	
		//entrada de dados	
		System.out.print("Por favor digite um valor inteiro para que digamos qual � o seu antecessor: "
				+ "");
		
		Scanner scanner = new Scanner(System.in);
		
        int a = scanner.nextInt();
        int antecessor = a - 1;
        
        //sa�da de dados
        System.out.println("");
        System.out.println("O antecessor de " + a + " �: " + antecessor);
        
        scanner.close();

		   
	}//fim do main

}// fim da classe


