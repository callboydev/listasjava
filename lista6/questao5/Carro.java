/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

/**
 *
 * @author USER
 */
public class Carro {
    private double eficiencia;
    private double combustivel;

    public Carro(double eficiencia, double combustivel) {
        this.eficiencia = eficiencia;
        this.combustivel = combustivel;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    public void andar(double km) {
        double combustivel_gasto = km/this.eficiencia;
        if(this.combustivel - combustivel_gasto >= 0) {
            this.combustivel -= combustivel_gasto;
            System.out.println("Carro andando.....");
        } else {
            System.out.println("Você precisa re-abastecer!");
        }
    }
    
    public void reabastecer(double litros) {
        this.combustivel += litros;
        System.out.println("Carro reabastecido!");
    }
}
