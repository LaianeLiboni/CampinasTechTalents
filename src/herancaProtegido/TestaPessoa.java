package herancaProtegido;

public class TestaPessoa {
	
	public static void main(String[] args) {
		
		Aluno ricardinho = new Aluno();
		ricardinho.setNome("Ricardinho");
		
		Professor roberto = new Professor();
		roberto.setNome("Roberto");
		
		System.out.println("Informação do aluno: "+ ricardinho.getNome());
		System.out.println("Informação do professor: "+ roberto.getNome());
	}
}

	

