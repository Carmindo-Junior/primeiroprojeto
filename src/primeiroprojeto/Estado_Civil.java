//autor: carmindo - 18/05 as 10;16 - licao 3

package primeiroprojeto;

import java.util.Scanner;
//biblioteca para pegar os dados digitados pelo usuario

public class Estado_Civil
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int estado1; // declaracao da variavel do tipo inteiro number1 / primeiro nota


        System.out.print("1 - Solteiro(a): \n2 - Desquitado(a): \n3 - Casado(a); \n4 - Divorciado(a): \n5 " +
                         "- Viuvo(a) \nEntre com a opcao \n");
        // prompt para digitar as notas
        estado1 = input.nextInt(); // lê a primeira nota fornecida pelo aluno

        //exemplo de uso de switch case para que ficou de fazer a prova e refez a variavel situacao

        switch (estado1)
        {
            case 1:
                System.out.print("Solteiro)");
                break;

            case 2:
                System.out.print("Desquitado(a)");
                break;

            case 3:
                System.out.print("Casado(a)");
                break;

            case 4:
                System.out.print("Divorciado(a)");
                break;

            case 5:
                System.out.print("Viuvo(a)");
                break;

            default:
                System.out.println("Opcao Invalida");
                break;

        }
    }
    // fim do metodo main

}

//fim da classe aprovacao aluno
