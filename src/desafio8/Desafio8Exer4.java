/*
 * 4. Crie um método com o nome de calcularMedia(), que recebe por
 * parâmetro três números fracionários e retorna a média deles (double).
 */
package desafio8;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Desafio8Exer4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double num[] = new double[3];
        
        for (int i = 0; i < 3; i++) {
            String vez = "";
            switch (i+1) {
                case 1: vez = "primeiro"; break;
                case 2: vez = "segundo"; break;
                default: vez = "terceiro"; break;
            }
            
            System.out.println("Digite o "+vez+" valor:");
            num[i] = ler.nextDouble();
        }
        
        double media = calcularMedia(num[0], num[1], num[2]);
        
        System.out.println("A média é: "+media);
        
    }
    
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    
}
