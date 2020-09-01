/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista9;

import lista8.Autor;
import lista8.Editora;

/**
 *
 * @author USER
 */
public class Livro {
    private String autor;
    private String editora;
    private int isbn;
    private String titulo;
    private int ano;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Livro(String autor, String editora, int isbn, String titulo, int ano) {
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
    }
}
