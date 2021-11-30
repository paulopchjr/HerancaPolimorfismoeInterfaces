package principal;

import classes.Aluno;
import classes.Diretor;
import classes.Secretario;

public class TesttandoClassesfilhas {
	
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Paulo");
		aluno.setIdade(17);
		
		System.out.println(aluno);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Fulano");
		diretor.setRegistroEducacao("65545454541");
		diretor.setIdade(25);
		System.out.println(diretor);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Ciglano");
		secretario.setNivelCargo("SENIO");
		secretario.setIdade(25);
		
		System.out.println(secretario);
		
		
		
		System.out.println(aluno.MaiorIdade());
		System.out.println(diretor.MaiorIdade() + " - "+ diretor.statusMaiorIdade());
		System.out.println(secretario.MaiorIdade());
	}
	
	
	

}
