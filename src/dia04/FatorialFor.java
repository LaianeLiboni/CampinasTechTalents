package dia04;

import java.util.Scanner;

public class FatorialFor {
	
	public static void main(String[] args) {
	//entrada de dados
	
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Digite o n�mero que voc� deseja saber o fatorial: ");
    
    int valor = scanner.nextInt();
    int resultado = 1;
    
    for (int i = 1; i < 9; i++) {
    	
    	resultado = resultado * valor;
    	valor--;//decremento
    	
    	//sa�da de dados
    	System.out.println(resultado);
    	
    	scanner.close();
    
 
    }
    	  
			
	}
	

}
