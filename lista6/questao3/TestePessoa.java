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
public class TestePessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList();
        
        while(true) {
            System.out.println("1 - Cadastrar uma pessoa");
            System.out.println("2 - Mostrar as pessoas que estão abaixo do peso (IMC < 18,5)");
            System.out.println("3 - Mostrar as pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC <\n" +
"25)");
            System.out.println("4 - Mostrar as pessoas que estão acima do peso (IMC > = 25)");
            System.out.println("0 - Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = sc.next();
                    System.out.println("Digite o peso: ");
                    double peso = sc.nextDouble();
                    System.out.println("Digite a altura: ");
                    double altura = sc.nextDouble();
                    
                    Pessoa pessoa = new Pessoa(nome, peso, altura);
                    pessoas.add(pessoa);
                break;
                case 2:
                    int size = pessoas.size();
                    for(int i = 0; i < size; i++) {
                        Pessoa pes = pessoas.get(i);
                        if(pes.imc() < 18.5) {
                            System.out.println("Abaixo do peso: " + pes.getNome());
                        }
                    }
                break;
                case 3:
                    size = pessoas.size();
                    for(int i = 0; i < size; i++) {
                        Pessoa pes = pessoas.get(i);
                        if(pes.imc() > 18.5 && pes.imc() < 25) {
                            System.out.println("Peso ideal: " + pes.getNome());
                        }
                    }
                break;
                case 4:
                    size = pessoas.size();
                    for(int i = 0; i < size; i++) {
                        Pessoa pes = pessoas.get(i);
                        if(pes.imc() >= 25) {
                            System.out.println("Acima do peso: " + pes.getNome());
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
