import java.util.Scanner;
public class CadastrodeUsuario {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean rep = true;
        String cpfC = "";
        do {
            System.out.println("..........................................................................................................................");
            System.out.println("Bem vindo");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Entrar");
            System.out.println("[3] Sair");
            System.out.println("..........................................................................................................................\n");
            int opc = sc.nextInt();
            if (opc >= 4 || opc <= 0) {
                System.out.println("opção invalida digite novamente\n\n");
            }
            switch (opc) {
                case 1:
                    boolean rep1 = true;
                    if (cpfC.length() == 14) {
                        System.out.println("Cpf ja cadastrdo");
                    } else {
                        do {

                            System.out.println("..........................................................................................................................");
                            System.out.println("Cadastro:");
                            System.out.println("Digite seu CPF:");
                            System.out.println("..........................................................................................................................");
                            cpfC = sc.next();
                            if (cpfC.length() != 14) {
                                System.out.println("Cpf invalido\nDigite novamente\n");
                                cpfC = "";
                            } else {
                                System.out.println("Cpf Cadastrado\n");
                                rep1 = false;
                            }
                        } while (rep1);
                    }
                    break;
                case 2:
                    boolean rep2 = true;
                    sc.nextLine();
                    if (cpfC.equals("") || cpfC.length() != 14) {
                        System.out.println("Cadastre-se Primeiro\n");
                    } else {
                        do {
                            System.out.println("Entrar:");
                            System.out.println("Digite seu CPF:");
                            String cpfE = sc.nextLine();
                            if (cpfE.length() == 14 && cpfE.equals(cpfC)) {
                                System.out.println("Logado com sucesso");
                                rep2 = false;
                                rep = false;
                            } else {
                                System.out.println("Cpf invalido\nDigite novamente\n");
                            }
                        }while (rep2);
                    }
                    break;
                case 3:
                    System.out.println("Saindo.......");
                    rep = false;
                default:
            }
        } while (rep);
    }
}
