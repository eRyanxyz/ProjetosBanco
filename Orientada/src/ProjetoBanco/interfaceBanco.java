package ProjetoBanco;

import java.util.Scanner;

public class interfaceBanco {
    funcoes f = new funcoes();
    investimentos inves;
    user user;
    interfaceCL icl;
    operacao ope;

    boolean repG = true;
    Scanner sc;

    public interfaceBanco(interfaceCL icl, operacao ope, user user, investimentos inves) {
        this.icl = icl;
        this.ope = ope;
        this.user = user;
        this.inves = inves;
        this.sc = icl.sc;
    }


    public void menuCadastro() {
        int tentativas = 0;
        do {
            try {
                System.out.println("---MENU LOG---");
                System.out.println("---MENU CADASTRO[1]---");
                System.out.println("---MENU LOGIN[2]---");
                System.out.println("---MENU Sair[3]---");
                int opc = Integer.parseInt(sc.nextLine());
                if (opc < 1 || opc > 3) {
                    System.out.println("Opção errada! Digite novamente.");
                } else {
                    switch (opc) {
                        case 1:
                            boolean rep = true;
                            do if (icl.cpfCadastrado.length() == 14) {
                                System.out.println("Já um Cadastro de Conta Corrente");
                                rep = false;

                            } else {
                                icl.cadastrar();
                                rep = false;

                            } while (rep);
                            break;
                        case 2:
                            icl.login();
                            if (icl.logado) {
                                repG = false;
                            }
                            break;
                        case 3:
                            f.sair();
                            repG = false;
                            break;
                        default:
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Apenas Numericos\n");

            }
        } while (repG);

    }

    public void menuUsuario() {
        boolean repL = true;
        do {
            try {
                System.out.println("---MENU BANCO---");
                System.out.println("---MENU SALDO[1]---");
                System.out.println("---MENU DEPOSITAR[2]---");
                System.out.println("---MENU INVESTIMENTO[3]---");
                System.out.println("---MENU Sacar[4]---");
                System.out.println("---MENU Usuario(5]---");
                System.out.println("---MENU Sair[6]---");
                int opc = Integer.parseInt(sc.nextLine());
                if (opc < 1 || opc > 6) {
                    System.out.println("opçao invalida");
                } else {
                    switch (opc) {
                        case 1:
                            ope.saldo();
                            break;
                        case 2:
                            ope.depositar();
                            break;
                        case 3:
                            inves.menuInvestimento();
                            break;
                        case 4:
                            ope.sacar();
                            break;
                        case 5:
                            user.infoUsuario();
                            break;
                        case 6:
                            f.sair();
                            repL = false;
                            break;
                        default:
                            break;
                    }
                }
            }catch (NumberFormatException e) {
                System.out.println("Apenas Numericos\n");

            }
        } while (repL);
    }
}
