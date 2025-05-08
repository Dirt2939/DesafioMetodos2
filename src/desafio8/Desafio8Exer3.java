/*
 * 3. Crie um método chamado somarLista(). Este método recebe como
 * parâmetro um número inteiro que representa a quantidade de vezes
 * que o loop deve ser executado. O método então soma todos os
 * valores até esse número e mostra o resultado da soma.
 */
package desafio8;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Desafio8Exer3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num = ler.nextInt();
        
        somarLista(num);
    }
    
    public static void somarLista(int numLimite) {
        int num = 0;
        for (int i = 0; i <= numLimite; i++) {
            num = num + i;
        }
        System.out.println("O total é: "+num);
    }
}
