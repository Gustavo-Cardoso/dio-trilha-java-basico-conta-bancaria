import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário e bter pelo scanner os valores digitados no terminal
        System.out.println("Por favor, informe o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, informe o valor a ser depositado: ");
        double saldoCliente = scanner.nextDouble();

        scanner.close(); // Fechar o Scanner é uma boa prática

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque.");
    }
}
