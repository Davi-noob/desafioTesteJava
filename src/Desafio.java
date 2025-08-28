import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Hunter S";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo atual: $%.2f\n", saldo);
        System.out.println("\n**************************");

        String menu = """
               \n** Digite sua opção **
               1 - Consultar saldo
               2 - Transferir valor
               3 - Receber valor
               4 - Sair
               """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.printf("\nSeu saldo é igual a $%.2f\n", saldo);

            } else if (opcao == 2) {
                System.out.print("Digite quanto deseja transferir: $");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente.");
                } else {
                    saldo -= valor;
                    System.out.printf("Transferência realizada. Novo saldo: $%.2f\n", saldo);
                }

            } else if (opcao == 3) {
                System.out.print("Digite o valor a receber: $");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.printf("Depósito realizado com sucesso. Novo saldo: $%.2f\n", saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("\nOperação finalizada");
        scanner.close();
    }
}
