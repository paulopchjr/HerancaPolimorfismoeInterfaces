package principal;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplinas;
import classes.Secretario;
import constantes.StatusAluno;

public class AreaPrincipalSistema {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);

		if (!login.isEmpty() && login != null && !senha.isEmpty() && senha != null) {

			if (secretario.autenticar()) {

				HashMap<String, List<Aluno>> mapsAlunos = new HashMap<String, List<Aluno>>();
				List<Aluno> listaAlunos = new ArrayList<Aluno>();

				String nAlunos = JOptionPane.showInputDialog("Informe a quantidade de Alunos na sala");
				int totalAluno = Integer.parseInt(nAlunos);

				for (int qtdAlunos = 0; qtdAlunos < totalAluno; qtdAlunos++) {

					Aluno aluno = new Aluno();

					String nomeAluno = JOptionPane.showInputDialog("Qual ? o nome do Aluno" + (qtdAlunos + 1) +"?");
					String idade = JOptionPane.showInputDialog("Qual ? a idade?");

					/*-------------*/

					aluno.setNome(nomeAluno);
					aluno.setIdade(Integer.parseInt(idade));

					String qtdDisciplina = JOptionPane.showInputDialog("Informe a quantidade de Disciplina");
					int totalDisciplina = Integer.parseInt(qtdDisciplina);

					for (int posDis = 1; posDis <= totalDisciplina; posDis++) {

						String nomeDisciplina = JOptionPane
								.showInputDialog("Informe o nome da Disciplina " + posDis + "?");
						String nota = JOptionPane.showInputDialog("Informe a Nota da Disciplina " + posDis + "?");

						Disciplinas dis = new Disciplinas();
						dis.setNomeDiscipla(nomeDisciplina);
						dis.setNotas(Double.valueOf(nota));

						// Adicionando uma lista de Disciplina no objeto Aluno
						aluno.getListaDisciplina().add(dis);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina ? ");

					if (escolha == 0) {/* 0 SIM */

						int continuarremovendo = 0;
						int posDisIndex = 1;
						while (continuarremovendo == 0) {
							String removerDisciplina = JOptionPane.showInputDialog("Qual Disciplina 1,2,3,4?");
							aluno.getListaDisciplina()
									.remove(Integer.valueOf(removerDisciplina).intValue() - posDisIndex);
							posDisIndex++;
							continuarremovendo = JOptionPane.showConfirmDialog(null, "Continuar Remover Disciplina?");
						}

					}

					listaAlunos.add(aluno);

				}
				
				
				
				mapsAlunos.putIfAbsent(StatusAluno.APROVADO, new ArrayList<Aluno>());
				mapsAlunos.putIfAbsent(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				mapsAlunos.putIfAbsent(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				
				for (Aluno alunos : listaAlunos) {
					
					if(alunos.MediaFinal().equals(StatusAluno.APROVADO)) {
						mapsAlunos.get(StatusAluno.APROVADO).add(alunos);
					}else if(alunos.MediaFinal().equals(StatusAluno.RECUPERACAO)) {
 						mapsAlunos.get(StatusAluno.RECUPERACAO).add(alunos);
					}else {
						mapsAlunos.get(StatusAluno.REPROVADO).add(alunos);
					}
				}
				
				
				
				System.out.println("---LISTA DE ALUNOS APROVADOS");
				for (Aluno alunosAprovados : mapsAlunos.get(StatusAluno.APROVADO)) {
					System.out.println("Aluno: " + alunosAprovados.getNome() + "\n" + "M?dia: " + alunosAprovados.calculomedia() + "\n Resultado: " + alunosAprovados.MediaFinal());
				
					System.out.println("---------------------------------------------------------------");
				
				}
				
				System.out.println("---LISTA DE ALUNOS EM RECUPERA??O");
				for(Aluno alunosRecuperacao : mapsAlunos.get(StatusAluno.RECUPERACAO)) {
					System.out.println("Aluno: " + alunosRecuperacao.getNome() + "\n" + "M?dia: " + alunosRecuperacao.calculomedia() + "\n Resultado: " + alunosRecuperacao.MediaFinal());
					System.out.println("---------------------------------------------------------------");
				
				}
				
				System.out.println("---LISTA DE ALUNOS REPROVADOS");
				for(Aluno alunosReprovados : mapsAlunos.get(StatusAluno.REPROVADO)) {
					System.out.println("Aluno: " + alunosReprovados.getNome() + "\n" + "M?dia: " + alunosReprovados.calculomedia() + "\n Resultado: " + alunosReprovados.MediaFinal());
					System.out.println("---------------------------------------------------------------");
				
				}
				

			} else {
				JOptionPane.showMessageDialog(null, "Login e/ou Senha Inv?lidos");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Campos Vazios");
		}

	}

}
