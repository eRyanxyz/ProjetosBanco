import java.util.Scanner;

public class med3n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1:");
        int n1 = sc.nextInt();
        System.out.println("Nota 2:");
        int n2 = sc.nextInt();
        System.out.println("Nota 3:");
        int n3 = sc.nextInt();

        int media = (n1+n2+n3)/3 ;
        System.out.println("media das Notas: "+media);
        sc.close();
    }
}