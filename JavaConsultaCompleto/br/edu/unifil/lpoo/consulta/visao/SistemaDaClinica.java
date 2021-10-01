package br.edu.unifil.lpoo.consulta.visao;
import br.edu.unifil.lpoo.consulta.controle.*;
import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.Scanner;


public class SistemaDaClinica {

    static void criarConsulta(CadastroDeConsultas cadastro,Scanner sc){
        Consulta novaConsulta = new Consulta();
        Consulta novaConsultaComTipo;
        boolean sairDoLoop = false;
        String nome;
        String matricula;
        int numDep;
        int ano;
        double valorConsulta;


        System.out.println("Escolher nome da consulta: ");
        nome = sc.next();
        System.out.println("Definir matricula da consulta: ");
        matricula = sc.next();
        System.out.println("Definir numero de dependentes: ");
        numDep = sc.nextInt();
        System.out.println("Escolher ano da consulta: ");
        ano = sc.nextInt();
        System.out.println("Valor da consulta: ");
        valorConsulta = sc.nextDouble();


        novaConsulta.setNome(nome);
        novaConsulta.setAno(ano);
        novaConsulta.setNumDep(numDep);
        novaConsulta.setValorConsulta(valorConsulta);
        novaConsulta.setMatricula(matricula);


        System.out.print("Escolha um tipo de consulta (diamante/familia/ouro/prata):");
        do{
            String tipoDeConsultaEscolhida = sc.next();
            System.out.println("Consulta escolhida "+tipoDeConsultaEscolhida);

            switch (tipoDeConsultaEscolhida.toLowerCase()) {
                case "diamante" -> {
                    novaConsultaComTipo = new ConsultaDiamante(novaConsulta);
                    System.out.println("Consulta diamante criada com sucesso!");
                    sairDoLoop = true;
                    cadastro.incluirConsultas(novaConsultaComTipo);
                }
                case "familia" -> {
                    novaConsultaComTipo = new ConsultaFamilia(novaConsulta);
                    System.out.println("Consulta familia criada com sucesso!");
                    sairDoLoop = true;
                    cadastro.incluirConsultas(novaConsultaComTipo);
                }
                case "ouro" -> {
                    novaConsultaComTipo = new ConsultaOuro(novaConsulta);
                    System.out.println("Consulta ouro criada com sucesso!");
                    sairDoLoop = true;
                    cadastro.incluirConsultas(novaConsultaComTipo);
                }
                case "prata" -> {
                    novaConsultaComTipo = new ConsultaPrata(novaConsulta);
                    System.out.println("Consulta prata criada com sucesso!");
                    sairDoLoop = true;
                    cadastro.incluirConsultas(novaConsultaComTipo);
                }
                default -> System.out.println("Consulta inválida. Favor especificar o tipo correto. Não utilizar acentos");
            }

        }while(!sairDoLoop);
    }

    public static void main(String[] args) {
        CadastroDeConsultas cadastro = new CadastroDeConsultas();
        boolean fecharPrograma = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Deseja criar uma consulta? (sim/nao)");
            if(sc.next().equalsIgnoreCase("sim")){
                criarConsulta(cadastro,sc);
            }

            System.out.println("Deseja consultar uma consulta por plano? (sim/nao)");
            if(sc.next().equalsIgnoreCase("sim")){
                System.out.println("Tipo de consulta (diamante/familia/ouro/prata)");
                String tipoDeConsulta = sc.next();
                if(tipoDeConsulta.equalsIgnoreCase("diamante")||
                        tipoDeConsulta.equalsIgnoreCase("familia")||
                        tipoDeConsulta.equalsIgnoreCase("ouro")||
                        tipoDeConsulta.equalsIgnoreCase("prata")){
                    cadastro.numeroConsultas(tipoDeConsulta);
                    cadastro.valorConsultas(tipoDeConsulta);
                }
            }

            System.out.println("Deseja terminar o programa? (sim/nao)");
            if(sc.next().equalsIgnoreCase("sim")){
                fecharPrograma = true;
                sc.close();
            }
        } while(!fecharPrograma);

    }

}
