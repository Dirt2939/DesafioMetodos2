/*
 * 2. Crie um método com nome de converteMaiusculaEConta(), este
 * método recebe por parâmetro uma variável String e torna ela em
 * maiúscula em seguida mostra na mesma saída a quantidade de
 * caracteres que esta variável possui.
 */
package desafio8;

import java.util.Scanner;

/**
 * @author Rafael
 */
public class Desafio8Exer2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite algo: ");
        String algo = ler.nextLine();
        
        converteMaiusculaEConta(algo);
    }
    
    public static void converteMaiusculaEConta(String texto) {
        System.out.println(texto.toUpperCase());
        System.out.println("O texto possui "+texto.length()+" ca"
                + "racteres");
    }
    
}
