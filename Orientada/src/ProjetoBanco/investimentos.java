package ProjetoBanco;

import java.util.Scanner;

public class investimentos {
    operacao oper;
    Scanner sc;
    funcoes f = new funcoes();
    double saldoCDB = 0;
    double saldoLCi = 0;
    double saldoTD = 0;

    public investimentos(Scanner sc, operacao oper) {
        this.sc = sc;
        this.oper = oper;
    }

    public void menuInvestimento() {
        int tentativa = 0;
        boolean rep = true;
        while (rep) {
            try {


                System.out.println("---INVESTIMENTOS---");
                System.out.println("Oque voce deseja Investir: ");
                System.out.println("---CDB---[1]");
                System.out.println("---LCI---[2]");
                System.out.println("---TESOURODIRETO---[3]");
                System.out.println("---SacarParaContaCorrente---[4]");
                System.out.println("---SAIR---[5]");
                int opc = Integer.parseInt(sc.nextLine());
                if (opc < 1 || opc > 5) {
                    System.out.println("opçao invalida\n");
                } else {
                    switch (opc) {
                        case 1:
                            System.out.println("Saldo em conta: "+ oper.saldo);
                            System.out.println("Saldo CDB atual: " + saldoCDB);
                            investirCDB();
                            break;
                        case 2:
                            System.out.println("Saldo em conta: "+ oper.saldo);
                            System.out.println("Saldo LCI atual: " + saldoLCi);
                            investirLCI();
                            break;
                        case 3:
                            System.out.println("Saldo em conta: "+ oper.saldo);
                            System.out.println("Saldo Tisouro Direto atual: " + saldoTD);
                            investirTesouroDireto();
                            break;
                        case 4:
                            sacarInvestimento();
                            break;
                        case 5:
                            f.sair();
                            rep = false;
                            break;
                        default:
                            System.out.println("Investimento invalido");
                            break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Apenas Numericos\n");
                tentativa++;
            }
            if (tentativa == 3) {
                f.excedeuTentativas();
                return;
            }
        }
    }

    public void investirCDB() {
        int tentativa = 0;
        System.out.println("---CDB Investir---");
        System.out.println("Qual o valor voce deseja Investir: ");
        double invest = Double.parseDouble(sc.nextLine());
        if (invest < 1) {
            System.out.println("Investimento invalido");
            tentativa++;
        } else if (invest >= oper.saldo ) {
            System.out.println("Voce não possoui saldo ");
            System.out.printf("Seu saldo é: %.2f%n\n", oper.saldo);
            tentativa++;
        } else {
            double taxa = 0.012;
            double rendimento = invest * taxa;
            saldoCDB = invest + rendimento;
            double v = invest - oper.saldo;
            System.out.println("Investimento realizado com suceso: \n" + invest);
            System.out.println("Aperte Enter para voltar para o Menu\n");
            sc.nextLine();

        }
    }

    public void investirLCI() {
        int tentativa = 0;
        System.out.println("---LCI Investir---");
        System.out.println("Oque voce deseja Investir: ");
        double invest = Double.parseDouble(sc.nextLine());
        if (invest < 1) {
            System.out.println("Investimento invalido");
            tentativa++;
        } else if (invest > oper.saldo || invest < oper.saldo) {
            System.out.println("Voce não possoui saldo ");
            System.out.printf("Seu saldo é: %.2f%n\n", oper.saldo);
            tentativa++;
        } else {
            double rendimento = invest * 0.0095;
            saldoLCi = invest + rendimento;
            double v = invest - oper.saldo;
        }
    }

    public void investirTesouroDireto() {
        int tentativa = 0;
        System.out.println("---Tesouro Direto Investir---");
        System.out.println("Oque voce deseja Investir: ");
        double invest = Double.parseDouble(sc.nextLine());
        if (invest < 1) {
            System.out.println("Investimento invalido");
            tentativa++;
        } else if (invest > oper.saldo || invest < oper.saldo ) {
            System.out.println("Voce não possoui saldo ");
            System.out.printf("Seu saldo é: %.2f%n\n", oper.saldo);
            tentativa++;
        } else {
            double taxa = 0.011;
            double rendimento = oper.saldo * taxa;
            saldoTD = invest + rendimento;
            double v = invest - oper.saldo;
        }
    }

    public void sacarInvestimento() {
        int tentativa = 0;
        System.out.println("---Sacar Investimentos---");
        System.out.println("Qual voce deseja sacar");
        System.out.println("CDB-- [1]");
        System.out.println("LCI--- [2]");
        System.out.println("TESOURODIRETO---[3]");
        int opc = Integer.parseInt(sc.nextLine());
        if (opc < 1 || opc > 3) {
            System.out.println("Opcao invalida\n");
            tentativa++;
        } else {
            switch (opc) {
                case 1:
                    if (saldoCDB == 0) {
                        System.out.println("Voce não possoui saldo nesse investimento \n");
                        System.out.println("Aperte Enter para voltar para o Menu");
                        sc.nextLine();
                        return;
                    }
                    System.out.println("Saldo CDB atual: " + saldoCDB);
                    System.out.println("quanto voce deseja sacar");
                    double sacarCDB = Double.parseDouble(sc.nextLine());

                    if (sacarCDB > saldoCDB || sacarCDB < saldoCDB) {
                        System.out.println("não e possivel sacar esse valor");
                        tentativa++;
                    }else {
                        System.out.println("saque realizado");
                        oper.saldo = sacarCDB - saldoCDB;
                    }
                    break;
                case 2:
                    if (saldoLCi == 0) {
                        System.out.println("Voce não possoui saldo nesse investimento \n");
                        System.out.println("Aperte Enter para voltar para o Menu");
                        sc.nextLine();
                        return;
                    }
                    System.out.println("Saldo LCI atual: " + saldoLCi);
                    System.out.println("quanto voce deseja sacar");
                    double sacarLCI = Double.parseDouble(sc.nextLine());
                    if (sacarLCI > saldoLCi|| sacarLCI < saldoLCi) {
                        System.out.println("nao e possivel sacar esse valor");
                        tentativa++;
                    }else{
                        System.out.println("saque realizado");
                        oper.saldo = sacarLCI - saldoLCi;
                    }
                    break;
                case 3:
                    if (saldoTD == 0) {
                        System.out.println("Voce não possoui saldo nesse investimento \n");
                        System.out.println("Aperte Enter para voltar para o Menu");
                        sc.nextLine();
                        return;
                    }
                    System.out.println("Saldo Tisouro Direto atual: " + saldoTD);
                    System.out.println("quanto voce deseja sacar");
                    double sacarTD = Double.parseDouble(sc.nextLine());
                    if (sacarTD > saldoTD|| sacarTD < saldoTD) {
                        System.out.println("nao e possivel sacar esse valor");
                        tentativa++;
                    }else {
                        System.out.println("saque realizado");
                        oper.saldo = sacarTD - saldoTD;
                    }
                    break;
                default:
                    System.out.println("Investimento invalido");
                    break;

            }
        }
    }
}