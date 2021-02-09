package dia04;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
	     
		Scanner scanner = new Scanner(System.in);
	      
	      //entrada de dados
	      System.out.print("Digite o número que você deseja saber o fatorial: ");
	      
	      int valor = scanner.nextInt();
	      int resultado = 1;
	      
	      //decisão
	      while (valor > 1) {
	        resultado = resultado * valor;
	        valor--;//decremento
	      }
	      
	      //saída de dados
	      System.out.println(resultado);

		scanner.close();
	}// fim do main

}// fim da classe
