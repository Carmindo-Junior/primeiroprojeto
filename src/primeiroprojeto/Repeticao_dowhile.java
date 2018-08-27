package primeiroprojeto;

public class Repeticao_dowhile {
    public static void main(String[] args) {

        int x = 19;


        //dowhile a condição somente é avaliada depois que suas instruções são executadas pela primeira vez
        do {
            System.out.println("voce tem permisssao pra entrar no dowhil e" + x);
            x++;
        }

        while (x < 19);

        System.out.println("voce nao tem mais permisssao pra entrar no dowhile" + x);


    }
}




