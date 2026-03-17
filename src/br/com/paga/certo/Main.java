package br.com.paga.certo;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista que guarda os registros de extrato
        ArrayList<Extrato> listaTransacoes = new ArrayList<>();

        System.out.println("--- BEM-VINDO AO PAGACERTO ---");

        // coletando os dados do usuario
        System.out.print("Digite seu nome: ");
        String nomeDigitado = scanner.nextLine();
        System.out.print("Digite seu email: ");
        String emailDigitado = scanner.nextLine();
        System.out.print("Crie sua senha: ");
        String senhaDigitada = scanner.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpfDigitado = scanner.nextLine();

        //  objeto Usuario
        Usuario user = new Usuario(nomeDigitado, emailDigitado, senhaDigitada, cpfDigitado);

        //  Chamando o método do objeto
        System.out.println(user.obterSaudacao());

        //variaveis menu
        int opcao = 0;

        // Objeto de Logoff
        Logoff online = new Logoff('s');

        // Menu de Operacoes
        do {
            System.out.println("/n---------MENU DE OPÇÕES----------");
            System.out.println("1 - Realizar um deposito");
            System.out.println("2 - Pagar Novo Boleto");
            System.out.println("3 - Consultar Extrato");
            System.out.println("4 - Sair da sua Conta");
            System.out.print("Escolha o numero da sua opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Deposito
                    System.out.println("Qual o valor que será depositado?");
                    double valorDep = scanner.nextDouble();
                    user.depositar(valorDep);

                    // Adicionando ao extrato
                    listaTransacoes.add(new Extrato("Deposito Inicial", "16/03/2026", valorDep));
                    System.out.println("Saldo atual: R$ " + user.saldo);
                    break;

                case 2:
                    // Cadastro e pagamento de boletos
                    System.out.println("/n-------CADASTRO DE BOLETOS--------");
                    System.out.println("Nome da conta (ex: Internet):");
                    String nomeC = scanner.next();
                    System.out.print("Valor do boleto:");
                    double valorC = scanner.nextDouble();

                    Boletos conta = new Boletos(nomeC, valorC);

                    // Verificação de saldo
                    if (user.saldo >= conta.valorConta) {
                        conta.pagamentoBoleto(user);  // Chama o metodo de subtração
                        // Registra no extrato
                        listaTransacoes.add(new Extrato("Pagamento: " + nomeC, "16/03/2026", valorC));
                    } else {
                        System.out.println("Saldo insuficiente para realizar o pagamento do boleto!");
                    }
                    break;

                case 3:
                    // Consulta de extrato
                    System.out.println("/n-------SEU EXTRATO---------");
                    if (listaTransacoes.isEmpty()) {
                        System.out.println("Nenhum extrato foi encontrado!");
                    } else {
                        for (Extrato registro : listaTransacoes) {
                            registro.exibirExtrato();   // Chama o metodo da classe extrato
                        }
                    }
                    System.out.println("Saldo atual: R$ " + user.saldo);
                    break;

                case 4:
                    // logoff usuario
                    System.out.println("Deseja realmente sair da sua conta?(s/n)");
                    char resposta = scanner.next().charAt(0);
                    if (resposta == 's') {
                        System.out.println("Volte logo!");
                        online.Logado = 'n';
                        opcao = 0;
                    } else {
                        System.out.println("Você continua logado!");
                        opcao = -1;
                    }
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;

            }


        } while (opcao != 0);
    }
}











