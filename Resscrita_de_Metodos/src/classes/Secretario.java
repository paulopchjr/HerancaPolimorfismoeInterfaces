package classes;

import java.util.Objects;

public class Secretario extends Pessoa {
	
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public int hashCode() {
		return Objects.hash(experiencia, nivelCargo, registro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Secretario other = (Secretario) obj;
		return Objects.equals(experiencia, other.experiencia) && Objects.equals(nivelCargo, other.nivelCargo)
				&& Objects.equals(registro, other.registro);
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", Nome=" + Nome + ", idade=" + idade + ", DataNascimento=" + DataNascimento + ", RG=" + RG + ", CPF="
				+ CPF + ", nomePAi=" + nomePAi + ", nomeMae=" + nomeMae + "]";
	}

	

	
	/*Sobre escreve o metodo de MaiorIdade da classe Pessoa*/
	@Override
	public Boolean MaiorIdade() {
		// TODO Auto-generated method stub
		return idade >= 20;
	}

}
