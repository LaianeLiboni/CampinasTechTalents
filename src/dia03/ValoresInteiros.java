package dia03;

import java.util.Scanner;

public class ValoresInteiros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        int somaDosValores = 0;
        
        System.out.print("Informe o primeiro n�mero: ");
       
        int valor = scanner.nextInt();
        int menorValor = valor;
        int maiorValor = valor;
        
        
        somaDosValores += valor; 
        
        System.out.print("Informe o segundo n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o terceiro n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
       
        System.out.print("Informe o quarto n�mero: ");
       
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o quinto n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o sexto n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o s�timo n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o oitavo n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o nono n�mero: ");
        
        valor = scanner.nextInt();
        if (valor > maiorValor) {
            maiorValor = valor;
        }
        if (valor < menorValor) {
            menorValor = valor;
        }
        somaDosValores += valor;
        
        System.out.print("Informe o d�cimo n�mero: ");
        
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
        System.out.print("A m�dia dos valores �: " + somaDosValores / 10.0);
        scanner.close();
        // End Resultado

		
	}

}
