package wakabank;

public class ContaFisica extends Conta implements FuncoesConta {
	
	public ContaFisica(int numAgencia, int numConta, String nomeTitular,String endereco, int numTelefone, String email, double saldo)
	{
		super(numAgencia,numConta,nomeTitular,endereco,numTelefone,email,saldo);

	}
	
	@Override
	public double Doacao(double valor) 
	{
		if(valor!=0 && valor<=saldo) 
		{
			super.Saque(valor);
			valor = valor*0.25 + valor;
		}
	
		else 
		{
			System.out.println("\nVoce não tem saldo suficente para doar!!! ");
		}
		
		return valor;
	
	}

}
