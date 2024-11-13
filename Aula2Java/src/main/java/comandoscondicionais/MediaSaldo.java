package comandoscondicionais;
import java.util.Scanner;

public class MediaSaldo {

    public static void main(String[] args) {

        float s1, s2, s3, s4, s5, s6, media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu salário no 1º mês:");
        s1 = entrada.nextFloat();

        System.out.println("Informe seu salário no 2º mês:");
        s2 = entrada.nextFloat();

        System.out.println("Informe seu salário no 3º mês:");
        s3 = entrada.nextFloat();

        System.out.println("Informe seu salário no 4º mês:");
        s4 = entrada.nextFloat();

        System.out.println("Informe seu salário no 5º mês:");
        s5 = entrada.nextFloat();

        System.out.println("Informe seu salário no 6º mês:");
        s6 = entrada.nextFloat();

        media = (s1 + s2 + s3 + s4 + s5 + s6) / 6;

        if (media <= 500) {
            System.out.println("Você não possui créditos.");
        } else if (media > 500 && media <= 1000) {
            System.out.println("Seu crédito é: R$" + (media * 1.3));
        } else if (media > 1000 && media <= 3000) {
            System.out.println("Seu crédito é: R$" + (media * 1.4));
        } else {
            System.out.println("Seu crédito é: R$" + (media * 1.5));
        }
    }
}
