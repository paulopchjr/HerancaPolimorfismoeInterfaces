package classes;

import java.util.Objects;

import Interfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso {
	
	private String RegistroEducacao;
	private String TempoDirecao;
	private String Titulacao;
	private String login;
	private String senha;
	
	
	
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/*Construtor */
	public Diretor( String l, String s) {
		
		this.login = l;
		this.senha = s;
			
	}
	
	public Diretor() {
	
	}
	
	
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
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3908.95;
	}
	@Override
	public boolean autenticarParamentros(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("diretor") && senha.equals("321");
	}

	
	
	
	
	
	
	
	
	

}
