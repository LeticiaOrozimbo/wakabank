package wakabank;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import wakabank.ContaEmpresarial;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int escolha;
		int agencia;
		int conta;
		int op = 0;
		int contaseguranca = 0;
		int tipoEmpresa; // variavel cadastro de novas contas
		int escreveTelefone; // variavel cadastro de novas contas
		String escreveEndereco; // variavel cadastro de novas contas
		String escreveRG; // variavel cadastro de novas contas
		String escreveNome; // variavel cadastro de novas contas
		String escreveCNPJ; // variavel cadastro de novas contas
		String escreveNomeEmpresa; // variavel cadastro de novas contas
		String escreveCPF; // variavel cadastro de novas contas
		String escreveEmail; // variavel cadastro de novas contas
		double escreveSaldo; // variavel cadastro de novas contas

		boolean flag = false;
		ContaEmpresarial contaEmpresa = null;
		ContaFisica contaFisica = null;

		ContaEmpresarial adicionaEmpresa = null; // variavel usada no cadastro de novas contas
		ContaFisica adicionaFisica = null; // variavel usada no cadastro de novas contas

		DecimalFormat df = new DecimalFormat("R$ ###,###.##");

		// criacao de uma ArrayList (BD b�sico) para armazenar as contas empresariais
		List<ContaEmpresarial> BDcontaEmpresarial = new ArrayList<ContaEmpresarial>();

		// criacao de uma ArrayList (BD b�sico) para armazenar as contas f�sicas
		List<ContaFisica> BDcontaFisica = new ArrayList<ContaFisica>();

		// conta empresarial teste criada
		ContaEmpresarial wakaconta = new ContaEmpresarial(1009, 1001, "Michele", "Rua Flores", 12345, "m@89mil.com",
				100.0, "232313567", "Docinhos Doces");

		// conta fisica teste criada
		// numAgencia,numConta,nomeTitular,endereco,numTelefone,email,saldo
		ContaFisica wakaconta2 = new ContaFisica(56543, 29846, "Maria", "Rua Caetano", 464646, "maria@gamil.com",
				5400.0);

		// Adicionada conta teste no BD das contas empresariais
		BDcontaEmpresarial.add(wakaconta);

		// Adicionada conta teste no BD das contas f�sicas
		BDcontaFisica.add(wakaconta2);

		// Mensagem de boas vindas
		System.out.println(" -----------        WAKABANK - O SEU BANCO NEGRO          -----------");
		System.out.println(" ----------- Venha planejar seu futuro com nosso WAKABANK ----------- ");

		Scanner leia = new Scanner(System.in);

		// usamos o doWhile para garantir que o usu�rio n�o digite nada diferente de 1 e
		// 2
		do {
			System.out.println();
			System.out.println(" Realizar login? ");
			System.out.println(" Op��o 1 - Sim");
			//System.out.println(" Op��o 2 - N�o");
			System.out.print(" Digite: ");
			escolha = leia.nextInt();
			if (!(escolha == 1 || escolha == 2)) {
				System.out.println(" ----------- Essa op��o n�o existe, digite novamente. ----------- ");
			}
			System.out.println();
		} while (!(escolha == 1 || escolha == 2));

		/*
		 * Implementa��o futura if (escolha == 2) {
		 * 
		 * 
		 * Random r = new Random(System.currentTimeMillis());
		 * 
		 * try { do {
		 * System.out.println("Voc� � (1) Pessoa Jur�dica ou (2) Pesso F�sica: ");
		 * tipoEmpresa = leia.nextInt(); } while (!(tipoEmpresa == 1 || tipoEmpresa ==
		 * 2));
		 * 
		 * 
		 * System.out.println("Digite seu RG: "); escreveRG = leia.next();
		 * 
		 * System.out.println("Digite seu nome: "); escreveNome = leia.next();
		 * 
		 * System.out.println("Digite seu email: "); escreveEmail = leia.next();
		 * 
		 * System.out.println("Digite seu telefone: "); escreveTelefone =
		 * leia.nextInt();
		 * 
		 * System.out.println("Digite seu CPF: "); escreveCPF = leia.next();
		 * 
		 * System.out.println("Digite seu endere�o: "); escreveEndereco = leia.next();
		 * 
		 * System.out.println("Qual seria a quantia inicial da sua conta?: ");
		 * escreveSaldo = leia.nextDouble();
		 * 
		 * if (tipoEmpresa == 1) { System.out.println("Digite seu CPNJ: "); escreveCNPJ
		 * = leia.next(); System.out.println("Digite o nome da sua empresa: ");
		 * escreveNomeEmpresa = leia.next(); BDcontaEmpresarial.add(new
		 * ContaEmpresarial(10000 + r.nextInt(20000),10000 +
		 * r.nextInt(20000),escreveNome,escreveEndereco,escreveTelefone,escreveEmail,
		 * escreveSaldo,escreveCNPJ,escreveNomeEmpresa)); } else { BDcontaFisica.add(new
		 * ContaFisica(10000 + r.nextInt(20000),10000 +
		 * r.nextInt(20000),escreveNome,escreveEndereco,escreveTelefone,escreveEmail,
		 * escreveSaldo)); }
		 * 
		 * } catch (Exception e) { System.err.println("A mensagem de erro: "+e); } }
		 * 
		 * for(ContaEmpresarial mostraconta: BDcontaEmpresarial) {
		 * System.out.println(mostraconta); }
		 */

		do {
			// Aqui � nosso menu de op��es
			if (escolha == 1) {
				// parte que o usu�rio vai digitar a agencia e a conta para entrar no sistema
				System.out.println(" \n----------- WAKABANK -----------");
				System.out.print("Digite sua ag�ncia: ");
				agencia = leia.nextInt(); // digitar a agencia
				System.out.println();
				System.out.print("Digite sua conta: ");
				conta = leia.nextInt(); // digitar a conta
				System.out.println(" \n--------------------------------");
				System.out.println();

				// inserida trava de seguran�a. S� vai entrar no menu se encontrar uma ag�ncia e
				// uma conta gravada no BD. Quando isso tiver, vai ser gerada uma flag = true.
				// S� � poss�vel entrar no sistema com a flag=true

				if ((Integer.toString(conta)).charAt(0) == '1') {

					for (ContaEmpresarial buscarconta : BDcontaEmpresarial) {
						if (buscarconta.getNumAgencia() == agencia && buscarconta.getNumConta() == conta) {
							flag = true;
							contaEmpresa = buscarconta;
						} else {
							System.out.println("!!!!! Agencia ou conta incorreta !!!!!");
							contaseguranca++; // acumula a quantidade de vezes que o usu�rio digitar
							// mecanismo de seguranca para o usu�rio digitar no m�ximo 3 vezes
							if (contaseguranca == 3) {
								System.out.println("Voc� digitou errado tr�s vezes e sua conta foi bloqueada.");
								System.exit(0);
							}
						}
					}
				} else {

					for (ContaFisica buscarconta : BDcontaFisica) {
						if (buscarconta.getNumAgencia() == agencia && buscarconta.getNumConta() == conta) {
							flag = true;
							contaFisica = buscarconta;
						} else {
							System.out.println("!!!!! Agencia ou conta incorreta !!!!!");
							contaseguranca++; // acumula a quantidade de vezes que o usu�rio digitar
							// mecanismo de seguranca para o usu�rio digitar no m�ximo 3 vezes
							if (contaseguranca == 3) {
								System.out.println("Voc� digitou errado tr�s vezes e sua conta foi bloqueada.");
								System.exit(0);
							}
						}
					}

				}

				System.out.println("\n ----------- Digite a op��o desejada -----------");
			}

		} while (flag != true);

		do {

			if (flag == true) {
				System.out.println(" -----------       Bem vindo!        -----------");
				System.out.println("\n 1 - Saldo ");
				System.out.println("\n 2 - Deposito");
				System.out.println("\n 3 - Saque");
				System.out.println("\n 4 - Doa��es");
				System.out.println("\n 5 - Dicas financeiras");
				System.out.println("\n 99 - Sair");
				System.out.print("\n Digite: ");
				op = leia.nextInt();

				switch (op) {
				case 1:
					if (contaEmpresa != null) {
						System.out.println("");
						System.out.println(" ---------------------------------------------------------- ");
						System.out.println(" ----------- O saldo de sua wakaconta �: "
								+ df.format(contaEmpresa.getSaldo()) + " ----------- ");
						System.out.println(" ---------------------------------------------------------- ");
						System.out.println();
					} else {
						System.out.println("");
						System.out.println(" ---------------------------------------------------------- ");
						System.out.println(" ----------- O saldo de sua wakaconta �: "
								+ df.format(contaFisica.getSaldo()) + " ----------- ");
						System.out.println(" ---------------------------------------------------------- ");
						System.out.println("");

					}

					break;
				case 2:
					System.out.println("\n ------------------   Deposito   ------------------");
					System.out.print("  Digite a quantia que deseja depositar em sua conta: ");
					double valor = leia.nextDouble();
                    System.out.println("");
					if (contaEmpresa != null) {
						contaEmpresa.Deposito(valor);
					} else {
						contaFisica.Deposito(valor);
					}

					break;
				case 3: // terminar quando aprendermos list
					System.out.println("\n ------------------   Saque   ------------------");
					System.out.print("  Digite o valor deseja sacar:  ");
					double valorSaque = leia.nextDouble();
					System.out.println("");
					

					if (contaEmpresa != null) {
						contaEmpresa.Saque(valorSaque);
					} else {
						contaFisica.Saque(valorSaque);
					}

					break;

				case 4:
					System.out.print("\n Digite o valor que deseja doar:  ");
					double valorDoacao = leia.nextDouble();
					if (contaEmpresa != null) {
						System.out.println("\n Voc� doou " + df.format(valorDoacao)
								+ " e o WakaBank adicionou um b�nus de 50%. A institui��o parceira Generation ir� receber um valor de:  "
								+ df.format(contaEmpresa.Doacao(valorDoacao)));
					} else {
						System.out.println("\n Voc� doou " + df.format(valorDoacao)
								+ " e o WakaBank adicionou um b�nus de 25%. A institui��o parceira Generation ir� receber um valor de:  "
								+ df.format(contaFisica.Doacao(valorDoacao)));
					}
					break;
				case 5: // dicas financeiras
					if (contaEmpresa != null) {
						System.out.println("\n -------------------------   DICAS FINANCEIRAS   ------------------------- "
								+ "\nM�TODO DO 50 30 20 - Equilibre suas finan�as por meio deste m�todo financeiro "
								+ " \nDeixe 50% para os gastos essenciais (Alimenta��o, transporte, moradia e etc) "
								+ " \nDeixe 30% para os gastos com desejos (entreterimentos, restautantes, cinema e etc"
								+ " \nE deixe 20% para investimentos pessoais! "
								+ " \nCalculo com base no seu saldo  \n50% para atividades essenciais: "
								+ df.format(contaEmpresa.getSaldo() * 0.5) + "\n30% para atividades de desejos: "
								+ df.format(contaEmpresa.getSaldo() * 0.3) + "\n20% para investimentos: "
								+ df.format(contaEmpresa.getSaldo() * 0.2));

						System.out.println(
								"\n\n Uma dica: se voc� conseguir gardar os 20% de investimentos durante um ano, esse seriam seus ganhos: "
										+ df.format((contaEmpresa.getSaldo() * 0.2) * 12));
					} else {
						System.out.println("\n -------------------------   DICAS FINANCEIRAS   ------------------------- "
								+ "\nM�TODO DO 50 30 20 - Equilibre suas finan�as por meio deste m�todo financeiro "
								+ " \nDeixe 50% para os gastos essenciais (Alimenta��o, transporte, moradia e etc)  "
								+ "Deixe 30% para os gastos com desejos (entreterimentos, restautantes, cinema e etc"
								+ " \nE deixe 20% para investimentos pessoais! "
								+ " \nCalculo com base no seu saldo  \n50% para atividades essenciais: "
								+ df.format(contaFisica.getSaldo() * 0.5) + "\n30% para atividades de desejos: "
								+ df.format(contaFisica.getSaldo() * 0.3) + "\n20% para investimentos: "
								+ df.format(contaFisica.getSaldo() * 0.2));

						System.out.println(
								"\n\n Uma dica: se voc� conseguir gardar os 20% de investimentos durante um ano, esse seriam seus ganhos: "
										+ df.format((contaFisica.getSaldo() * 0.2) * 12));

					}
					break;
				default:
					System.out.println(" ");

				}
			}
		} while (op != 99);
		System.out.println("Voc� encerrou o app, volte sempre! ");
	}
}
