package wakabank;

import java.util.Scanner;

public class Programa {
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int escolha; 
		int agencia; 
		int conta;
		int op;
		
		Conta wakaconta = new Conta(0001,1009,"Michele","12345","4567","Rua Flores",3789,"m@89mil.com", 78099);
        
        System.out.println("WAKABANK - O SEU BANCO NEGRO");
        System.out.println("\nVenha planejar seu futuro com nosso WAKABANK");
        
        Scanner leia = new Scanner (System.in);
        
        //usamos o doWhile para garantir que o usuário não digite nada diferente de 1 e 2
        do {
        System.out.println(" Já possui conta? ");
        System.out.println(" Opção 1 - Sim");
        System.out.println(" Opção 2 - Não");
        escolha = leia.nextInt();
        }while (!(escolha==1 || escolha==2));
        
        // Aqui é nosso menu de opções 
        if(escolha == 1) {
        System.out.println(" \nSeja bem vindo!!!");
        
        System.out.println(" \nDigite sua agência: ");
        System.out.println("\n Digite sua conta: ");
        
        System.out.println("\nDigite a opção desejada");
        System.out.println("\n 1 - Saldo ");
        System.out.println("\n 2 - Extrato");
        System.out.println("\n 3 - Doações");
        System.out.println("\n 4 - Dicas financeiras");
        op = leia.nextInt();
        
        switch(op) {
        	case 1:
        		 System.out.println("\n O salse de sua wakaconta é: "+wakaconta.getSaldo());
        		 break;
        	case 2:	// verificar como mostrar movimentações
        		System.out.println("\n O extrato de sua wakaconta é: ");
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