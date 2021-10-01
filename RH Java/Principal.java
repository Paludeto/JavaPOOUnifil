import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Controle ctrl = new Controle();
        Scanner teclado = new Scanner(System.in);
        int opcao=0;
        String nome, depto;
        double salario;
        while(opcao != 9){
            System.out.println("1-Cadastrar empregado");
            System.out.println("2-Cadastrar departamento");
            System.out.println("3-Associar empregado ao departamento");
            System.out.println("4-Listar empregados");
            System.out.println("5-Listar departamentos");
            System.out.println("6-Listar empregados de um departamento");
            System.out.println("7-Demitir empregado");
            System.out.println("9-Fim");
            opcao = teclado.nextInt(); teclado.nextLine();
            switch(opcao){
                case 1 :
                    System.out.println("Nome:");
                    nome = teclado.nextLine();
                    System.out.println("Salario:");
                    salario = teclado.nextDouble();
                    ctrl.cadastraEmpregado(nome,salario);
                    break;
                case 2 :
                    System.out.println("Nome:");
                    nome = teclado.nextLine();
                    ctrl.cadastraDepartamento(nome);
                    break;
                case 3 :
                    System.out.println("Departamento:");
                    depto = teclado.nextLine();
                    System.out.println("Empregado:");
                    nome = teclado.nextLine();
                    ctrl.adicionaEmpDep(depto, nome);
                    break;
                case 4 :
                    System.out.println("Relação de Empregados");
                    System.out.println(ctrl.listarEmpregados());
                    break;
                case 5 :
                    System.out.println("Relação de Departamentos");
                    System.out.println(ctrl.listarDepartamento());
                    break;
                case 6 :
                    System.out.println("Departamento:");
                    nome = teclado.nextLine();
                    System.out.println(ctrl.listarDepartamento(nome));
                    break;
                case 7 :
                    System.out.println("Departamento:");
                    depto = teclado.nextLine();
                    System.out.println("Empregado:");
                    nome = teclado.nextLine();
                    ctrl.removeEmpDep(depto, nome);
                    break;
            }
        }

    }
}
