package comandoscondicionais;
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        int n1, n2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número:");
        n1 = entrada.nextInt();

        System.out.println("Informe um número:");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("O maior número informado foi o " + n1);
        } else {
            System.out.println("O maior número informado foi o " + n2);
        }
    }

}
