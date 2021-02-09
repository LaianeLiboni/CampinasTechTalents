package dia03;

import java.util.Scanner;

public class ValoresInteiros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        int somaDosValores = 0;
        
        System.out.print("Informe o primeiro número: ");
       
        int valor = scanner.nextInt();
        int menorValor = valor;
        int maiorValor = valor;
        
        
        somaDosValores += valor; 
        
        System.out.print("Informe o segundo número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o terceiro número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
       
        System.out.print("Informe o quarto número: ");
       
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o quinto número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o sexto número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o sétimo número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o oitavo número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o nono número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o décimo número: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        // Start Resultado 
        System.out.println("");
        System.out.println("O maior valor digitado foi: " + maiorValor);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.print("A média dos valores é: " + somaDosValores / 10.0);
        scanner.close();
        // End Resultado

		
	}

}
