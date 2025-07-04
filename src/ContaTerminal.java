import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("-----Bem vindo!-----");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o valor do depósito: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá "+nome+", obrigado por criar uma conta em nosso banco!\nSua AGÊNCIA é: "+
                agencia+"\nSua CONTA é: "+numero+"\nE seu SALDO: ("+saldo+") Já está disponível para saque!" );
    }
}
