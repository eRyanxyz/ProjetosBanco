package ProjetoBanco;

import java.util.Scanner;

public class interfaceCL {
    funcoes f = new funcoes();
    Scanner sc;
    String nome = "";
    String sobrenome = "";
    String cpfCadastrado = "";
    String cpfDigitado = "";
    String senhaCadastrada = "";
    String senhaDigitada = "";
    boolean logado = false;


    public interfaceCL(Scanner sc) {
        this.sc = sc;
    }

    public void cadastrar() {
        boolean repC = true;
        boolean repS = true;
        int tentCpf = 0;
        int tentSenha = 0;

        System.out.println("Digite seu Nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        sobrenome = sc.nextLine();
        do {
            if (tentCpf == 3) {
                f.excedeuTentativas();
                return;
            }
            System.out.println("Digite seu Cpf: ");
            cpfCadastrado = sc.nextLine();
            if (cpfCadastrado.equals("") || cpfCadastrado.length() != 14) {
                System.out.println("Cpf invalido");
                tentCpf++;
            } else {
                System.out.println("Cpf cadastrado\n");
                repC = false;
            }
        } while (repC);


        do {
            if (tentSenha == 3) {
                f.excedeuTentativas();
                return;
            }
            System.out.println("Digite sua Senha: Deve conter 8 caracteres");
            senhaCadastrada = sc.nextLine();
            if (senhaCadastrada.equals("") || senhaCadastrada.length() != 8) {
                System.out.println("Senha invalida");
                tentSenha++;
            } else {
                System.out.println("Senha cadastrada\n");
                repS = false;
            }
        } while (repS);

        System.out.println("Cadastro realizado com sucesso");
        cpfDigitado = cpfCadastrado;
        senhaDigitada = senhaCadastrada;
    }

    public void login() {
        boolean repC = true;
        boolean repS = true;
        int tentCpf = 0;
        int tentSenha = 0;

        if (cpfCadastrado.equals("") || cpfCadastrado.length() != 14) {
            System.out.println("Faca o cadastro primeiro");
            return;
        }
        do {
            if (tentCpf == 3) {
                f.excedeuTentativas();
                return;
            }
            System.out.println("Digite seu Cpf: ");
            cpfDigitado = sc.nextLine();
            if (!cpfDigitado.equals(cpfCadastrado)) {
                System.out.println("Cpf invalido");
                tentCpf++;
            } else {
                repC = false;
            }

        } while (repC);
        do {
            if (tentSenha == 3) {
                f.excedeuTentativas();
                return;
            }
            System.out.println("Digite sua Senha: ");
            senhaDigitada = sc.nextLine();
            if (!senhaDigitada.equals(senhaCadastrada)) {
                System.out.println("Senha invalida");
                tentSenha++;
            } else {
                System.out.println("Login realizado com sucesso");
                logado = true;
                repS = false;
            }

        } while (repS);
    }
}

