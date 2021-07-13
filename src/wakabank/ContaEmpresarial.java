package wakabank;

public class ContaEmpresarial extends Conta{
	
	private String CNPJ;
	private String nomeEmpresa;
	private double taxa=0.05;
	
	
	public ContaEmpresarial(int numConta, int numAgencia, String nomeTitular,String endereco, int numTelefone, String email, double saldo,String CNPJ, String nomeEmpresa,double taxa)
	{
		super(numConta, numAgencia,nomeTitular,endereco,numTelefone,email,saldo);
		this.CNPJ = CNPJ;
		this.nomeEmpresa = nomeEmpresa;
		this.taxa = taxa;	
	}

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
	
	public double getTaxa() {
		return taxa;
	}
	
	@Override
	public void Saque(int valor)
	{
		
		if(valor<=getSaldo()) {
			
			System.out.println(getTaxa()*valor);
			
			setSaldo(getSaldo()-valor);
			System.out.println("Saque concluido com sucesso \nSaldo: " + getSaldo());
			
		}else {
			System.out.println("Você não tem valor suficiente para saque! \nSaldo: " + getSaldo());
			
		    
		
	}
	
}
}
