// Figura 2.7: Addition.java
 // Programa de adição que insere dois números, então exibe a soma deles.
// programa utiliza a classe Scanner que da a opcao de digitar os numeros do usuario
package primeiroprojeto;

import java.util.Scanner;


public class Adicao
{
// método main inicia a execução do aplicativo Java
    public static void main(String[] args)
    {
        // cria um Scanner para obter entrada a partir da janela de comando

        Scanner input = new Scanner(System.in);
                int number1; // declaracao da variavel do tipo inteiro number1 / primeiro número a somar

        int number2; // declaracao da variavel / segundo número a somar

        int sum; // declaracao soma de number1 e number2

                 System.out.print("Entre com o primeiro numero inteiro: "); // prompt para digitar as notas

        number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário
                System.out.print("Enter second integer: "); // prompt

        number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
                sum = number1 + number2; // soma os números, depois armazena o total em sum
                System.out.printf("Soma e %d%n", sum); // exibe a soma
    } // fim do método main
} // fim da classe Adicao


