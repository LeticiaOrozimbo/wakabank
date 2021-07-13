package wakabank;

public class ContaFisica extends Conta implements FuncoesConta {
	
	public ContaFisica(int numAgencia, int numConta, String nomeTitular,String endereco, int numTelefone, String email, double saldo)
	{
		super(numAgencia,numConta,nomeTitular,endereco,numTelefone,email,saldo);

	}
	
	

}
