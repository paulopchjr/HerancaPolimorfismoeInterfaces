package Interfaces;



/*Contrato de uma regra de n�gocio*/
public interface PermitirAcesso {

	/*Passando por paramentros*/	
	public boolean autenticarParamentros(String login, String senha);
}
