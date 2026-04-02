package ProjetoBanco;

import java.util.Scanner;

public class operacao {
    funcoes f = new funcoes();
    Scanner sc;
    double saldo = 100;
    public operacao(Scanner sc) {
        this.sc = sc;
    }

    public void saldo() {
        System.out.println("---SALDO---");
        System.out.printf("Seu saldo é de: %.2f%n\n", saldo);
        System.out.println("Aperte Enter para voltar para o Menu");
        sc.nextLine();

    }

    public void depositar() {
        boolean valido = false;
        int tentativas = 0;
        System.out.println("---DEPOSITO---");
        while (!valido && tentativas < 3) {
            System.out.println("Digite quanto voce quer depositar: ");
            try {
                double deposito = Double.parseDouble(sc.nextLine());
                if (deposito < 2) {
                    System.out.println("Deposito invalido\n");
                    tentativas++;
                } else {
                    saldo = saldo + deposito;
                    System.out.println("Depositado com sucesso\n");
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Apenas Numericos\n");
                tentativas++;
            }
        }
        if (tentativas == 3) {
            f.excedeuTentativas();
            return;
        }
        System.out.println("Aperte Enter para voltar para o Menu");
        sc.nextLine();
    }


    public void sacar() {
        boolean valido = false;
        int tentativas = 0;
        System.out.println("---SACAR---");
        while (!valido && tentativas < 3) {
            System.out.println("Digite quanto voce quer sacar: ");
            try {
                double saque = Double.parseDouble(sc.nextLine());
                if (saque < 2) {
                    System.out.println("Valor de saque inferior a 2\n");
                    tentativas++;
                } else if (saque > saldo) {
                    System.out.println("Voce esta sem saldo");
                    System.out.printf("Seu saldo é de: %.2f%n\n", saldo);
                    tentativas++;
                } else {
                    saldo = saldo - saque;
                    System.out.println("Saque realizado com sucesso\n");
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Apenas Numericos\n");
                tentativas++;
            }
        }
        if (tentativas == 3) {
            f.excedeuTentativas();
            return;

        }
        System.out.println("Aperte Enter para voltar para o Menu");
        sc.nextLine();
    }
}