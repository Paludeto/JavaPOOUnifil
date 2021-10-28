package br.edu.unifil.lp1.abstrato.visao;
import br.edu.unifil.lp1.abstrato.controle.*;
import br.edu.unifil.lp1.abstrato.modelo.*;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controle c1 = new Controle();
        int para = 0;
        do {
            System.out.println(("\n" + """
                    Escolha um:
                    1. Incluir funcionário
                    2. Listar funcionários
                    3. Mostrar dados de funcionário específico
                    4. Excluir funcionário
                    5. Atualizar salário de funcionário
                    6. Encerrar programa
                    """));
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(("\n" + """
                            Escolha um:
                            1. Horista
                            2. Mensalista
                            3. Produção
                            4. Comissionado
                            5. Sair
                            """));
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        System.out.println("Nome?");
                        String nomeH1 = sc.next();
                        System.out.println("Matrícula?");
                        String matriculaH1 = sc.next();
                        System.out.println("Salário?");
                        double salarioH1 = sc.nextDouble();
                        System.out.println("Horas trabalhadas?");
                        double horasTrabalhadasH1 = sc.nextDouble();

                        Horista h1 = new Horista(nomeH1, matriculaH1, salarioH1, horasTrabalhadasH1);
                        c1.cadastraFuncionario(h1);
                    } else if (tipo == 2) {
                        System.out.println("Nome?");
                        String nomeM1 = sc.next();
                        System.out.println("Matrícula?");
                        String matriculaM1 = sc.next();
                        System.out.println("Salário?");
                        double salarioM1 = sc.nextDouble();

                        Mensalista m1 = new Mensalista(nomeM1, matriculaM1, salarioM1);
                        c1.cadastraFuncionario(m1);
                    } else if (tipo == 3) {
                        System.out.println("Nome?");
                        String nomeP1 = sc.next();
                        System.out.println("Matrícula?");
                        String matriculaP1 = sc.next();
                        System.out.println("Salário?");
                        double salarioP1 = sc.nextDouble();
                        System.out.println("Quantidade produzida?");
                        double quantidadeProduzidaP1 = sc.nextDouble();

                        Produção p1 = new Produção(nomeP1, matriculaP1, salarioP1, quantidadeProduzidaP1);
                        c1.cadastraFuncionario(p1);
                        break;
                    } else if (tipo == 4) {
                        System.out.println("Nome?");
                        String nomeC1 = sc.next();
                        System.out.println("Matrícula?");
                        String matriculaC1 = sc.next();
                        System.out.println("Salário?");
                        double salarioC1 = sc.nextDouble();
                        System.out.println("Comissão?");
                        double comissao = sc.nextDouble();
                        System.out.println("Quantidade vendida?");
                        double quantidadeVendida = sc.nextDouble();

                        Comissionado com1 = new Comissionado(nomeC1, matriculaC1, salarioC1, comissao, quantidadeVendida);
                        c1.cadastraFuncionario(com1);
                    } else if (tipo == 5){
                        break;
                    } else {
                        System.out.println("Digite um número válido");
                    }
                case 2:
                    c1.listaFuncionario();
            }

        } while (para != 6);
    }

}
