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
		
		//criacao de uma ArrayList (BD b�sico) para armazenar as contas empresariais
		List<ContaEmpresarial> BDcontaEmpresarial = new ArrayList<ContaEmpresarial>();
		
		//criacao de uma ArrayList (BD b�sico) para armazenar as contas f�sicas
		List<ContaFisica> BDcontaFisica = new ArrayList<ContaFisica>();
		
		//conta empresarial teste criada
	    ContaEmpresarial wakaconta = new ContaEmpresarial(1009,1001,"Michele","Rua Flores",12345,"m@89mil.com",78099.0,"232313567","Docinhos Doces");
	    
	    //conta fisica teste criada
	    //numAgencia,numConta,nomeTitular,endereco,numTelefone,email,saldo
	    ContaFisica wakaconta2 = new ContaFisica(56543,29846,"Maria","Rua Caetano",464646,"maria@gamil.com",5400.0);
	    
	    //Adicionada conta teste no BD das contas empresariais
        BDcontaEmpresarial.add(wakaconta);
        
      //Adicionada conta teste no BD das contas f�sicas
        BDcontaFisica.add(wakaconta2);
		
        //Mensagem de boas vindas
        System.out.println(" -----------        WAKABANK - O SEU BANCO NEGRO          -----------");
        System.out.println(" ----------- Venha planejar seu futuro com nosso WAKABANK ----------- ");
        
        Scanner leia = new Scanner (System.in);
        
        //usamos o doWhile para garantir que o usu�rio n�o digite nada diferente de 1 e 2
        do 
        {
          System.out.println();	
          System.out.println(" J� possui conta? ");
          System.out.println(" Op��o 1 - Sim");
          System.out.println(" Op��o 2 - N�o");
          escolha = leia.nextInt();
          if(!(escolha==1 || escolha==2)) {
        	System.out.println(" ----------- Essa op��o n�o existe, digite novamente. ----------- ");
          }
          System.out.println();
        } while (!(escolha==1 || escolha==2));
        
        
        do 
        {
        	// Aqui � nosso menu de op��es 
            if(escolha == 1) 
            {
              //parte que o usu�rio vai digitar a agencia e a conta para entrar no sistema
              System.out.println(" \n----------- WAKABANK -----------");
              System.out.print("Digite sua ag�ncia: ");
              agencia = leia.nextInt(); //digitar a agencia
              System.out.println();
              System.out.print("Digite sua conta: ");
              conta = leia.nextInt(); // digitar a conta
              System.out.println(" \n--------------------------------");
              System.out.println();

             
             //inserida trava de seguran�a. S� vai entrar no menu se encontrar uma ag�ncia e uma conta gravada no BD
             
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
            		 contaseguranca++; //acumula a quantidade de vezes que o usu�rio digitar
            		 //mecanismo de seguranca para o usu�rio digitar no m�ximo 3 vezes
            		 if(contaseguranca == 3) 
                     {
                    	 System.out.println("Voc� digitou errado tr�s vezes e sua conta foi bloqueada.");
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
              	   contaseguranca++; //acumula a quantidade de vezes que o usu�rio digitar
              	   //mecanismo de seguranca para o usu�rio digitar no m�ximo 3 vezes
              	   if(contaseguranca == 3)   
              	   {
                      System.out.println("Voc� digitou errado tr�s vezes e sua conta foi bloqueada.");
                      System.exit(0);
                   }
              	 }
               }
            	 
             }
             
             
             
             
             System.out.println("\n ----------- Digite a op��o desejada -----------");
            }
          } while(flag!=true);
            
          do
           {
        	 
            if(flag == true) 
            { 
              System.out.println(" -----------       Bem vindo!        -----------");
              System.out.println("\n 1 - Saldo ");
              System.out.println("\n 2 - Extrato");
              System.out.println("\n 3 - Doa��es");
              System.out.println("\n 4 - Dicas financeiras");
              System.out.println("\n 99 - Sair");
              System.out.println(" \n--------------------------------");
              op = leia.nextInt();
              switch(op) 
              {
        	     case 1:
        	 	   System.out.println("\n ----------- O saldo de sua wakaconta �: "+contaEmpresa.getSaldo() + " ----------- ");
        	 	   break;
        	     case 2:	// verificar como mostrar movimenta��es
        		   System.out.println("\n ----------- O extrato de sua wakaconta �: " + " ----------- ");
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

  		

	
