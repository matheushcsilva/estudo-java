package Desafio;

import java.util.Scanner;

public class TransferenciaBancaria {
    public static void main(String[] args) {
        String nomeCliente = "Matheus Henrique Caraça da Silva";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;
        int operacao =0;
        double saldoAtual = saldoInicial;

        String textCabecalho = STR."""
                ***********************
                Dados iniciais do cliente:

                Nome: \{nomeCliente}
                Tipo conta: \{tipoConta}
                Saldo inicial: R$ \{saldoAtual}
                ***********************

                """;
        String textOperacoes = """
                Operações

                1- Consultar saldos;
                2- Depositar valor;
                3- Transferir valor;
                4- Sair;
                """;

        Scanner leitura = new Scanner(System.in);

        System.out.print(textCabecalho);
        while (operacao != 4){
            System.out.println(textOperacoes);
            System.out.print("Deseja realizar qual operação? ");
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println(STR."Seu saldo atual é de R$ \{saldoAtual}");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = leitura.nextDouble();
                    saldoAtual += deposito;
                    System.out.println(STR."Seu novo saldo é de R$ \{saldoAtual}");
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    double transferencia = leitura.nextDouble();
                    if (transferencia > saldoAtual) {
                        System.out.println("A transferência não pode ser executada pois o valor é superior ao seu saldo atual");
                    } else {
                        saldoAtual -= transferencia;
                    }
                    System.out.println(STR."Seu saldo atual é de R$ \{saldoAtual}");
                    break;
                case 4:
                    break;
            }
        }



    }
}
