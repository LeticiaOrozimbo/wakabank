package wakabank;

public class Conta {
	
	private int numConta;
	private int numAgencia;
	private String nomeTitular;
	private String numRG;
	private String numCPF;
	private String endereco;
	private int numTelefone;
	private String email;
	private double saldo;
	
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
	
	//Método deposito com um parametro para receber um valor
	public void Deposito(double valor) {
		saldo+=valor;
		System.out.println("Saldo disponivel: " + saldo);
	}
	
	//Método saque
	public void Saque(int valor) {
		if(valor<=saldo) {
			
			saldo-=valor;
			System.out.println("Saque concluido com sucesso \nSaldo: " + saldo);
			
		}else {
			System.out.println("Você não tem valor suficiente para saque! \nSaldo: " + saldo);
			
			
		}
		
		
	}
	
	
}
