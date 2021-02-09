package dia03;

import java.util.Scanner;

public class OperacoesMatematicas {
	
	public static void main(String[] args) {
		
	      // a, s, m, d
		
	    
		Scanner scanner = new Scanner(System.in);
	      System.out.print("Digite a operação que deseja fazer (a, s, m, d): ");
	      String operacao = scanner.next();
	      
	      System.out.print("Digite o primeiro valor: ");
	      int valor1 = scanner.nextInt();
	      
	      System.out.print("Digite o segundo valor: ");
	      int valor2 = scanner.nextInt();
	      	           
	      switch(operacao) {
	      
	          case "a":	    	  
	          int soma = valor1 + valor2;
	          System.out.println("A soma entre os valores é: " + soma);
	          break;
	          
	          case "s":	    	  
	          int subtracao = valor1 - valor2;
	          System.out.println("A subtração entre os valores é: " + subtracao);
	          break;
	          
	          
	          case "m":
	          int multiplicacao = valor1 * valor2;
	          System.out.println("A multiplicação entre os valores é: " + multiplicacao);
	          break;
	          
	          case "d":
	        	  
	          if (valor2 == 0) {
	        	  System.out.println("Não se pode dividir por 0");
	        	  
	          } else {
	        	  double divisao = valor1 / (double) valor2;
	        	  System.out.println("A divisão entre os valores é: " + divisao);
	        	  
	          }
	          
	          break;
	          
	          default:
	          System.out.println("Operação não encontrada");
	          
	          scanner.close();
	      }
	      
	}

}
