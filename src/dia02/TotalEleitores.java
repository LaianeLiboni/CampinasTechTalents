package dia02;

import java.util.Scanner;

public class TotalEleitores {	

	    public static double calculaPercentualX(double tDeElei, double totalX) {
	    	
	        double percentual = totalX * 100 / tDeElei;
	        return percentual;
	    }

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
		        
		    System.out.print("Digite o total de votos: ");
		    int totalVotos = scanner.nextInt();
		        
		    System.out.print("Digite o total de votos em branco: ");
		    int totalVotosBrancos = scanner.nextInt();
		        
		    System.out.print("Digite o total de votos nulos: ");
		    int totalVotosNulos = scanner.nextInt();
		        
		    System.out.print("Digite o total de votos validos: ");
		    int totalVotosValidos = scanner.nextInt();
		        
		    System.out.println("-------------------------------------------------------------");
		    System.out.println("A quantidade total de votos é: " + totalVotos);
		    System.out.println("A quantidade total de votos em branco é: " + totalVotosBrancos);
		    System.out.println("A quantidade total de votos nulos é: " + totalVotosNulos);
		    System.out.println("A quantidade total de votos validos é: " + totalVotosValidos);
		        
		    double percentualVotosBrancos = TotalEleitores.calculaPercentualX(totalVotos, totalVotosBrancos);
		    double percentualVotosNulos = TotalEleitores.calculaPercentualX(totalVotos, totalVotosNulos);
		    double percentualVotosValidos = TotalEleitores.calculaPercentualX(totalVotos, totalVotosValidos);
		        
		    System.out.println("-------------------------------------------------------------");
		    System.out.println("O percentual total de votos em branco é: " + String.format("%.2f", percentualVotosBrancos));
		    System.out.println("O percentual total de votos nulos é: " + String.format("%.2f", percentualVotosNulos));
		    System.out.println("O percentual total de votos validos é: " + String.format("%.2f", percentualVotosValidos));
		        
		    scanner.close();
		        
		  
		}

}
