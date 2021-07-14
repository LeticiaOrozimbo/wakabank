package wakabank;

public class ContaEmpresarial extends Conta implements FuncoesConta {
	
	private String CNPJ;
	private String nomeEmpresa;

	public ContaEmpresarial(int numAgencia, int numConta, String nomeTitular,String endereco, int numTelefone, String email, double saldo,String CNPJ, String nomeEmpresa)
	{
		super(numAgencia,numConta,nomeTitular,endereco,numTelefone,email,saldo);
		this.CNPJ = CNPJ;
		this.nomeEmpresa = nomeEmpresa;
	}
	
	
    //Implementação dos métodos getters e setters dos atributos específicos da conta empresarial
	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	
	@Override
	public double Doacao(double valor) 
	{
		if(valor!=0 && valor<=saldo) 
		{
			super.Saque(valor);
			valor = valor*0.5 + valor;
			
		}
	
		else 
		{
			System.out.println("\nVoce não tem saldo suficente para doar!!! ");
		}
		
		return valor;
	
	}
		
			
	
}


