/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista8;

/**
 *
 * @author USER
 */
public class Estudante {
    private String matricula;
    private String nome;
    private Double[] notas = new Double[4];

    public Estudante(String matricula, String nome, Double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
    public double media() {
        double soma = 0;
        for(int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        
        double media = soma / this.notas.length;
        return media;
    }
}
