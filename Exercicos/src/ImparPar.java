import java.util.Scanner;

class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                                    /*
                                     here eu coleto as info do meu console
                                     System.out.print("Digite o Numero Que sera dividido: ");
                                      here amazeno-as em uma variavel inteira.
                                      double num1 = sc.nextDouble();
                                      System.out.print("Digite o Numero qeu sera o divisor");
                                      double num2 = sc.nextDouble();
                                      here sai a operação de um rsultado matematico qualquer
                                      System.out.println("resultado: " + (num1 / num2));
                                      */
        System.out.print("Digite o Numero1: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o Numero2: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 ) {
            System.out.println("O Numero: " + num1 + " é Par");
        } else   {
            System.out.println("O Numero: " + num1 + " é Impar");
        }
        if(num2 % 2 == 0) {
            System.out.println("O Numero: " + num2 + " é Par");
        } else {
            System.out.println("O Numero: "+ num2 +" é Impar");
        }
        sc.close();
        System.exit(0);
    }
}

