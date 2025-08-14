import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

        System.out.println("\nPor favor, digite o número da Agência! ");
        String agencia = scanner.next();

        System.out.println("Digita o número da conta: ");
        int numero = scanner.nextInt(); 
        
        System.out.println("Digito seu Nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
