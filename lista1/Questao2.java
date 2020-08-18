/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Questao2 {
    public static class Retangulo {
        private double base;
        private double altura;
        private double area;
        private double perimetro;
        
        public Retangulo(double base, double altura) {
            this.setBase(base);
            this.setAltura(altura);
        }
        
        public double getBase() {
            return this.base;
        }
        
        public double getAltura() {
            return this.altura;
        }
        
        public double getArea() {
            return this.area;
        }
        
        public double getPerimetro() {
            return this.perimetro;
        }
        
        public void setBase(double base) {
            this.base = base;
        }
        
        public void setAltura(double altura) {
            this.altura = altura;
        }
        
        public void setArea(double area) {
            this.area = area;
        }
        
        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }
        
        public void calcularArea() {
            this.area = this.getAltura() * this.getBase();
        }
        
        public void calcularPerimetro() {
            this.perimetro = (2 * this.getBase()) + (2 * this.getAltura());
            System.out.println(this.perimetro);
        }
        
    }
    public static void main(String[] args) {
        int opcao = 10;
        Retangulo retangulo = null;
        Scanner sc = new Scanner(System.in);
        
        while(opcao != 0) {
            System.out.println("1 - Criar um Retângulo");
            System.out.println("2 - Calcular Área");
            System.out.println("3 - Criar o Perímetro");
            System.out.println("0 - Sair");
            
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:  
                    System.out.println("Digita a altura: ");
                    double altura = sc.nextDouble();
                        
                    System.out.println("Digita a base: ");
                    double base = sc.nextDouble();
                        
                    retangulo = new Retangulo(base, altura);
                        
                    System.out.println("Retângulo criado com sucesso!");
                    
                break;
                case 2:
                    if(retangulo == null) {
                        System.out.println("Crie um retangulo antes!");
                    } else {
                        retangulo.calcularArea();
                        System.out.println("A área do retângula é: " + retangulo.getArea());
                    }
                break;
                case 3:
                    if(retangulo == null) {
                        System.out.println("Crie um retangulo antes!");
                    } else {
                        retangulo.calcularPerimetro();
                        System.out.println("O perímetro do retângula é: " + retangulo.getPerimetro());
                    }
                break;
                case 0:
                    System.exit(0);
                break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        }
    }
}
