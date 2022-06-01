package Concessionaria;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Random gerador = new Random();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        
		//Fabricante
		String nomeFab = null;
		String cnpj = null;
		String telefone = null;
		
		//Cliente
		String nomeCliente = "";
		String cpf = "";
		String endereco = "";
		String telefoneCliente = "";
		String email = "";

		//Opcionais
		int codigoOpc = 0;
		String nomeOpc = null;
		//Automovel
		String modelo = null;
		String chassi = null;
		String cor = null;
		Double PrecoCusto = 0.00;
		//Automovel Usado
		String modeloUs = null;
		String chassiUs = null;
		String corUs = null ;
		Double PrecoCustoUs = 0.00 ;
		int anoFabricacao = 0;
		float km = 0 ;
		//Menu
		int codigo;
		int numero = 0;
		
		
		while( numero == 0){
			System.out.println("\nDigite o numero da opcao para:\n"
					+ " 1- Cadastar Cliente\n"
					+ " 2- Cadastrar Fabricante\n"
					+ " 3- Cadastrar um opcional\n"
					+ " 4- Cadastar um automovel\n"
					+ " 5- Cadastrar um automovel usado\n"
					+ " 6- Realizar a venda\n"
					+ " 7- Finalizar o programa");
			codigo = scanner.nextInt();
			
			switch(codigo) {
				case 1 :
					System.out.print("Digite o nome do Cliente:\n ");
					nomeCliente = scanner2.nextLine();
					System.out.print("Digite o CPF do Cliente:\n");
					cpf = scanner.next();
					System.out.print("Digite o telefone do Cliente:\n");
					telefoneCliente = scanner.next();
					System.out.print("Digite o endereco do Cliente:\n");
					endereco = scanner2.nextLine();
					System.out.print("Digite o email do Cliente:\n");
					email = scanner.next();
					break ;
				case 2 :
					System.out.println("Digite o nome do fabricante:");
					nomeFab = scanner.next();
					System.out.println("Digite o cnpj do fabricante:");
					cnpj = scanner.next();
					System.out.println("Digite o telefone do fabricante:");
					telefone = scanner.next();
					break;
				case 3 : 
					System.out.println("Digite o nome do opcional: ");
					nomeOpc = scanner.next();
					System.out.println("Digite o codigo do opcional: ");
					codigoOpc = scanner.nextInt();

					break;
				case 4 :
					System.out.println("Digite o numero do chassi: ");
					chassi = scanner.next();
					System.out.println("Digite o nome do modelo: ");
					modelo = scanner.next();
					System.out.println("Digite a cor do automovel: ");
					cor = scanner.next();
					System.out.println("Digite o preco do automovel: ");
					PrecoCusto = scanner.nextDouble();
					break;
				case 5 :
					System.out.println("Digite o numero do chassi: ");
					chassiUs = scanner.next();
					System.out.println("Digite o nome do modelo: ");
					modeloUs = scanner.next();
					System.out.println("Digite a cor do automovel: ");
					corUs = scanner.next();
                    System.out.println("Digite o preco do automovel: ");
                    PrecoCustoUs = scanner.nextDouble();
                    System.out.println("Digite o ano de fabricacao do automovel: ");
                    anoFabricacao = scanner.nextInt();
                    System.out.println("Digite o km do automovel: ");
                    km = scanner.nextFloat();
                    break;
				case 6 :
					Venda venda1 = new Venda();
					Cliente cliente = new Cliente(nomeCliente,cpf,endereco,telefoneCliente,email);
					Fabricante FAB = new Fabricante(nomeFab,cnpj,telefone);
					Automovel automovel = new Automovel(FAB,modelo,chassi,cor,PrecoCusto);
                    AutomovelUsado automovelUsado = new AutomovelUsado(FAB,modeloUs,chassiUs,corUs,PrecoCustoUs,anoFabricacao,km);
                    Opcional opcional = new Opcional(codigoOpc,nomeOpc);
					if(km > 0) {
						if(codigoOpc > 0) {
							automovelUsado.addopcional(opcional);
						}
						
						System.out.println("Cliente:"
												+ "\n Nome: " + cliente.getNome()
												+ "\n CPF: " + cliente.getCpf()
												+ "\n Endereco: " + cliente.getEndereco()
												+ "\n Telefone: " + cliente.getTelefone()
												+ "\n Email: " + cliente.getEmail()
												+ "\nNota Fiscal: "
												+ "\n numero: " + gerador.nextInt()
												+ "\n Data: " + dtf.format(LocalDateTime.now())
												+ "\nVeiculo: "
												+ "\n Nome: " + automovelUsado.getModelo()
												+ "\n Cor: " + automovelUsado.getCor()
												+ "\n Ano de fabricaao: " + automovelUsado.getAnoFabricacao()
												+ "\n KM: " + automovelUsado.getKm()
												+ "\n Custo Total: " + venda1.compraCarroUsado(cliente, automovelUsado));
					}else {
						if(codigoOpc > 0) {
							automovel.addopcional(opcional);
						}
						
						
						System.out.println("Cliente:"
											+ "\n Nome: " + cliente.getNome()
											+ "\n CPF: " + cliente.getCpf()
											+ "\n Endereco: " + cliente.getEndereco()
											+ "\n Telefone: " + cliente.getTelefone()
											+ "\n Email: " + cliente.getEmail()
											+ "\nNota Fiscal: "
											+ "\n numero: " + gerador.nextInt()
											+ "\n Data: " + dtf.format(LocalDateTime.now())
											+ "\nVeiculo: "
											+ "\n Nome: " + automovel.getModelo()
											+ "\n Cor: " + automovel.getCor()
											+ "\n Custo Total: " + venda1.compraCarroZero(cliente, automovel));
					}
					break;
				case 7:
					numero = 7;
					System.out.println("Sistema finalizado.");
					scanner.close();
					break;
			}
			
		}
	
	}

}