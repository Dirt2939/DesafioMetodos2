/*
 * 7. Crie um método com o nome de calcularVolume(), este método
 * recebe por parâmetro o valor do raio. Para calcular o volume de
 * uma esfera utilize a seguinte Fórmula: (4/3) * PI * raio³. (retorne
 * double)
 */
package desafio8;

import java.util.Scanner;

 /**
 * @author Rafael
 */
public class Desafio8Exer7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o raio: ");
        double raio = ler.nextDouble();
        
        double volume = calcularVolume(raio);
        
        System.out.println("O volume é: "+volume);
    }
    
    public static double calcularVolume(double r) {
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }
    
}
