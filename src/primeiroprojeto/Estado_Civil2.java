//autor: carmindo - 18/05 as 10;16 - licao 3

package primeiroprojeto;

import javax.swing.JOptionPane;
//biblioteca para pegar os dados digitados pelo usuario

public class Estado_Civil2
{
    public static void main(String[] args)
    {
        String estado = JOptionPane.showInputDialog("1 - Solteiro(a): \n2 - Desquitado(a): \n3 - Casado(a); \n4 -" +
                                                    " Divorciado(a): \n5 " +   "- Viuvo(a) \nEntre com a opcao \n");

        int estado1 = Integer.parseInt(estado); // converter string para int

        String estado2 = " ";

        switch (estado1)
        {
            case 1:
                estado2 = "\nSolteiro(a)";
             break;

            case 2:
                estado2 = "\nDesquitado(a)";
                break;

            case 3:
                estado2 = "\nCasado(a)";
                break;

            case 4:
                estado2 = "\nDivorciado(a)";
                break;

            case 5:
                estado2 = "\nViuvo(a)";
                break;

            default:
                estado2 = "\nOpcao Invalida";
                break;

        }
        JOptionPane.showMessageDialog(null,"[Estado Civil:"  + estado2 );


    }


    // fim do metodo main

}

//fim da classe aprovacao aluno
