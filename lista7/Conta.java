/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista7;

/**
 *
 * @author USER
 */
public class Conta {
    private String numero;
    private String agencia;
    private String nome_cliente;
    private double saldo;

    public Conta(String numero, String agencia, String nome_cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso");
    }
    
    public void sacar(double valor) {
        if(this.saldo - valor >= 0) {
            this.saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Você não tem saldo suficiente");
        }
    }
}
