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
public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar produto\n" +
            "2. Buscar Produto (procurar produto pelo nome)\n" +
            "3. Listar todos os produtos\n" +
            "4. Efetuar venda de produto\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Codigo: ");
                    String codigo = sc.next();
                    System.out.println("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.println("Quantidade: ");
                    int quantidade = sc.nextInt();
                    
                    Produto produto = new Produto(nome, codigo, preco, quantidade);
                    produtos.add(produto);
                    
                    System.out.println("Produto cadastrado com sucesso!");
                break;
                case 2:
                    System.out.println("Nome para buscar: ");
                    String nome_buscar = sc.next();
                    
                    int size = produtos.size();
                    for (int i = 0; i < size; i++) {
                        Produto l = produtos.get(i);
                        if(l.getNome().equals(nome_buscar)) {
                            System.out.println("Produto encontrado! " + l.getNome() + " R$" + l.getPreco() );
                        }
                    }
                break;
                case 4:
                    System.out.println("codigo do produto: ");
                    String codigo_buscar = sc.next();
                    
                    size = produtos.size();
                    for (int i = 0; i < size; i++) {
                        Produto l = produtos.get(i);
                        if(l.getCodigo().equals(codigo_buscar)) {
                            System.out.println("Produto vendido com sucesso!");
                            produtos.remove(i);
                        }
                    }
                break;
                case 3:
                    size = produtos.size();
                    if(size == 0) {
                        System.out.println("Nenhum produto cadastrado!");
                    } else {
                        System.out.println("Produtos: ");
                        for (int i = 0; i < size; i++) {
                            Produto l = produtos.get(i);
                            System.out.println(l.getNome());
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
