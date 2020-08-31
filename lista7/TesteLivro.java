/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar livro\n" +
            "2. Buscar livro por titulo\n" +
            "3. Listar livros por autor (mostrar os livros de um autor)\n" +
            "4. Listar todos os livros\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Autor: ");
                    String autor = sc.next();
                    System.out.println("Editora: ");
                    String editora = sc.next();
                    System.out.println("Titulo: ");
                    String titulo = sc.next();
                    System.out.println("Ano: ");
                    String ano = sc.next();
                    System.out.println("ISBN (id): ");
                    int isbn = sc.nextInt();
                    
                    Livro livro = new Livro(autor, editora, titulo, ano, isbn);
                    livros.add(livro);
                    
                    System.out.println("Livro cadastrado com sucesso!");
                break;
                case 2:
                    System.out.println("Titulo para buscar: ");
                    String titulo_buscar = sc.next();
                    
                    int size = livros.size();
                    for (int i = 0; i < size; i++) {
                        Livro l = livros.get(i);
                        if(l.getTitulo().equals(titulo_buscar)) {
                            System.out.println("Livro encontrado! " + l.getTitulo() + " " + l.getAutor() );
                        }
                    }
                break;
                case 3:
                    System.out.println("Autor para buscar: ");
                    String autor_buscar = sc.next();
                    
                    size = livros.size();
                    for (int i = 0; i < size; i++) {
                        Livro l = livros.get(i);
                        if(l.getAutor().equals(autor_buscar)) {
                            System.out.println("Livro encontrado: " + l.getTitulo());
                        }
                    }
                break;
                case 4:
                    size = livros.size();
                    if(size == 0) {
                        System.out.println("Nenhum livro cadastrado!");
                    } else {
                        System.out.println("Livros: ");
                        for (int i = 0; i < size; i++) {
                            Livro l = livros.get(i);
                            System.out.println(l.getTitulo());
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
