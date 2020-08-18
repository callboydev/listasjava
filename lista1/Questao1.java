package questao1;

import java.util.Scanner;

public class Questao1 {
    public static class Estudante {
        String nome;
        String matricula;
        String endereco;
        Double[] notas = new Double[4];
        
        public Estudante(String nome, String matricula, String endereco, Double[] notas) {
            this.setNome(nome);
            this.setMatricula(matricula);
            this.setEndereco(endereco);
            this.SetNotas(notas);
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
        
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        
        public void SetNotas(Double[] notas) {
            for(int i = 0; i < notas.length; i++) {
                this.notas[i] = notas[i];
            }
        }
        
        public String getNome() {
            return this.nome;
        }
        
        public String getMatricula() {
            return this.matricula;
        }
        
        public String getEndereco() {
            return this.endereco;
        }
        
        public Double[] getNotas() {
            return this.notas;
        }
        
        public double media() {
            double soma = 0;
            
            for(int i = 0; i < this.notas.length; i++) {
                soma += notas[i];
            }
            
            double media = soma/this.notas.length;
            
            return media;
        }
    }
    
    public static void main(String[] args) {
        Estudante estudante = null;
        Scanner sc = new Scanner(System.in);
        
        int opcao = 10;
        
        while(opcao != 0) { 
            System.out.println("1 - Criar Estudante");
            System.out.println("2 - Calcular média e mostrar resultado");
            System.out.println("3 - Obter número de matricula");
            System.out.println("4 - Obter endereço");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do estudante: ");
                    String nome = sc.next();
                    
                    System.out.println("Digite a matricula do estudante: ");
                    String matricula = sc.next();
                    
                    System.out.println("Digite o endereco do estudante: ");
                    String endereco = sc.next();
                    
                    Double[] notas = new Double[4];
                    for(int i = 0; i < 4; i++) {
                        System.out.println("Digite a " + (i+1) + "º nota do estudante: ");
                        notas[i] = sc.nextDouble();
                    }
                    
                    estudante = new Estudante(nome, matricula, endereco, notas);
                    
                    System.out.println("Estudante criado!");
                break;
                case 2:
                    if(estudante == null) {
                        System.out.println("Você precisa criar um estudante para realizar essa ação!");
                    } else {
                        if(estudante.media() >= 6) {
                            System.out.println("Estudante aprovado!");
                        } else {
                            System.out.println("Estudante reprovado!");
                        }
                    }
                break;
                case 3:
                    if(estudante == null) {
                        System.out.println("Você precisa criar um estudante para realizar essa ação!");
                    } else {
                        System.out.println("A matricula do estudante: " + estudante.getNome() + " é: " + estudante.getMatricula());
                    }
                break;
                case 4:
                    if(estudante == null) {
                        System.out.println("Você precisa criar um estudante para realizar essa ação!");
                    } else {
                        System.out.println("O endereço do estudante: " + estudante.getNome() + " é: " + estudante.getEndereco());
                    }
                break;
                case 0:
                    System.exit(0);
                break;
                default:
                    System.out.println("Opção invalida!");
                break;
                
            }
        }
        
        
    }
}
