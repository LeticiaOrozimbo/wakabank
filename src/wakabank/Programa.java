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
		int agencia;
		int conta;
		int op=0;
		boolean flag=false;
		int contaseguranca=0;
		ContaEmpresarial contaEmpresa = null;
		ContaFisica contaFisica = null;
		
		//ContaFisica contaCliente;
		
		//criacao de uma ArrayList (BD básico) para armazenar as contas empresariais
		List<ContaEmpresarial> BDcontaEmpresarial = new ArrayList<ContaEmpresarial>();
		
		//criacao de uma ArrayList (BD básico) para armazenar as contas físicas
		List<ContaFisica> BDcontaFisica = new ArrayList<ContaFisica>();
		
		//conta empresarial teste criada
	    ContaEmpresarial wakaconta = new ContaEmpresarial(1009,1001,"Michele","Rua Flores",12345,"m@89mil.com",78099.0,"232313567","Docinhos Doces");
	    
	    //conta fisica teste criada
	    //numAgencia,numConta,nomeTitular,endereco,numTelefone,email,saldo
	    ContaFisica wakaconta2 = new ContaFisica(56543,29846,"Maria","Rua Caetano",464646,"maria@gamil.com",5400.0);
	    
	    //Adicionada conta teste no BD das contas empresariais
        BDcontaEmpresarial.add(wakaconta);
        
      //Adicionada conta teste no BD das contas físicas
        BDcontaFisica.add(wakaconta2);
		
        //Mensagem de boas vindas
        System.out.println(" -----------        WAKABANK - O SEU BANCO NEGRO          -----------");
        System.out.println(" ----------- Venha planejar seu futuro com nosso WAKABANK ----------- ");
        
        Scanner leia = new Scanner (System.in);
        
        //usamos o doWhile para garantir que o usuário não digite nada diferente de 1 e 2
        do 
        {
          System.out.println();	
          System.out.println(" Já possui conta? ");
          System.out.println(" Opção 1 - Sim");
          System.out.println(" Opção 2 - Não");
          escolha = leia.nextInt();
          if(!(escolha==1 || escolha==2)) {
        	System.out.println(" ----------- Essa opção não existe, digite novamente. ----------- ");
          }
          System.out.println();
        } while (!(escolha==1 || escolha==2));
        
        
        do 
        {
        	// Aqui é nosso menu de opções 
            if(escolha == 1) 
            {
              //parte que o usuário vai digitar a agencia e a conta para entrar no sistema
              System.out.println(" \n----------- WAKABANK -----------");
              System.out.print("Digite sua agência: ");
              agencia = leia.nextInt(); //digitar a agencia
              System.out.println();
              System.out.print("Digite sua conta: ");
              conta = leia.nextInt(); // digitar a conta
              System.out.println(" \n--------------------------------");
              System.out.println();

             
             //inserida trava de segurança. Só vai entrar no menu se encontrar uma agência e uma conta gravada no BD
             
             if ((Integer.toString(conta)).charAt(0) == '1') 
             {
               
               for(ContaEmpresarial buscarconta : BDcontaEmpresarial) 
               {
            	 if(buscarconta.getNumAgencia() == agencia && buscarconta.getNumConta() == conta) 
            	 {
            		 flag = true;
            		 contaEmpresa = buscarconta;
            	 } else 
            	 {
            		 System.out.println("!!!!! Agencia ou conta incorreta !!!!!");
            		 contaseguranca++; //acumula a quantidade de vezes que o usuário digitar
            		 //mecanismo de seguranca para o usuário digitar no máximo 3 vezes
            		 if(contaseguranca == 3) 
                     {
                    	 System.out.println("Você digitou errado três vezes e sua conta foi bloqueada.");
                    	 System.exit(0);
                     }
            	 }
               }
             } else 
             {
               
               for(ContaFisica buscarconta : BDcontaFisica) 
               {
              	 if(buscarconta.getNumAgencia() == agencia && buscarconta.getNumConta() == conta) 
              	 {
              		 flag = true;
              		 contaFisica = buscarconta;
              	 } 
              	 else 
              	 {
              	   System.out.println("!!!!! Agencia ou conta incorreta !!!!!");
              	   contaseguranca++; //acumula a quantidade de vezes que o usuário digitar
              	   //mecanismo de seguranca para o usuário digitar no máximo 3 vezes
              	   if(contaseguranca == 3)   
              	   {
                      System.out.println("Você digitou errado três vezes e sua conta foi bloqueada.");
                      System.exit(0);
                   }
              	 }
               }
            	 
             }
             
             
             
             
             System.out.println("\n ----------- Digite a opção desejada -----------");
            }
          } while(flag!=true);
            
          do
           {
        	 
            if(flag == true) 
            { 
              System.out.println(" -----------       Bem vindo!        -----------");
              System.out.println("\n 1 - Saldo ");
              System.out.println("\n 2 - Extrato");
              System.out.println("\n 3 - Doações");
              System.out.println("\n 4 - Dicas financeiras");
              System.out.println("\n 99 - Sair");
              System.out.println(" \n--------------------------------");
              op = leia.nextInt();
              switch(op) 
              {
        	     case 1:
        	 	   System.out.println("\n ----------- O saldo de sua wakaconta é: "+contaEmpresa.getSaldo() + " ----------- ");
        	 	   break;
        	     case 2:	// verificar como mostrar movimentações
        		   System.out.println("\n ----------- O extrato de sua wakaconta é: " + " ----------- ");
        		   break;
        	     case 3: // terminar quando aprendermos list
        		   System.out.println("\n  ");
        		   break;
        	     default: //inserir dicas 
        		   System.out.println(" ");
              } 
            } 
          } while(op!=99);  
     }   
}

  		

	
