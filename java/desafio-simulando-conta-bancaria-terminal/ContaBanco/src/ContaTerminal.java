import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println(  String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo));
    

        sc.close();
    }
}

