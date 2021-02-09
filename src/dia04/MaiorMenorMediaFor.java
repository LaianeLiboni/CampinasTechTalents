package dia04;

import java.util.Scanner;

public class MaiorMenorMediaFor {
	
	  
	public static void main(String[] args) {
		  
	      
		Scanner scanner = new Scanner(System.in);

	      int somaDosValores = 0;
	      int menorValor = Integer.MAX_VALUE;
	      int maiorValor = Integer.MIN_VALUE;

	      System.out.println(menorValor);
	      System.out.println(maiorValor);


	      for (int contador = 1; contador <= 10; contador++) {
	        System.out.printf("Informe o %d num: ",  contador);
	        int valor = scanner.nextInt();

	        if (valor > maiorValor) {
	          maiorValor = valor;
	        }

	        if (valor < menorValor) {
	          menorValor = valor;
	        }

	        somaDosValores += valor;
	      }

	      System.out.println("O maior valor digitado foi: " + maiorValor);//maior valor
	      System.out.println("O menor valor digitado foi: " + menorValor);//menor valor
	      System.out.print("A m�dia dos valores �: " + somaDosValores / 10.0);//m�dia
	      
	      scanner.close();

	  }
	
}
