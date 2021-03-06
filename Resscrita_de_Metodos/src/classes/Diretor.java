package classes;

import java.util.Objects;

public class Diretor extends Pessoa {
	
	private String RegistroEducacao;
	private String TempoDirecao;
	private String Titulacao;
	public String getRegistroEducacao() {
		return RegistroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		RegistroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return TempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(RegistroEducacao, TempoDirecao, Titulacao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diretor other = (Diretor) obj;
		return Objects.equals(RegistroEducacao, other.RegistroEducacao)
				&& Objects.equals(TempoDirecao, other.TempoDirecao) && Objects.equals(Titulacao, other.Titulacao);
	}
	@Override
	public String toString() {
		return "Diretor [RegistroEducacao=" + RegistroEducacao + ", TempoDirecao=" + TempoDirecao + ", Titulacao="
				+ Titulacao + ", Nome=" + Nome + ", idade=" + idade + ", DataNascimento=" + DataNascimento + ", RG="
				+ RG + ", CPF=" + CPF + ", nomePAi=" + nomePAi + ", nomeMae=" + nomeMae + "]";
	}

	
	
	
	/*Sobre escrevendo a funcao MaiorIdade na classe de Pessoa*/
	
	public Boolean MaiorIdade() {
		// TODO Auto-generated method stub
		return idade >=25;
	}
	
	
	public String statusMaiorIdade() {
		return this.MaiorIdade() ? "Voc? tem idade Minima para ser um Diretor" : "Voc? n?o idade minima para ser Diretor";
	}
	
	
	
	

}
