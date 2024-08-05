import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        int saldo = 0;

        System.out.println("**Bem vindo ao sistema Bancário**");

        System.out.print("");
        System.out.println("Porfavor escrava seu nome:");
        nomeCliente = sc.nextLine();
        System.out.println("Porfavor digite o numero da agencia:");
        agencia = sc.nextLine();
        System.out.println("Porfavor digite o numero da conta:");
        numeroConta = sc.nextInt();
        System.out.println("Porfavor digite o seu saldo atual:");
        saldo = sc.nextInt();

        System.out.println();
        sc.close();

        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }

}
