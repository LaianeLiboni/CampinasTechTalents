package dia03;

import java.util.Scanner;

public class ClassificacaoNadador {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
        int continuarPrograma = 1;
        
        while (continuarPrograma == 1) {
            System.out.print("Digite a idade do nadador: ");
            
            int idade = scanner.nextInt();         
            boolean infantilA = idade >= 5 && idade <= 7;
            boolean infantilB = idade >= 8 && idade <= 11;
            boolean juvenilA = idade >= 12 && idade <= 13;
            boolean juvenilB = idade >= 14 && idade <= 17;
            boolean adultos = idade >= 18;
            
            System.out.println("");
            if (infantilA) {
                System.out.println("Categoria infantil A");
            
            } else if (infantilB) {
                System.out.println("Categoria infantil B");
            
            } else if (juvenilA) {
                System.out.println("Categoria juvenil A");
            
            } else if (juvenilB) {
                System.out.println("Categoria juvenil B");
            
            } else if (adultos) {
                System.out.println("Categoria Adultos");
            
            } else {
                System.out.println("Categoria n�o encontrada para a idade: " + idade);
            
            }
            System.out.println("");
            System.out.println("Deseja continuar o programa s(1)/n(0)?");
            
            continuarPrograma = scanner.nextInt();
            
        } 
        
        scanner.close();

	}

}