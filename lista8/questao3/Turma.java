/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista8;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Turma {
    private String codigo;
    private String nome;
    private ArrayList<Estudante> estudantes = new ArrayList();

    public Turma(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public ArrayList<Estudante> getEstudantes() {
        return this.estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionarEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }
}
