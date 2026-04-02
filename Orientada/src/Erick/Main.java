package Erick;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        calc.escolha();
        boolean isContinuar = true;
        while (isContinuar) {
            System.out.println("\nVocê deseja repetir? [1] - Sim | [2] - Não ");
            int res = sc.nextInt();
            if (res == 1) {
                calc.escolha();
            } else {
                isContinuar = false;
            }
        }
    }
}