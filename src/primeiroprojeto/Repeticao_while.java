package primeiroprojeto;

public class Repeticao_while {
    public static void main(String[] args) {

        int x = 15;

        //no while a condicao e avaliada antes de entrar no laco, caso queira pegar o numero 19 tbm, colocar =,
        // senao retirar o igual

        while (x <= 19) {
                System.out.println("voce tem permisssao pra entrar no while");
                System.out.println( + x);
                x++;
            }

        System.out.println("voce nao tem mais permisssao pra entrar no while" );
        System.out.println(x);
        }
    }