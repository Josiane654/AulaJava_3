package comandoscondicionais;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        double altura, peso, imc;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        peso = entrada.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Atenção! Seu IMC está abaixo do esperado.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Parabéns! Seu IMC está ideal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Cuidado! Você está levemente acima do peso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Atenção! Você está com obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Atenção! Você está com obesidade grau II");
        } else {
            System.out.println("Atenção! Você está com obesidade grau III");
        }
    }

}
