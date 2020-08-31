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
public class Conta {
    private String numero;
    private Banco banco;
    private Cliente cliente;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }
    
    public void sacar(double valor) {
        if(this.saldo - valor >= 0) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!\n");
        } else {
            System.out.println("Sem saldo suficiente!\n");
        }
    }

    public Conta(String numero, Banco banco, Cliente cliente, double saldo) {
        this.numero = numero;
        this.banco = banco;
        this.cliente = cliente;
        this.saldo = saldo;
    }
}
