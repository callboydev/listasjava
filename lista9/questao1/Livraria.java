/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista9;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Livraria {
    private String nome;
    private String cidade;
    private String estado;
    private Funcionario gerente;
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private ArrayList<Livro> livros = new ArrayList();

    public Livraria(String nome, String cidade, String estado, Funcionario gerente, ArrayList<Funcionario> funcionarios, ArrayList<Livro> livros) {
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.gerente = gerente;
        this.funcionarios = funcionarios;
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    
    public void cadastrarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    
}
