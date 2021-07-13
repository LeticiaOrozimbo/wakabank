package wakabank;

public abstract class Conta {
	
	
	protected int numConta;
	protected int numAgencia;
	protected String nomeTitular;
	protected String numRG;
	protected String numCPF;
	protected String endereco;
	protected int numTelefone;
	protected String email;
	protected double saldo;
	
	public Conta(int numConta, int numAgencia, String nomeTitular, String numRG, String numCPF, String endereco, int numTelefone, String email, double saldo) {
		super();
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.nomeTitular = nomeTitular;
		this.numRG = numRG;
		this.numCPF = numCPF;
		this.endereco = endereco;
		this.numTelefone = numTelefone;
		this.email = email;
		this.saldo = saldo;
		
	}
	
	public Conta(int numConta, int numAgencia, String nomeTitular, String endereco, int numTelefone, String email, double saldo) {
		super();
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.nomeTitular = nomeTitular;
		this.endereco = endereco;
		this.numTelefone = numTelefone;
		this.email = email;
		this.saldo = saldo;
	}
	
	
    //Implementa��o dos m�todos getters e setters da Interface
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumRG() {
		return numRG;
	}

	public void setNumRG(String numRG) {
		this.numRG = numRG;
	}

	public String getNumCPF() {
		return numCPF;
	}

	public void setNumCPF(String numCPF) {
		this.numCPF = numCPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(int numTelefone) {
		this.numTelefone = numTelefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//M�todo Saque previamente implementado
	public void Saque(double valor)
	{
		if(getSaldo() != 0 && getSaldo() <= valor) {
			
			setSaldo(getSaldo()-valor);
			
		} else {
			System.out.println("Voc� n�o tem saldo para saque");
		}
		
		
	}	
	
	//M�todo Deposito previamente implementado
	public void Deposito(double valor) 
	{
	}
	
	
	
}
