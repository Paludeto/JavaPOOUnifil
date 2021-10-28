package br.edu.unifil.lpoo.universidade.visao;
import br.edu.unifil.lpoo.universidade.controle.*;
import br.edu.unifil.lpoo.universidade.modelo.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Controle controle = new Controle();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n" + """
                    Escolha um:
                    1. Incluir professor
                    2. Listar professores
                    3. Mostrar dados dos professores
                    4. Encerrar programa
                    """);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite \"horista\" para adicionar professor horista ou \"DE\" para adicionar professor de dedicação exclusiva.");
                    String tipo = sc.next();
                    if (tipo.equalsIgnoreCase("horista")) {
                        ProfessorHorista profHorista = new ProfessorHorista();
                        System.out.println("Defina o nome do professor adicionado");
                        String nome = sc.next();
                        profHorista.setNome(nome);
                        System.out.println("Defina a matrícula do professor adicionado");
                        String matricula = sc.next();
                        profHorista.setMatricula(matricula);
                        System.out.println("Defina o salário do professor adicionado");
                        double salario = sc.nextDouble();
                        profHorista.setSalario(salario);
                        System.out.println("Defina a quantidade de horas trabalhadas do professor adicionado");
                        int horasTrabalhadas = sc.nextInt();
                        profHorista.setHorasTrabalhadas(horasTrabalhadas);
                        controle.incluiProfessor(profHorista);
                    } else if (tipo.equalsIgnoreCase("de")) {
                        ProfessorDE profDe = new ProfessorDE();
                        System.out.println("Defina o nome do professor adicionado");
                        String nome = sc.next();
                        profDe.setNome(nome);
                        System.out.println("Defina a matrícula do professor adicionado");
                        String matricula = sc.next();
                        profDe.setMatricula(matricula);
                        System.out.println("Defina o salário do professor adicionado");
                        double salario = sc.nextDouble();
                        profDe.setSalario(salario);
                        System.out.println("Defina a quantidade licenças prêmio do professor DE");
                        int horasTrabalhadas = sc.nextInt();
                        profDe.setLicencaPremio(horasTrabalhadas);
                        controle.incluiProfessor(profDe);
                    } else {
                        System.out.println("ERRO! Especifique o tipo corretamente!");
                    } break;
                case 2:
                    System.out.println("Segue abaixo a lista de professores " + '\n' + controle.listaProfessores());
                    break;
                case 3:
                    System.out.println("Segue abaixo os dados dos professores " + '\n' +controle.mostrarDados());
                    break;
                default:
                    System.out.println("ERRO! Escolha uma opção válida utilizando um número");
                    break;
                case 4:
                    opcao = 4;
            }

        } while (opcao != 4);
    }
}
