package classes;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class Aluno extends Pessoa {

	private String DataMatricula;
	private String NomeEscola;
	private String Serie;

	List<Disciplinas> listaDisciplina = new ArrayList<Disciplinas>();

	public String getDataMatricula() {
		return DataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		DataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return NomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		NomeEscola = nomeEscola;
	}

	public String getSerie() {
		return Serie;
	}

	public void setSerie(String serie) {
		Serie = serie;
	}

	public List<Disciplinas> getListaDisciplina() {
		return listaDisciplina;
	}

	public void setListaDisciplina(List<Disciplinas> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}
	
	
	public double calculomedia() {
		
		double somaNotas =0.0;
		
		for (Disciplinas disciplinas : listaDisciplina) {
			somaNotas += disciplinas.getNotas();
		}
		return somaNotas/ listaDisciplina.size();
	}
	
	
	public String MediaFinal() {
		double media = this.calculomedia();
		if(media >=4) {
			if(media >= 7) {
				return StatusAluno.APROVADO;
			}
			return StatusAluno.RECUPERACAO;
		}
		return StatusAluno.REPROVADO;
	}

	
	
	@Override
	public String toString() {
		return "Aluno [DataMatricula=" + DataMatricula + ", NomeEscola=" + NomeEscola + ", Serie=" + Serie
				+ ", listaDisciplina=" + listaDisciplina + ", Nome=" + Nome + ", idade=" + idade + ", DataNascimento="
				+ DataNascimento + ", RG=" + RG + ", CPF=" + CPF + ", nomePAi=" + nomePAi + ", nomeMae=" + nomeMae
				+ "]";
	}
	
	
	
	@Override /*Indentifica o metodo sobreEscrito*/
	public Boolean MaiorIdade() {
		// TODO Auto-generated method stub
		return idade >=18;
	}
}




