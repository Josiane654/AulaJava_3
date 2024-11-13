package comandoscondicionais;
import java.util.*;

public class CombosLanches {

    public static void main(String[] args) {
        int combo;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com o número do combo:\n1 - Chicken Fries Combo\n2 - BK Duo\n3 - BK Royal Crispy Chicken Meal\n4 - Whopper Meal\n5 - Big King Combo");
        combo = entrada.nextInt();

        switch(combo){
            case 1: mensagem = "Inclui Chicken Fries (tiras de frango empanadas), batatas fritas e bebida média, sendo uma boa opção para quem quer um lanche prático e diferente do hambúrguer.";
            break;
            case 2: mensagem = "Permite escolher dois itens entre Whopper Jr., Chicken Jr., ou wraps Royal Crispy, oferecendo uma boa variedade a um preço acessível.";
            break;
            case 3: mensagem = "Esse combo traz o sanduíche Royal Crispy Chicken, batatas fritas e bebida média, ideal para quem prefere frango.";
            break;
            case 4: mensagem = "Inclui o Whopper clássico, batatas fritas e bebida média, uma das opções mais pedidas pelos fãs do sabor defumado de hambúrguer grelhado.";
            break;
            case 5: mensagem = "Traz o sanduíche Big King, uma opção de batatas fritas e bebida média, com um sabor robusto para quem quer algo diferente do Whopper.";
            break;

            default: mensagem = "Número do combo inválido.";
        }

        System.out.println(mensagem);

    }

}
