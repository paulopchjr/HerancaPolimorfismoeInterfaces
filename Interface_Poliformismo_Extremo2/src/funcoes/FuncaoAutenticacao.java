package funcoes;

import Interfaces.PermitirAcesso;

/*Somente receber alguem que tem contrato da interface Permitir Acesso e chamar o autentica*/
public class FuncaoAutenticacao {

	/*Atributo*/
	PermitirAcesso permitirAcesso;
	
	public boolean autenticacao() {
		return permitirAcesso.autenticar();
	}
	
	
	/*Construtor com paramentros*/
	public FuncaoAutenticacao( PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
