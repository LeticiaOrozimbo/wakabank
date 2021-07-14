package wakabank;

public interface FuncoesConta {
	
	//M�todo deposito com um parametro para receber um valor
	public double Deposito(double valor);
	
	//M�todo saque com um parametro para receber um valor
	public double Saque(double valor);
	
	//M�todos getters e setters obrigatorios para todas as contas
	public int getNumConta();
	public void setNumConta(int numConta);
	public double getSaldo();
	public void setSaldo(double saldo);
	public int getNumAgencia();
	public void setNumAgencia(int numAgencia);
	public String getNomeTitular();
	public void setNomeTitular(String nomeTitular);
	public String getNumRG();
	public void setNumRG(String numRG);
	public String getNumCPF();
	public void setNumCPF(String numCPF);
	public int getNumTelefone();
	public void setNumTelefone(int numTelefone);
	public String getEmail();
	public void setEmail(String email);
	public String getEndereco();
	public void setEndereco(String endereco);
    
	

	
	

}
