package wakabank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import wakabank.ContaEmpresarial;

public class Programa {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int escolha; 
		 
		int conta;
		int op;
		
		List<ContaEmpresarial> contaEmpresarial = new ArrayList<ContaEmpresarial>();
		//int numConta, int numAgencia, String nomeTitular,String endereco, int numTelefone, String email, double saldo,String CNPJ, String nomeEmpresa
	    ContaEmpresarial wakaconta = new ContaEmpresarial(1001,1009,"Michele","Rua Flores",12345,"m@89mil.com",78099.0,"232313567","Docinhos Doces");
        contaEmpresarial.add(wakaconta);
		
        System.out.println("WAKABANK - O SEU BANCO NEGRO");
        System.out.println("\nVenha planejar seu futuro com nosso WAKABANK");
        
        Scanner leia = new Scanner (System.in);
        
        //usamos o doWhile para garantir que o usu�rio n�o digite nada diferente de 1 e 2
        do {
        System.out.println(" J� possui conta? ");
        System.out.println(" Op��o 1 - Sim");
        System.out.println(" Op��o 2 - N�o");
        escolha = leia.nextInt();
        if(!(escolha==1 || escolha==2)) {
        	System.out.println("Essa op��o n�o existe, digite novamente.");
        }
        System.out.println();
        }while (!(escolha==1 || escolha==2));
        
        // Aqui � nosso menu de op��es 
        if(escolha == 1) {
        System.out.println(" \nSeja bem vindo!!!");
        
        System.out.println(" \nDigite sua ag�ncia: ");
        System.out.println("\n Digite sua conta: ");
        
        System.out.println("\nDigite a op��o desejada");
        System.out.println("\n 1 - Saldo ");
        System.out.println("\n 2 - Extrato");
        System.out.println("\n 3 - Doa��es");
        System.out.println("\n 4 - Dicas financeiras");
        op = leia.nextInt();
        
        switch(op) {
        	case 1:
        		 System.out.println("\n O salse de sua wakaconta �: "+wakaconta.getSaldo());
        		 break;
        	case 2:	// verificar como mostrar movimenta��es
        		System.out.println("\n O extrato de sua wakaconta �: ");
        		break;
        	case 3: // terminar quando aprendermos list
        		System.out.println("\n  ");
        		break;
        	default: //inserir dicas 
        		System.out.println(" ");
        	
        	
        
        }
       
        }
        

	}
}