package comandoscondicionais;
import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número informado é um número par.");
        } else {
            System.out.println("O número informado é um número impar.");
        }
    }

}
