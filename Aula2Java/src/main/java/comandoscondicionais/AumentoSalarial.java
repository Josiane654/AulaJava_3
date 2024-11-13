package comandoscondicionais;
import java.util.*;

public class AumentoSalarial {

    public static void main(String[] args) {

        int codigo;
        String mensagem;
        float salario;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código do seu cargo:");
        codigo = entrada.nextInt();

        switch (codigo){
            case 0001: salario = 1400;
            mensagem = String.format("O novo salário para o cargo de programador estagiário é de R$" + salario * 1.1);
            break;

            case 0002: salario = 3000;
            mensagem = ("O novo salário para o cargo de programador júnior é de R$" + salario * 1.12);
            break;

            case 0003: salario = 5500;
            mensagem = ("O novo salário para o cargo de programador pleno é de R$" + salario * 1.13);
            break;

            case 0004: salario = 8000;
            mensagem = ("O novo salário para o cargo de programador senior é de R$" + salario * 1.15);
            break;

            case 0005: salario = 12000;
            mensagem = ("O novo salário para o cargo de programador master é de R$" + salario * 1.18);
            break;

            default: mensagem = "Número de cargo inválido.";

        }

        System.out.println(mensagem);

    }
}
