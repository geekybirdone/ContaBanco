import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //Criação do Scanner
        Scanner sc = new Scanner(System.in);

        //Definição das variáveis
        int numberCount;
        String agency;
        String clientName;
        float balance;

        //Solicição das informações
        System.out.println("--------------------------------------------");
        System.out.println("Por favor, digite os dados de sua conta");
        System.out.println("--------------------------------------------");
        System.out.print("\nDigite o número da sua conta: ");
        numberCount = sc.nextInt();
        System.out.print("Digite o número da sua agência (com o dígito): ");
        agency = sc.next();
        System.out.print("Digite o nome do titular: ");
        clientName = sc.next();
        System.out.print("Digite o valor do saldo inicial: ");
        balance = sc.nextFloat();

        //Impressão dos dados na tela
        System.out.println("\n--------------------------------------------");
        System.out.println("Dados da conta");
        System.out.println("--------------------------------------------");
        System.out.printf("\nOlá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", clientName, agency, numberCount, balance);

        //Fechamento do Scanner
        sc.close();
    }
}
