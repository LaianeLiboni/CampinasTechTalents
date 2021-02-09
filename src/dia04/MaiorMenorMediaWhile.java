package dia04;

import java.util.Scanner;

public class MaiorMenorMediaWhile {
	
	public static void main(String[] args) {
	      
		
		Scanner scanner = new Scanner(System.in);

	      int somaDosValores = 0;

	      int menorValor = Integer.MAX_VALUE;
	      int maiorValor = Integer.MIN_VALUE;

	      System.out.println(menorValor);
	      System.out.println(maiorValor);

	      int contador = 1;

	      while (contador <= 10) {
	        System.out.printf("Informe o %d num: ",  contador);
	        int valor = scanner.nextInt();

	        if (valor > maiorValor) {
	          maiorValor = valor;
	        }

	        if (valor < menorValor) {
	          menorValor = valor;
	        }

	        somaDosValores += valor;

	        contador++;
	      }

	      System.out.println("O maior valor digitado foi: " + maiorValor);
	      System.out.println("O menor valor digitado foi: " + menorValor);
	      System.out.print("A média dos valores é: " + somaDosValores / 10.0);
	      
	      scanner.close();
	
		}
	
}
