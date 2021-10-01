package br.edu.unifil.lpoo.consulta.controle;

import br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.ArrayList;

public class CadastroDeConsultas {
    ArrayList<Consulta> listaConsultas = new ArrayList<>();

    public void incluirConsultas(String tipo) {
        switch (tipo.toLowerCase()) {
            case "diamante" -> {
                listaConsultas.add(new ConsultaDiamante());
                System.out.println("Consulta diamante cadastrada com sucesso!");
            }
            case "familia" -> {
                listaConsultas.add(new ConsultaFamilia());
                System.out.println("Consulta familia cadastrada com sucesso!");
            }
            case "ouro" -> {
                listaConsultas.add(new ConsultaOuro());
                System.out.println("Consulta ouro cadastrada com sucesso!");
            }
            case "prata" -> {
                listaConsultas.add(new ConsultaPrata());
                System.out.println("Consulta prata cadastrada com sucesso!");
            }
            default -> System.out.println("Consulta inválida. Favor especificar o tipo correto. Não utilizar acentos");
        }
    }

    public void incluirConsultas(Consulta consulta) {
        if (consulta instanceof ConsultaDiamante ||
                consulta instanceof ConsultaFamilia ||
                consulta instanceof ConsultaOuro ||
                consulta instanceof ConsultaPrata) {
            listaConsultas.add(consulta);
        }
    }


    public void mostrarConsultas() {
        Consulta consulta;
        for (int i = 0; i < listaConsultas.size(); i++) {
            consulta = listaConsultas.get(i);
            System.out.println("Nome: " + consulta.getNome());
            System.out.println("Matrícula: " + consulta.getMatricula());
        }
    } //método for melhorado

    public int numeroConsultas(String tipo) {
        Consulta consulta;
        int contador = 0;
        for (int i = 0; i < listaConsultas.size(); i++) {
            consulta = listaConsultas.get(i);
            if (tipo.toLowerCase().equals("diamante") && consulta instanceof ConsultaDiamante) {
                contador++;
            } else if (tipo.toLowerCase().equals("familia") && consulta instanceof ConsultaFamilia) {
                contador++;
            } else if (tipo.toLowerCase().equals("ouro") && consulta instanceof ConsultaOuro) {
                contador++;
            } else if (tipo.toLowerCase().equals("prata") && consulta instanceof ConsultaPrata) {
                contador++;
            }
        }

        if (tipo.toLowerCase().equals("diamante")) {
            System.out.println("Contador de consultas de tipo "+tipo+": " + contador);
            return contador;
        } else if (tipo.toLowerCase().equals("familia")) {
            System.out.println("Contador de consultas de tipo "+tipo+": " + contador);
            return contador;
        } else if (tipo.toLowerCase().equals("ouro")) {
            System.out.println("Contador de consultas de tipo "+tipo+": " + contador);
            return contador;
        } else if (tipo.toLowerCase().equals("prata")) {
            System.out.println("Contador de consultas de tipo "+tipo+": " + contador);
            return contador;
        } else {
            System.out.println("Erro, especifique o tipo corretamente, sem acentos.");
            return 0;
        }
    }

    public double valorConsultas(String tipo) {

        double valor = 0;
        for (int i = 0; i < listaConsultas.size(); i++) {
            Consulta consulta = listaConsultas.get(i);
            if (tipo.toLowerCase().equals("diamante") && consulta instanceof ConsultaDiamante) {
                ConsultaDiamante consultaDiamante = new ConsultaDiamante(consulta);
                valor += consultaDiamante.getValorConsulta();
            } else if (tipo.toLowerCase().equals("familia") && consulta instanceof ConsultaFamilia) {
                ConsultaFamilia consultaFamilia = new ConsultaFamilia(consulta);
                valor += consultaFamilia.getValorConsulta();
            } else if (tipo.toLowerCase().equals("ouro") && consulta instanceof ConsultaOuro) {
                ConsultaOuro consultaOuro = new ConsultaOuro(consulta);
                valor += consultaOuro.getValorConsulta();
            } else if (tipo.toLowerCase().equals("prata") && consulta instanceof ConsultaPrata) {
                ConsultaPrata consultaPrata = new ConsultaPrata(consulta);
                valor += consultaPrata.getValorConsulta();
            }
        }
        System.out.println("O custo de consultas do tipo solicitado é de " + valor);
        return valor;
    }

}
