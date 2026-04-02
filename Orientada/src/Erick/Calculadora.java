package Erick;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);

    public void somar(int quant){
        double soma = 0;
        for (int i = 1; i<=quant;i++){
            System.out.print("Digite o "+i+"º valor: ");
            double valor = sc.nextDouble();
            soma = soma +  valor;
        }
        System.out.println("Resultado da soma: "+soma);
    }

    public void subtracao(int quant){
        System.out.print("Digite o 1º valor: ");
        double valor = sc.nextDouble();
        double sub = valor;
        for (int i = 2; i<=quant;i++){
            System.out.print("Digite o "+i+"º valor: ");
            valor = sc.nextDouble();
            sub = sub - valor;
        }
        System.out.println("Resultado da subtração: "+ sub);
    }

    public void multiplicacao(int quant){
        System.out.print("Digite o 1º valor: ");
        double valor = sc.nextDouble();
        double mult = valor;
        for (int i = 2; i<=quant;i++){
            System.out.print("Digite o "+i+"º valor: ");
            valor = sc.nextDouble();
            mult = mult * valor;
        }
        System.out.println("Resultado da multiplicação: "+ mult);
    }

    public void divisao(int quant) {
        System.out.print("Digite o 1º valor: ");
        double valor = sc.nextDouble();
        double div = valor;
        for (int i = 2; i <= quant; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            valor = sc.nextDouble();
            div = div / valor;
        }
        String resultado = String.format("Resultado da divisão: %.2f" , div);
        System.out.println(resultado);
    }

    public int menu(){
        int ope = 0;
        try {
            System.out.println("Qual operação matematica vc deseja fazer?");
            System.out.println("(1) Soma");
            System.out.println("(2) Subtração");
            System.out.println("(3) Divizao");
            System.out.println("(4) Multiplicacao");
            System.out.println("(5) Sair");
            ope = sc.nextInt();


                while (ope >= 6) {
                    System.out.print("operação matematica digitada errada! Digite novamente: ");
                    ope = sc.nextInt();
            }

        }catch(InputMismatchException e){
            System.out.print("Digite apenas números validos!");
        }
        return ope;
    }


    public void escolha(){
        int valor = menu();
        if(valor == 5){
            System.exit(0);
        }
        else{
            int quant = 0;
            switch (valor){
                case 1:
                    System.out.println("Quantos números você deseja digitar?");
                    quant = sc.nextInt();
                    somar(quant);
                    break;

                case 2:
                    System.out.println("Quantos números você deseja digitar?");
                    quant = sc.nextInt();
                    subtracao(quant);
                    break;

                case 3:
                    System.out.println("Quantos números você deseja digitar?");
                    quant = sc.nextInt();
                    divisao(quant);
                    break;

                case 4:
                    System.out.println("Quantos números você deseja digitar?");
                    quant = sc.nextInt();
                    multiplicacao(quant);
                    break;

            }
        }

    }

}