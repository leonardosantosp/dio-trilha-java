import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nPor favor, digite seu nome !");
    String nomeCliente = scanner.nextLine();

    System.out.println("\nPor favor, digite o nome da agência ! ");
    String agencia = scanner.nextLine();

    System.out.println("\nPor favor, digite o número da agência ! ");
    int numero = scanner.nextInt();
    scanner.nextLine();

    System.out.println("\nPor favor, digite o saldo da conta ! ");
    double saldo = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
  }
}
