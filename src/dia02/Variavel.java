package dia02;

public class Variavel {
	
	public static void main(String args []) {
	 //declara��o de vari�veis
	 int y = 99;
	 int z = 11;
	 
	 //entrada de dados
	 System.out.println("O valor inicial da minha vari�vel Y �: " + y);
     System.out.println("O valor inicial da minha vari�vel Z �: " + z);
     
     int aux = 0;// vari�vel auxiliar
     aux = y;
     y = z;
     z = aux;
     
     //sa�da de dados
     System.out.println("O valor depois da troca da minha vari�vel Y �: " + y);
     System.out.println("O valor depois da troca da minha vari�vel Z �: " + z);
     
     }//fim do main
	
}// fim da classe
