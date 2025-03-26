import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o noso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
