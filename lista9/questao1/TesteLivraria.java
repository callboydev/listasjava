/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteLivraria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livraria> livrarias = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar Livraria\n" +
            "2. Cadastrar Funcionário em uma livraria\n" +
            "3. Definir gerente de uma livraria\n" +
            "4. Adicionar livros em uma livraria\n" +
            "5. Listar os livros de uma livraria\n" +
            "6. Listar os funcionários de uma livraria\n" +
            "7. Listar os gerentes das livrarias cadastradas\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            
            switch(opcao) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.next();
                    System.out.println("Informe a cidade: ");
                    String cidade = sc.next();
                    System.out.println("Informe o estado: ");
                    String estado = sc.next();
                    
                    ArrayList<Funcionario> funcionarios = new ArrayList();
                    System.out.println("Digite o nome do primeiro funcionario: ");
                    String nome_funcionario = sc.next();
                    System.out.println("Digite o cpf do primeiro funcionario: ");
                    String cpf_funcionario = sc.next();
                    System.out.println("Digite o endereco do primeiro funcionario: ");
                    String endereco_funcionario = sc.next();
                    System.out.println("Digite o telefone do primeiro funcionario: ");
                    String telefone_funcionario = sc.next();
                    Funcionario funcionario = new Funcionario(cpf_funcionario, nome_funcionario, endereco_funcionario, telefone_funcionario);
                    funcionarios.add(funcionario);
                    
                    while(true) {
                        System.out.print("Quer adizionar outro funcionario? [s/n]: ");
                        String escolha = sc.next();
                        if(escolha.equals("s")) {
                            System.out.println("Digite o nome do funcionario: ");
                            nome_funcionario = sc.next();
                            System.out.println("Digite o cpf do primeiro funcionario: ");
                            cpf_funcionario = sc.next();
                            System.out.println("Digite o endereco do primeiro funcionario: ");
                            endereco_funcionario = sc.next();
                            System.out.println("Digite o telefone do primeiro funcionario: ");
                            telefone_funcionario = sc.next();
                            
                            funcionario = new Funcionario(cpf_funcionario, nome_funcionario, endereco_funcionario, telefone_funcionario);
                            funcionarios.add(funcionario);
                        } else {
                            break;
                        }
                    }
                    
                    
                    Funcionario funcionario_gerente = null;
                    
                    while(funcionario_gerente == null) {
                        System.out.println("Funcionara para gerente não encontrado!");
                        System.out.println("Informe o gerente: ");
                        String gerente = sc.next();
                        int size = funcionarios.size();
                        for(int i = 0; i < size; i++) {
                            Funcionario f = funcionarios.get(i);
                            if(f.getNome().equals(gerente)) {
                                funcionario_gerente = f;
                            }
                        }
                    }
        
                    
                    ArrayList<Livro> livros = new ArrayList();
                    System.out.println("Digite o autor do primeiro livro: ");
                    String autor = sc.next();
                    System.out.println("Digite a editora do primeiro livro: ");
                    String editora = sc.next();
                    System.out.println("Digite o isbn (id) do primeiro livro: ");
                    int isbn = sc.nextInt();
                    System.out.println("Digite o titulo do primeiro livro: ");
                    String titulo = sc.next();
                    System.out.println("Digite o ano do primeiro livro: ");
                    int ano = sc.nextInt();
                    Livro livro = new Livro(autor, editora, isbn, titulo, ano);
                    livros.add(livro);
                    
                    while(true) {
                        System.out.print("Quer adizionar outro livro? [s/n]: ");
                        String escolha = sc.next();
                        if(escolha.equals("s")) {
                            System.out.println("Digite o autor do livro: ");
                            autor = sc.next();
                            System.out.println("Digite a editora do livro: ");
                            editora = sc.next();
                            System.out.println("Digite o isbn (id) livro: ");
                            isbn = sc.nextInt();
                            System.out.println("Digite o titulo do livro: ");
                            titulo = sc.next();
                            System.out.println("Digite o ano do livro: ");
                            ano = sc.nextInt();
                            
                            livro = new Livro(autor, editora, isbn, titulo, ano);
                            livros.add(livro);
                        } else {
                            break;
                        }
                    }
                    
                    Livraria livraria = new Livraria(nome, cidade, estado, funcionario_gerente, funcionarios, livros);
                    livrarias.add(livraria);
                    
                    System.out.println("Livraria criada com sucesso!\n");
                    
                break;
                case 2:
                    System.out.println("Digite o nome da livraria: ");
                    String nome_buscar = sc.next();
                    
                    int size = livrarias.size();
                    
                    for(int i = 0; i < size; i++) {
                        Livraria l = livrarias.get(i);
                        if(l.getNome().equals(nome_buscar)) {
                            System.out.println("Digite o nome do funcionario: ");
                            nome_funcionario = sc.next();
                            System.out.println("Digite o cpf do primeiro funcionario: ");
                            cpf_funcionario = sc.next();
                            System.out.println("Digite o endereco do primeiro funcionario: ");
                            endereco_funcionario = sc.next();
                            System.out.println("Digite o telefone do primeiro funcionario: ");
                            telefone_funcionario = sc.next();
                            
                            funcionario = new Funcionario(cpf_funcionario, nome_funcionario, endereco_funcionario, telefone_funcionario);
                            l.cadastrarFuncionario(funcionario);
                            System.out.println("Funcionario cadastrado com sucesso!");
                        }
                    }
                break;
                case 3:
                    System.out.println("Digite o nome da livraria: ");
                    nome_buscar = sc.next();
                    
                    size = livrarias.size();
                    
                    for(int i = 0; i < size; i++) {
                        Livraria l = livrarias.get(i);
                        if(l.getNome().equals(nome_buscar)) {
                            System.out.println("Digite o nome do gerente: ");
                            String nome_gerente = sc.next();
                            
                            int size2 = l.getFuncionarios().size();
                            funcionario_gerente = null;
                            for(int j = 0; j < size2; j++) {
                                Funcionario f = l.getFuncionarios().get(j);
                                if(f.getNome().equals(nome_gerente)) {
                                    funcionario_gerente = f;
                                    l.setGerente(funcionario_gerente);
                                    System.out.println("Gerente atualizado!\n");
                                }
                            }
                            
                            while (funcionario_gerente == null) {
                                System.out.println("Não foram encontrados funcioanrios com esse nome para gerente");
                                System.out.println("Digite novamente o nome do gerente: ");
                                nome_gerente = sc.next();

                                size2 = l.getFuncionarios().size();
                                funcionario_gerente = null;
                                for(int j = 0; j < size2; j++) {
                                    Funcionario f = l.getFuncionarios().get(j);
                                    if(f.getNome().equals(nome_gerente)) {
                                        funcionario_gerente = f;
                                        l.setGerente(funcionario_gerente);
                                        System.out.println("Gerente atualizado!\n");
                                        break;
                                    }
                                }
                            }
                        }
                    }
                break;
                case 4:
                    System.out.println("Dite o nome da livraria: ");
                    nome_buscar = sc.next();
                    
                    size = livrarias.size();
                    for(int i  = 0; i < size; i++) {
                        Livraria l = livrarias.get(i);
                        if(l.getNome().equals(nome_buscar)) {
                            System.out.println("Digite o autor do livro: ");
                            autor = sc.next();
                            System.out.println("Digite a editora do livro: ");
                            editora = sc.next();
                            System.out.println("Digite o isbn (id) livro: ");
                            isbn = sc.nextInt();
                            System.out.println("Digite o titulo do livro: ");
                            titulo = sc.next();
                            System.out.println("Digite o ano do livro: ");
                            ano = sc.nextInt();
                            
                            livro = new Livro(autor, editora, isbn, titulo, ano);
                            l.adicionarLivro(livro);
                            System.out.println("Livro adicionado com sucesso!\n");
                        }
                    }
                break;
                case 5:
                    System.out.println("Dite o nome da livraria: ");
                    nome_buscar = sc.next();
                    
                    size = livrarias.size();
                    for(int i  = 0; i < size; i++) {
                        Livraria l = livrarias.get(i);
                        if(l.getNome().equals(nome_buscar)) {
                            int size2 = l.getLivros().size();
                            if(size2 == 0) {
                                System.out.println("Nenhum livro disponivel");
                            } else {
                                System.out.println("Livros: " + size2);
                                for(int j = 0; j < size2; j++) {
                                    System.out.println(l.getLivros().get(j).getTitulo());
                                }
                            }
                        }
                    }
                break;
                case 6:
                    System.out.println("Dite o nome da livraria: ");
                    nome_buscar = sc.next();
                    
                    size = livrarias.size();
                    for(int i  = 0; i < size; i++) {
                        Livraria l = livrarias.get(i);
                        if(l.getNome().equals(nome_buscar)) {
                            int size2 = l.getFuncionarios().size();
                            if(size2 == 0) {
                                System.out.println("Nenhum funcionario disponivel");
                            } else {
                                System.out.println("Funcionarios: " + size2);
                                for(int j = 0; j < size2; j++) {
                                    System.out.println(l.getFuncionarios().get(j).getNome());
                                }
                            }
                        }
                    }
                break;
                case 7:
                    size = livrarias.size();
                    for(int i  = 0; i < size; i++) {
                        Livraria l = livrarias.get(i);
                        System.out.println("Livraria: + " + l.getNome() + "Gerente: " + l.getGerente().getNome());
                    }
                break;
                case 0:
                    System.exit(0);
                break;
            }
        }
    }
}
