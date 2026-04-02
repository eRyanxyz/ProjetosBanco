package Carro;

import java.util.Scanner;

public class Carro {
    Scanner sc = new Scanner(System.in);

    public void exibirInfo() {
        System.out.println("Modelo:");
        String modelo = sc.nextLine();
        System.out.println("Cor:");
        String cor = sc.nextLine();
        System.out.println("Placa:");
        String placa = sc.nextLine();

        System.out.println("Modelo: " + modelo + "\nCor: " + cor + "\nPlaca: " + placa);
    }
}
