
//importando biblioteca para leitura de dados
import java.util.Scanner;

/**
 * @author Vinícius Pelizzari
 */
public class Exp {
    public static void main(String[] args) {
        // forçando saída
        System.out.flush();
        // criando objeto com a biblioteca
        Scanner num = new Scanner(System.in);
        // saída de dados
        System.out.print("Digite um número inteiro para a CASTING: ");
        // declarando variável
        int num1 = num.nextInt();
        // imprimindo dado inteiro
        System.out.println("Inteiro: " + num1);
        // casting e unboxing
        float num2 = Integer.valueOf(num1);
        // imprimindo dado float
        System.out.print("Float: " + num2);

    }

}