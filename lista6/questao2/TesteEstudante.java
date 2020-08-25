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
public class TesteEstudante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudante> estudantes = new ArrayList();
        
        while(true) {
            System.out.println("1 - Cadastrar estudante");
            System.out.println("2 - Obter nome do estudante (matricula)");
            System.out.println("3 - Calcular média (matricula)");
            System.out.println("0 - Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = sc.next();
                    System.out.println("Digite a matricula: ");
                    String matricula = sc.next();
                    
                    Double[] notas = new Double[2];
                    for(int i = 0; i < notas.length; i++) {
                        System.out.println("Digite a nota " + (i+1));
                        notas[i] = sc.nextDouble();
                    }
                    
                    Estudante estudante = new Estudante(nome, matricula, notas);
                    estudantes.add(estudante);
                break;
                case 2:
                    System.out.println("Digite a matricula: ");
                    String matricula_buscada = sc.next();
                    
                    int size = estudantes.size();
                    for(int i = 0; i < size; i++) {
                        Estudante est = estudantes.get(i);
                        if(est.getMatricula().equals(matricula_buscada)) {
                            System.out.println("O nome do estudante da matricula: " + matricula_buscada + " é: " + est.getNome());
                        }
                    }
                break;
                case 3:
                    System.out.println("Digite a matricula: ");
                    matricula_buscada = sc.next();
                    
                    size = estudantes.size();
                    for(int i = 0; i < size; i++) {
                        Estudante est = estudantes.get(i);
                        if(est.getMatricula().equals(matricula_buscada)) {
                            double media = est.calcularMedia();
                            System.out.println("A média do estudante de matricula " + est.getMatricula() + " é de: " + media);
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
