/*
 * 6. Crie um método com nome de conversorKM(), que recebe por
 * parâmetro um valor em metros (double) e retorna o valor
 * convertido em quilômetros (double). A conversão é feita dividindo o
 * valor em metros por 1000.
 */
package desafio8;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio8Exer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o número em Metros: ");
        double metros = ler.nextDouble();
        
        double km = conversorKM(metros);
        
        System.out.println(metros+"M vira "+km+"km");
    }
    
    public static double conversorKM(double metros) {
        return metros / 1000;
    }
 
}
