package classes;

import java.util.Objects;

/**
 * @author Paulo Cezar
 *
 */
public  abstract class Pessoa {

	protected String Nome;
	protected int idade;
	protected String DataNascimento;
	protected String RG;
	protected String CPF;
	protected String nomePAi;
	protected String nomeMae;
	
	/*M?todo asbtrado ? que fica na classe pai e ? obrigat?rio para as classes filhas*/
	public abstract double salario();
	
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
	
	
/* HASCODES E EQUALS*/	
	
	@Override
	public int hashCode() {
		return Objects.hash(CPF, DataNascimento, Nome, RG, idade, nomeMae, nomePAi);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(DataNascimento, other.DataNascimento)
				&& Objects.equals(Nome, other.Nome) && Objects.equals(RG, other.RG) && idade == other.idade
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePAi, other.nomePAi);
	}
	
	
	
	/*tosTRING*/
	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", idade=" + idade + ", DataNascimento=" + DataNascimento + ", RG=" + RG
				+ ", CPF=" + CPF + ", nomePAi=" + nomePAi + ", nomeMae=" + nomeMae + "]";
	}
	
	
	
	
	public Boolean MaiorIdade() {
		return idade>=18;
	}
	
	
	

	
	
	
	

	
	
	
	
	
}
