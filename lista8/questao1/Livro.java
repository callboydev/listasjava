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
public class Livro {
    private Autor autor;
    private Editora editora;
    private int isbn;
    private String titulo;
    private int ano;

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
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

    public Livro(Autor autor, Editora editora, int isbn, String titulo, int ano) {
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
    }
}
