package principal;

import classes.Aluno;
import classes.Diretor;
import classes.Pessoa;
import classes.Secretario;

public class TesttandoClassesfilhas {
	
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Paulo");
		
		System.out.println(aluno);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Fulano");
		diretor.setRegistroEducacao("65545454541");
		
		System.out.println(diretor);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Ciglano");
		secretario.setNivelCargo("SENIO");
		
		
		System.out.println(secretario);
		
		
		
		System.out.println("Sal�rio do Aluno � = "+ aluno.salario());
		System.out.println("Sal�rio do Diretor � = "+ diretor.salario());
		System.out.println("Sal�rio do Secretario � = "+ secretario.salario());
		System.out.println("---------------");
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	
	
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais =" + pessoa.getNome() 
		+ "Salario � =" +pessoa.salario());
	}
	
	
	

}
