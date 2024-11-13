package comandoscondicionais;
import java.util.*;

public class Switch2 {

    public static void main(String[] args) {

        int mes;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número do mês:");
        mes = entrada.nextInt();

        switch(mes){
            case 1: mensagem = "O mês é janeiro.";
                break;
            case 2: mensagem = "O mês é fevereiro.";
                break;
            case 3: mensagem = "O mês é março.";
                break;
            case 4: mensagem = "O mês é abril.";
                break;
            case 5: mensagem = "O mês é maio.";
                break;
            case 6: mensagem = "O mês é junho.";
                break;
            case 7: mensagem = "O mês é julho.";
                break;
            case 8: mensagem = "O mês é agosto.";
                break;
            case 9: mensagem = "O mês é setembro.";
                break;
            case 10: mensagem = "O mês é outubro.";
                break;
            case 11: mensagem = "O mês é novembro.";
                break;
            case 12: mensagem = "O mês é dezembro.";
                break;
            default: mensagem = "Número do mês inválido.";
        }

        System.out.println(mensagem);

    }

}
