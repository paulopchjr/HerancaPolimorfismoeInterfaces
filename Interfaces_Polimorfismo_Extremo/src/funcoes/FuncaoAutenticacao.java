package funcoes;

import Interfaces.PermitirAcesso;

/*Somente receber alguem que tem contrato da interface Permitir Acesso e chamar o autentica*/
public class FuncaoAutenticacao {

	
	public boolean autenticacao(PermitirAcesso acesso) {
		return acesso.autenticar();
	}
}
