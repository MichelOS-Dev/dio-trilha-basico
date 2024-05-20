import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o número: ");
        int numero =  scanner.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo+" já está disponível para saque!");

        scanner.close(); //Algo não passado no curso, mas que é bom ressaltar é a utilização do scanner.close(); que é vista como uma boa prática para liberar recursos...
    }
}
