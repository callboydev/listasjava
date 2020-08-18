
package lista1;

import java.util.Scanner;

public class Questao3 {
    public static class Circulo {
        private double raio;
        private double area;
        private double perimetro;
        
        public Circulo(double raio) {
            this.setRaio(raio);
        }
        
        public double getRaio() {
            return this.raio;
        }
        
        public double getArea() {
            return this.area;
        }
        
        public double getPerimetro() {
            return this.perimetro;
        }
        
        public void setRaio(double raio) {
            this.raio = raio;
        }
        
        public void setArea(double area) {
            this.area = area;
        }
        
        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }
        
        public void calcularArea() {
            this.area = Math.PI * Math.pow(this.getRaio(), 2);
        }
        
        public void calcularPerimetro() {
            this.perimetro = 2 * Math.PI * this.getRaio();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = null;
        int opcao = 10;
        
        while(opcao != 0) {
            System.out.println("1 - Criar um círculo");
            System.out.println("2 - Calcular Área");
            System.out.println("3 - Calcular Perímetro");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("Digite o raio do circulo: ");
                    double raio = sc.nextDouble();

                    circulo = new Circulo(raio);

                    System.out.println("Circulo criado com sucesso!");
                break;
                case 2:
                    if(circulo == null) {
                        System.out.println("Crie um circulo primeiro!");
                    } else {
                        circulo.calcularArea();
                        System.out.println("A área do circulo é: " + circulo.getArea());
                    }
                break;
                case 3:
                    if(circulo == null) {
                        System.out.println("Crie um circulo primeiro!");
                    } else {
                        circulo.calcularPerimetro();
                        System.out.println("O perimetro do circulo é: " + circulo.getPerimetro());
                    }
                break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }
    }
}
