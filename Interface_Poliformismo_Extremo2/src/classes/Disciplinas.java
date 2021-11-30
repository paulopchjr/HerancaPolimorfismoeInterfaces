package classes;

import java.util.Objects;

public class Disciplinas {
	
	
	
	private String nomeDiscipla;
	private double notas;
	
	
	public String getNomeDiscipla() {
		return nomeDiscipla;
	}
	public void setNomeDiscipla(String nomeDiscipla) {
		this.nomeDiscipla = nomeDiscipla;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nomeDiscipla, notas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplinas other = (Disciplinas) obj;
		return Objects.equals(nomeDiscipla, other.nomeDiscipla)
				&& Double.doubleToLongBits(notas) == Double.doubleToLongBits(other.notas);
	}
	
	
	

}
