package comandoscondicionais;
import java.util.Scanner;

public class IdadeEleitoral {

    public static void main(String[] args) {

        int idade;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if (idade <= 15) {
            System.out.println("Você ainda não possui idade para votar.");
        } else if (idade >= 18 && idade <= 69) {
            System.out.println("Seu voto é obrigatório.");
        } else {
            System.out.println("Seu voto é opcional");
        }
    }

}

