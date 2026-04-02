import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean rep = true;
        do {
            System.out.println("Calculadora");
            System.out.println("Qual operação matematica vc deseja fazer?");
            System.out.println("(1) Soma");
            System.out.println("(2) Subtração");
            System.out.println("(3) Divizao");
            System.out.println("(4) Multiplicacao");
            System.out.println("(5) Sair");
            int ope = sc.nextInt();

            while (ope >= 6 || ope <= 0) {
                System.out.println("ivalido digite novamnete");
                ope = sc.nextInt();
            }
            System.out.println("Digite o primeiro numero: ");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            int n2 = sc.nextInt();
            switch (ope) {
                case 1:
                    System.out.println("Soma: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Subtração: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Multiplicação: " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("Divisão: " + (n1 / n2));
                    break;
                default:
            }
            System.out.println("Você deseja repetir[1] sim [2] não");
            int repetir = sc.nextInt();
            if (repetir == 1) {
                rep = true;
            } else {
                System.out.println("Saindo.....");
                rep = false;
            }
        } while (rep);
    }
}