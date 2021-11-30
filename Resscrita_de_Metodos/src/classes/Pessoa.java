package classes;

import java.util.Objects;

/**
 * @author Paulo Cezar
 *
 */
public class Pessoa {

	protected String Nome;
	protected int idade;
	protected String DataNascimento;
	protected String RG;
	protected String CPF;
	protected String nomePAi;
	protected String nomeMae;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNomePAi() {
		return nomePAi;
	}
	public void setNomePAi(String nomePAi) {
		this.nomePAi = nomePAi;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	
	//METODO QUE RETORNAR VERDADEIRO OU FALSO
	
	public Boolean MaiorIdade() {
		return idade >=18;
	}

	
	
	
	
}
