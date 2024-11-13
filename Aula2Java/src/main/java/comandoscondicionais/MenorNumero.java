package comandoscondicionais;
import java.util.Scanner;

public class MenorNumero {

    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número:");
        n1 = entrada.nextInt();

        System.out.println("Informe um número:");
        n2 = entrada.nextInt();

        System.out.println("Informe um número:");
        n3 = entrada.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println("O menor número informado foi o: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("O menor número informado foi o: " + n2);
        } else if (n3 < n1 && n3 < n2) {
            System.out.println("O menor número informado foi o: " + n3);
        } else {
            System.out.println("Você deve ter digitado números iguais, por favor, digite 3 números diferentes.");
        }
    }

}
