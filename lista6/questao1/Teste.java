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
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList();
        
        while (true) {
            System.out.println("1 - Cadastrar um funcinário");
            System.out.println("2 - Exibir funcionário de alta renda");
            System.out.println("0 - Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do funcionário: ");
                    String nome = sc.next();
                    System.out.println("Digite o salario de " + nome);
                    double salario = sc.nextDouble();
                    
                    Funcionario funcionario = new Funcionario(nome, salario);
                    funcionarios.add(funcionario);
                break;
                case 2:
                    int size = funcionarios.size();
                    for(int i = 0; i < size; i++) {
                        if(funcionarios.get(i).getSalario() > 5000) {
                            System.out.println("Funcionario rico: " + funcionarios.get(i).getNome() + " R$" + funcionarios.get(i).getSalario());
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
