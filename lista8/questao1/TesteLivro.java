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
public class TesteLivro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar livro\n" +
            "2. Buscar livro por titulo (Buscar livro pelo titulo)\n" +
            "3. Listar livros por autor (Mostrar os livros buscando pelo nome do autor)\n" +
            "4. Listar todos os livros (Mostrar todos os livros cadastrados)\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Nome do autor: ");
                    String nome = sc.next();
                    System.out.println("CPF do autor: ");
                    String cpf = sc.next();
                    System.out.println("Endereco do autor: ");
                    String endereco = sc.next();
                    Autor autor = new Autor(cpf, nome, endereco);
                    
                    System.out.println("Nome da editora: ");
                    String nome_editora = sc.next();
                    System.out.println("CNPJ da editora: ");
                    String cnpj = sc.next();
                    System.out.println("Endereco da editora: ");
                    String endereco_editora = sc.next();
                    System.out.println("Telefone da editora: ");
                    String telefone = sc.next();
                    Editora editora = new Editora(cnpj, nome, endereco, telefone);
                    
                    System.out.println("ISBN (id): ");
                    int isbn = sc.nextInt();
                    System.out.println("Titulo: ");
                    String titulo = sc.next();
                    System.out.println("Ano: ");
                    int ano = sc.nextInt();
                    Livro livro = new Livro(autor, editora, isbn, titulo, ano);
                    livros.add(livro);
                    System.out.println("Livro cadastrado!\n");
                    
                break;
                case 2:
                    System.out.println("Titulo para buscar: ");
                    String titulo_buscar = sc.next();
                    
                    int size = livros.size();
                    for(int i = 0; i < size; i++) {
                        Livro l = livros.get(i);
                        if(l.getTitulo().equals(titulo_buscar)) {
                            System.out.println("Livro encontrado!");
                        }
                    }
                break;
                case 3:
                    System.out.println("Nome do autor para buscar: ");
                    String autor_buscar = sc.next();
                    
                    size = livros.size();
                    for(int i = 0; i < size; i++) {
                        Livro l = livros.get(i);
                        if(l.getAutor().getNome().equals(autor_buscar)) {
                            System.out.println("Livro encontrado: " + l.getTitulo());
                        }
                    }
                break;
                case 4:
                    size = livros.size();
                    if(size == 0) {
                        System.out.println("Não há livros cadastrados!");
                    } else {
                        System.out.println("Livros: ");
                        for(int i = 0; i < size; i++) {
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
