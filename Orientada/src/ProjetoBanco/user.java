package ProjetoBanco;

import java.util.Scanner;

public class user {
    Scanner sc;
    interfaceCL incl;

    public user(Scanner sc, interfaceCL icl) {
        this.sc = sc;
        this.incl = icl;
    }

    public void infoUsuario() {
        System.out.println("Nome: " + incl.nome);
        System.out.println("Sobrenome: " + incl.sobrenome);
        System.out.println("Cpf: " + incl.cpfCadastrado);
        System.out.println("Aperte Enter para voltar para o Menu");
        sc.nextLine();
    }
}
