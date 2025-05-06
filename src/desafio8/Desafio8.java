/*
 * Crie um método com nome de mostrarMaior(), este método recebe
 * por parâmetro três números inteiros e imprime o maior deles.
 */
package desafio8;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] num = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor "+(i+1)+": ");
            num[i] = ler.nextInt();
        }
        
        mostrarMaior(num[0], num[1], num[2]);
        
    }
    
    public static void mostrarMaior(int n1, int n2, int n3) {
        int[] num = {n1, n2, n3};
        
        int numMaior = num[0];
        
        for (int numT : num) {
            if (numT > numMaior) {
                numMaior = numT;
            }
        }
        
        System.out.println("O maior é "+numMaior);
        
    }
    
}
