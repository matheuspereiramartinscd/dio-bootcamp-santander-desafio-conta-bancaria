import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao sistema de conta bancária!! \n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consume a nova linha pendente
        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Por favor, digite o nome do cliente ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nomeCliente, agencia, numero, saldo);
    }
}
