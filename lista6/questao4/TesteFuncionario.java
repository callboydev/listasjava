/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList();
        
        while(true) {
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Calcular imposto (nome)");
            System.out.println("0 - Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do funcionario: ");
                    String nome = sc.next();
                    System.out.println("Digite o salario do funcionario: ");
                    double salario = sc.nextDouble();
                    
                    Funcionario funcionario = new Funcionario(nome, salario);
                    funcionarios.add(funcionario);
                break;
                case 2:
                    System.out.println("Digite o nome do funcionario: ");
                    String nome_buscado = sc.next();
                    
                    int size = funcionarios.size();
                    for(int i = 0; i < size; i++) {
                        Funcionario fun = funcionarios.get(i);
                        if(fun.getNome().equals(nome_buscado)) {
                            double renda = fun.getSalario();
                            if(renda <= 2000) {
                                System.out.println("ISENTO DE IMPOSTO!");
                            } else if (renda > 2000 && renda <= 3500) {
                                System.out.println("15% DE IMPOSTO: R$" + (renda * 0.15));
                            } else if (renda > 3500 && renda <= 5000) {
                                System.out.println("22% DE IMPOSTO R$" + (renda * 0.22));
                            } else if (renda > 5000) {
                                System.out.println("30% DE IMPOSTO R$" + (renda * 0.3));
                            }
                        }
                    }
                break;
                case 0:
                    System.exit(0);
                break;
            }
        }
    }
}
