/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos litros quer reabastecer: ");
        double litros = sc.nextDouble();
        System.out.println("Qual a eficiência do carro: ");
        double eficiencia = sc.nextDouble();

        Carro carro = new Carro(eficiencia, litros);
        
        while(true) {
            System.out.println("1 - Andar");
            System.out.println("2 - Reabastecer");
            System.out.println("3 - Verificar a quantidade de combustivel restante");
            System.out.println("0 - Encerrar viajem");
            
            int opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Quantos Km quer percorrer?");
                    double km = sc.nextDouble();
                    carro.andar(km);
                break;
                case 2:
                    System.out.println("Quantos litros que abastecer? ");
                    double gasolina = sc.nextDouble();
                    carro.reabastecer(gasolina);
                break;
                case 3:
                    System.out.println("Restam " + carro.getCombustivel() + "L de combustivel");
                break;
                case 0:
                    System.exit(0);
                break;
            }
        }
    };
    
}
