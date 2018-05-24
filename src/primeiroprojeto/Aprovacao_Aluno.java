//autor: carmindo - 18/05 as 10;16 - licao 3

package primeiroprojeto;

import java.util.Scanner;
//biblioteca para pegar os dados digitados pelo usuario

public class Aprovacao_Aluno
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nota1; // declaracao da variavel do tipo inteiro number1 / primeiro nota

        int nota2; // declaracao da variavel / segunda nota

        int nota3; // declaracao da terceira nota

        int medianota; // media das notas computadas

        String situacao = ""; // verifica a situação do aluno, se aprovado, reprovado ou recuperacao

        System.out.print("Entre com o primeiro numero inteiro: "); // prompt para digitar as notas
        nota1 = input.nextInt(); // lê a primeira nota fornecida pelo aluno

        System.out.print("Enter second(segundo) integer(inteiro): "); //prompt para digitar as notas
        nota2 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

        System.out.print("Entre com o terceiro numero inteiro: "); // prompt para digitar as notas
        nota3 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

        medianota = (nota1 + nota2 + nota3) / 3;  // soma os números, depois armazena o total em medianota

        if (medianota >= 4)
            {
                if (medianota < 6 ) {
                    situacao = "fazerProva";

                }

                else
                {
                    situacao = "Aprovado";

                }
                System.out.println(situacao + " ,sua nota foi: \n" + medianota);
            }
        else
        {
            situacao = "Reprovado";
            System.out.println("Reprovado" + medianota);

        }


        //exemplo de uso de switch case para que ficou de fazer a prova e refez a variavel situacao

        switch (situacao)
        {
                case "Aprovado":
                    break;

                case "Reprovado":
                    break;

                case "fazerProva":
                    int notarecuperacao; // declaracao da variavel da nota de recuperacao
                    System.out.print("Enter nota recuperacao: "); // prompt para digitar as notas
                    notarecuperacao = input.nextInt(); // lê a nota de recuperacao

                    if (medianota > 6)
                    {
                        situacao = "Aprovado";
                    }

                    else
                    {
                        situacao = "Reprovado";
                        //return - retorna a condicao,se habilitar o return, desabilitar o break
                    }
                    break;

        }
        System.out.println(situacao + "\n sua nota foi: " + medianota);

    }
    // fim do metodo main

}

//fim da classe aprovacao aluno
