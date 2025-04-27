import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Número conta: ");
        int numConta = in.nextInt();
        System.out.print("Agência: ");
        String agencia = in.next();
        System.out.print("Nome: ");
        String nome = in.next();
        System.out.print("Saldo: ");
        double saldo = in.nextDouble();

        System.out.printf("Número conta: \t%d%n", numConta);
        System.out.printf("Agência: \t\t%s%n", agencia);
        System.out.printf("Nome: \t\t\t%s%n", nome);
        System.out.printf("Saldo: \t\t\t%.2f%n", saldo);

    }

}