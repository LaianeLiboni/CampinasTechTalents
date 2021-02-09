package dia02;

public class Variavel {
	
	public static void main(String args []) {
	 //declaração de variáveis
	 int y = 99;
	 int z = 11;
	 
	 //entrada de dados
	 System.out.println("O valor inicial da minha variável Y é: " + y);
     System.out.println("O valor inicial da minha variável Z é: " + z);
     
     int aux = 0;// variável auxiliar
     aux = y;
     y = z;
     z = aux;
     
     //saída de dados
     System.out.println("O valor depois da troca da minha variável Y é: " + y);
     System.out.println("O valor depois da troca da minha variável Z é: " + z);
     
     }//fim do main
	
}// fim da classe
