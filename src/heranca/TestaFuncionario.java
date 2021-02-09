package heranca;

public class TestaFuncionario {
	public static void main(String[] args) {
		Gerente martinho = new Gerente();
		martinho.setNome("Martinho Silva");
		martinho.setSalario(6000.0);
		martinho.setUsuario("marsilva");
		martinho.setSenha("martinho@Silva123");
		
		System.out.println("Informações do Gerente: "+ martinho.getNome());
		System.out.println("Salario: " + martinho.getSalario());
		System.out.println("Usuario: "+ martinho.getUsuario());
		System.out.println("Senha: "+ martinho.getSenha());
		System.out.println("Bonificação: " + martinho.calculaBonificacao());
		
		Secretaria larissa = new Secretaria();
		larissa.setNome("Larissa Sousa");
		larissa.setSalario(4500.0);
		larissa.setRamal(2);
		
		System.out.println("Informações da Secretaria: "+ larissa.getNome());
		System.out.println("Salario: " + larissa.getSalario());
		System.out.println("Ramal: "+ larissa.getRamal());
		
		Telefonista mercedez = new Telefonista();
		mercedez.setNome("Mercedez Gonzales");
		mercedez.setSalario(4000.0);
		mercedez.setEstacaoDeTrabalho(25);
		
		System.out.println("Informações da Telefonista: "+ mercedez.getNome());
		System.out.println("Salario: " + mercedez.getSalario());
		System.out.println("Estação de Trabalho: "+ mercedez.getEstacaoDeTrabalho());
		
	}
}

