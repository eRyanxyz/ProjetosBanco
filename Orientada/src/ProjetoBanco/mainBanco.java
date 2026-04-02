package ProjetoBanco;

import java.util.Scanner;

public class mainBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        interfaceCL icl = new interfaceCL(sc);
        operacao oper = new operacao(sc);
        user usuario = new user(sc, icl);
        investimentos inves = new investimentos(sc,oper);
        interfaceBanco ib = new interfaceBanco(icl, oper, usuario, inves);
        inves.menuInvestimento();
        ib.menuCadastro();
       if (icl.logado == true) {
           ib.menuUsuario();
       }

        sc.close();
    }
}
