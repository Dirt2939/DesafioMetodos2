/*
 * 5. Crie um método com o nome de inverterTexto() que recebe por
 * parâmetro uma String e retorna a String invertida (String).
 */
package desafio8;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio8Exer5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = ler.nextLine();
        
        String palavraInvertida = inverterTexto(palavra);
        
        System.out.println(palavraInvertida);
    }
    
    public static String inverterTexto(String p) {
        return new StringBuilder(p).reverse().toString();
    }
 
}
