//autor: carmindo - 18/05 as 10;16 - licao 3

package primeiroprojeto;

import java.util.Scanner;
//biblioteca para pegar os dados digitados pelo usuario

public class MaiorNota
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int nota1; // declaracao da variavel do tipo inteiro number1 / primeiro nota

        int nota2; // declaracao da variavel / segunda nota

        int nota3; // declaracao da terceira nota

        System.out.print("Entre com o primeiro numero inteiro: "); // prompt para digitar as notas
        nota1 = input.nextInt(); // lê a primeira nota(formato Int_eiro) fornecida pelo aluno

        System.out.print("Enter second(segundo) integer(inteiro): "); //prompt para digitar as notas
        nota2 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

        System.out.print("Entre com o terceiro numero inteiro: "); // prompt para digitar as notas
        nota3 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

        if ((nota1 == nota2) && (nota1 == nota3))
            {
                System.out.println("As notas sao iguais: \n" + nota1 + "," + nota2 + "," + nota3 +"." );
                return;
            }

        if ((nota1 > nota2) && (nota1 > nota3))

            {
                System.out.println("A maior nota e a primeira:" + nota1);

                return;
            }


        //else if**** colocar esle if e  funcionara tambem, porem retirar o return acima, quando nao havia a conta do 1=2 ou 1=3
        if ((nota2 > nota1) && (nota2 > nota3))
            {
                System.out.println("A maior nota e a segunda:" + nota2);
            }

        else
            {
                System.out.println("A maior nota e a terceira:" + nota3);
                return;
            }
        // fim do metodo main

    }
}
//fim da classe aprovacao aluno
