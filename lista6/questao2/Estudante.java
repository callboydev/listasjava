/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

/**
 *
 * @author USER
 */
public class Estudante {
    String nome;
    String matricula;
    Double[] notas = new Double[2];

    public Estudante(String nome, String matricula, Double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia() {
        double soma = 0;
        
        for(int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        
        return soma/this.notas.length;
    }
    
    
}
