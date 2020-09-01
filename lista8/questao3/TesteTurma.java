/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Turma> turmas = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar turma (O sistema deve permitir armazenar 10 turmas)\n" +
            "2. Cadastrar estudante (É necessário buscar uma turma pelo código Antes de\n" +
            "adicionar um estudante)\n" +
            "3. Listar turmas (Exibir todas as turmas cadastradas)\n" +
            "4. Listar estudantes por turma (Buscar turma pelo código)\n" +
            "5. Consultar média de um estudante (Buscar pelo código da turma e número\n" +
            "de matrícula do estudante)\n" +
            "6. Alterar notas de um estudante (Buscar pelo código da turma e número de\n" +
            "matrícula do estudante)\n" +   
            "7. Exibir média dos estudantes de uma turma (Buscar pelo código da turma e\n" +
            "exibir a média dos estudantes da referida turma)\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Codigo da turma: ");
                    String codigo = sc.next();
                    System.out.println("Nome da turma: ");
                    String nome = sc.next();
                    Turma turma =  new Turma(codigo, nome);
                    turmas.add(turma);
                    
                    System.out.println("Turma cadastrada com sucesso!");
                break;
                case 2:
                    System.out.println("Digite o codigo da turma: ");
                    String codigo_buscado = sc.next();
                    
                    int size = turmas.size();
                    for(int i = 0; i < size; i++) {
                        Turma t = turmas.get(i);
                        if(t.getCodigo().equals(codigo_buscado)) {
                            int quantidade_de_alunos;
                            if(t.getEstudantes() == null) {
                                quantidade_de_alunos = 0;
                            } else {
                                quantidade_de_alunos = t.getEstudantes().size();
                            }

                            if(quantidade_de_alunos >= 10) {
                                System.out.println("A turma está cheia!");
                            } else {
                                System.out.println("Matricula: ");
                                String matricula = sc.next();
                                System.out.println("Nome: ");
                                String nome_estudante = sc.next();

                                Double[] notas = new Double[4];

                                for(int j = 0; j < 4; j++) {
                                    System.out.println("Digite a " + (j+1) + "º nota: ");
                                    notas[j] = sc.nextDouble();
                                }

                                Estudante estudante = new Estudante(matricula, nome_estudante, notas);
                                t.adicionarEstudante(estudante);
                            }
                        }
                        
                    }
                break;
                case 3:
                    size = turmas.size();
                    if(size == 0) {
                        System.out.println("Nenhuma turma cadastrada !");
                    } else {
                        for(int i = 0; i < size; i++) {
                            Turma t = turmas.get(i);
                            System.out.println("Turma nome: " + t.getNome());
                        } 
                    }
                    
                break;
                case 4:
                    System.out.println("Digite o codigo da turma: ");
                    String codigo_buscar = sc.next();
                    
                    size = turmas.size();
                    
                    for(int i = 0; i < size; i++) {
                        Turma t = turmas.get(i);
                        if(t.getCodigo().equals(codigo_buscar)) {
                            int size1 = t.getEstudantes().size();
                            System.out.println("Estudantes: ");
                            for(int j = 0; j < size1; j++) {
                                System.out.println(t.getEstudantes().get(j).getNome());
                            }
                        }
                    }
                    
                break;
                case 5:
                    System.out.println("Digite o codigo da turma");
                    codigo_buscar = sc.next();
                    System.out.println("Digite a matricula: ");
                    String matricula_buscar = sc.next();
                    
                    size = turmas.size();
                    for(int i = 0; i < size; i++) {
                        Turma t = turmas.get(i);
                        if(t.getCodigo().equals(codigo_buscar)) {
                            int size2 = t.getEstudantes().size();
                            for(int j = 0; j < size2; j++) {
                                Estudante e = t.getEstudantes().get(j);
                                if(e.getMatricula().equals(matricula_buscar)) {
                                    System.out.println("A média é de: " + e.media());
                                }
                            }
                        }
                    }
                break;
                case 6:
                    System.out.println("Digite o codigo da turma");
                    codigo_buscar = sc.next();
                    System.out.println("Digite a matricula: ");
                    matricula_buscar = sc.next();
                    
                    size = turmas.size();
                    for(int i = 0; i < size; i++) {
                        Turma t = turmas.get(i);
                        if(t.getCodigo().equals(codigo_buscar)) {
                            int size2 = t.getEstudantes().size();
                            for(int j = 0; j < size2; j++) {
                                Estudante e = t.getEstudantes().get(j);
                                if(e.getMatricula().equals(matricula_buscar)) {
                                    Double[] notas = new Double[4];
                                    for(int c = 0; c < 4; c++) {
                                        System.out.println("Digita a nova " + (c+1) + "º nota: ");
                                        notas[c] = sc.nextDouble();
                                    }
                                    e.setNotas(notas);
                                }
                            }
                        }
                    }
                break;
                case 7:
                    System.out.println("Digite o codigo da turma: ");
                    codigo_buscar = sc.next();
                    
                    size = turmas.size();
                    
                    for(int i = 0; i < size; i++) {
                        Turma t = turmas.get(i);
                        if(t.getCodigo().equals(codigo_buscar)) {
                            double soma = 0;
                            int size1 = t.getEstudantes().size();
                            System.out.println("Estudantes: ");
                            for(int j = 0; j < size1; j++) {
                                Estudante e = t.getEstudantes().get(j);
                                soma += e.media();
                            }
                            double media_turma = soma/t.getEstudantes().size();
                            System.out.println("A média da tuma é: " + media_turma);
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
