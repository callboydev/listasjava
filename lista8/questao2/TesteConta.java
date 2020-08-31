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
public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList();
        
        while(true) {
            System.out.println("1. Cadastrar Conta\n" +
            "2. Realizar depósito (Buscar pelo CPF do cliente)\n" +
            "3. Realizar saque (Buscar pelo CPF do cliente)\n" +
            "4. Verificar saldo (Buscar pelo CPF do cliente)\n" +
            "5. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)\n" +
            "6. Alterar o número e nome da agência (Buscar pelo nome do cliente)\n" +
            "0. Sair");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Numero da conta: ");
                    String numero_conta = sc.next();
                    
                    System.out.println("Numero da agencia: ");
                    String numero_agencia = sc.next();
                    System.out.println("Nome da agencia: ");
                    String nome_agencia = sc.next();
                    Banco banco = new Banco(numero_agencia, nome_agencia);
                    
                    System.out.println("Nome do cliente: ");
                    String nome = sc.next();
                    System.out.println("CPF do cliente: ");
                    String cpf = sc.next();
                    Cliente cliente = new Cliente(nome, cpf);
                    
                    System.out.println("Digite o saldo inicial: ");
                    double saldo = sc.nextDouble();
                    Conta conta = new Conta(numero_conta, banco, cliente, saldo);
                    contas.add(conta);
                break;
                case 2:
                    System.out.println("Digite o cpf do cliente: ");
                    String cpf_buscar = sc.next();
                    
                    int size = contas.size();
                    for(int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getCliente().getCpf().equals(cpf_buscar)) {
                            System.out.print("Qual o valor que deseja depositar: R$");
                            double valor = sc.nextDouble();
                            c.depositar(valor);
                        }
                    }
                break;
                case 3:
                    System.out.println("Digite o cpf do cliente: ");
                    cpf_buscar = sc.next();
                    
                    size = contas.size();
                    for(int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getCliente().getCpf().equals(cpf_buscar)) {
                            System.out.print("Qual o valor que deseja sacar: R$");
                            double valor = sc.nextDouble();
                            c.sacar(valor);
                        }
                    }
                break;
                case 4:
                    System.out.println("Digite o cpf do cliente: ");
                    cpf_buscar = sc.next();
                    
                    size = contas.size();
                    for(int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getCliente().getCpf().equals(cpf_buscar)) {
                            System.out.print("O saldo é de: R$" + c.getSaldo() + "\n");
                        }
                    }
                break;
                case 5:
                    System.out.println("Número da agencia: ");
                    String numero_agencia_buscar = sc.next();
                    System.out.println("Nome da agencia: ");
                    String nome_agencia_buscar = sc.next();
                    
                    size = contas.size();
                    for(int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getBanco().getNome().equals(nome_agencia_buscar) && c.getBanco().getNumero().equals(numero_agencia_buscar)) {
                            System.out.println("Nome: " + c.getCliente().getNome() + "\nCPF: " + c.getCliente().getCpf());
                        }
                    }
                break;
                case 6:
                    System.out.println("Digite o nome do cliente: ");
                    String nome_buscar = sc.next();
                    
                    size = contas.size();
                    for(int i = 0; i < size; i++) {
                        Conta c = contas.get(i);
                        if(c.getCliente().getNome().equals(nome_buscar)) {
                            System.out.println("Digite o novo nome da agencia: ");
                            c.getBanco().setNome(sc.next());
                            System.out.println("Digite o novo numero da agencia: ");
                            c.getBanco().setNumero(sc.next());
                            System.out.println(c.getBanco().getNumero() + c.getBanco().getNome());
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
