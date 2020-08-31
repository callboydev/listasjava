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
public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar Conta\n" +
            "2. Realizar depósito (procurar pelo nome do cliente)\n" +
            "3. Realizar saque (procurar pelo nome do cliente)\n" +
            "4. Verificar saldo (procurar pelo nome do cliente)\n" +
            "5. Consultar Cliente (Mostrar nome e o CPF do cliente)\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Numero: ");
                    String numero = sc.next();
                    System.out.println("Agencia: ");
                    String agencia = sc.next();
                    System.out.println("Nome do cliente: ");
                    String nome_cliente = sc.next();
                    System.out.println("Saldo: R$");
                    double saldo = sc.nextDouble();
                    
                    Conta conta = new Conta(numero, agencia, nome_cliente, saldo);
                    contas.add(conta);
                break;
                case 2:
                    System.out.println("Nome do cliente: ");
                    String nome_buscar = sc.next();
                    
                    int size = contas.size();
                    for (int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getNome_cliente().equals(nome_buscar)) {
                            System.out.println("Qual o valor do deposito: R$");
                            double deposito = sc.nextDouble();
                            c.depositar(deposito);
                        }
                    }
                break;
                case 3:
                    System.out.println("Nome do cliente: ");
                    nome_buscar = sc.next();
                    
                    size = contas.size();
                    for (int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getNome_cliente().equals(nome_buscar)) {
                            System.out.println("Qual o valor do saque: R$");
                            double saque = sc.nextDouble();
                            c.sacar(saque);
                        }
                    }
                break;
                case 4:
                    System.out.println("Nome do cliente: ");
                    nome_buscar = sc.next();
                    
                    size = contas.size();
                    for (int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getNome_cliente().equals(nome_buscar)) {
                            System.out.println("O saldo é de: R$" + c.getSaldo());
                        }
                    }
                break;
                case 5:
                    System.out.println("Número da conta: ");
                    String conta_buscar = sc.next();
                    
                    size = contas.size();
                    for (int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getNumero().equals(conta_buscar)) {
                            System.out.println("Nome " + c.getNome_cliente());
                            System.out.println("A questão só diz pra pedir o nome como vou consultar o cpf ;-;");
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
