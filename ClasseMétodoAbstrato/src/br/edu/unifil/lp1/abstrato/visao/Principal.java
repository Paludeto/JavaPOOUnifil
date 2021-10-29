package br.edu.unifil.lp1.abstrato.visao;
import br.edu.unifil.lp1.abstrato.controle.*;
import br.edu.unifil.lp1.abstrato.modelo.*;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) throws SalarioInvalidoException {
        Scanner sc = new Scanner(System.in);
        Controle c1 = new Controle();
        int para = 0;
        do {
            try {
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
                String nome;
                int matricula;
                double salario;
                double horasTrabalhadas;
                double quantidadeProduzida;
                double comissao;
                double quantidadeVendida;
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
                            nome = sc.next();
                            System.out.println("Matrícula?");
                            matricula = sc.nextInt();
                            System.out.println("Salário?");
                            salario = sc.nextDouble();
                            System.out.println("Horas trabalhadas?");
                            horasTrabalhadas = sc.nextDouble();

                            Horista h1 = new Horista(nome, matricula, salario, horasTrabalhadas);
                            c1.cadastraFuncionario(h1);
                        } else if (tipo == 2) {
                            System.out.println("Nome?");
                            nome = sc.next();
                            System.out.println("Matrícula?");
                            matricula = sc.nextInt();
                            System.out.println("Salário?");
                            salario = sc.nextDouble();

                            Mensalista m1 = new Mensalista(nome, matricula, salario);
                            c1.cadastraFuncionario(m1);
                        } else if (tipo == 3) {
                            System.out.println("Nome?");
                            nome = sc.next();
                            System.out.println("Matrícula?");
                            matricula = sc.nextInt();
                            System.out.println("Salário?");
                            salario = sc.nextDouble();
                            System.out.println("Quantidade produzida?");
                            quantidadeProduzida = sc.nextDouble();

                            Produção p1 = new Produção(nome, matricula, salario, quantidadeProduzida);
                            c1.cadastraFuncionario(p1);
                        } else if (tipo == 4) {
                            System.out.println("Nome?");
                            nome = sc.next();
                            System.out.println("Matrícula?");
                            matricula = sc.nextInt();
                            System.out.println("Salário?");
                            salario = sc.nextDouble();
                            System.out.println("Comissão?");
                            comissao = sc.nextDouble();
                            System.out.println("Quantidade vendida?");
                            quantidadeVendida = sc.nextDouble();

                            Comissionado com1 = new Comissionado(nome, matricula, salario, comissao, quantidadeVendida);
                            c1.cadastraFuncionario(com1);
                        } else if (tipo == 5) {
                            break;
                        } else {
                            System.out.println("Digite um número válido");
                        }
                    case 2:
                        System.out.println(c1.listaFuncionario());
                        break;
                    case 3:
                        System.out.println("Digite a matrícula");
                        System.out.println(c1.getFuncionario(sc.nextInt()));
                        break;
                    case 4:
                        System.out.println("Matrícula de quem deseja remover?");
                        Funcionario func;
                        func = c1.getFuncionario(sc.nextInt());
                        c1.removeFuncionario(func);
                        break;
                    case 5:
                        System.out.println("Informe a matrícula de quem deseja atualizar o salário");
                        func = c1.getFuncionario(sc.nextInt());
                        System.out.println("Informe o salário");
                        func.setSalario(sc.nextDouble());
                        break;
                    case 6:
                        para = 6;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Argumento invalido!");
                sc.nextLine();
            }
        } while (para != 6);
    }

}
