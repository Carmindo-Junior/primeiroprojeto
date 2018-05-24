package primeiroprojeto;


import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
//biblioteca para pegar os dados digitados pelo usuario


public class Data {


    public static void main(String[] args) {
        int dia,ano,mes;
        String diaDigitado = JOptionPane.showInputDialog(null, "Digite o dia");
        String regex = "\\d+";
        //regex e uma expressao regular juntamente com \\d+

        if(diaDigitado.matches(regex)){//dia é um número
            // se sim
            //transforma a string digitada em int
            dia = Integer.parseInt(diaDigitado);

        }else{
            //não
            JOptionPane.showMessageDialog(null,"Digite uma data valida");
            return;
        }

        String mesDigitado = JOptionPane.showInputDialog(null, "Digite uma data valida");


        if(mesDigitado.matches(regex)){//mes é um numero
            mes = (Integer.parseInt(mesDigitado));
        }else{
            JOptionPane.showMessageDialog(null,"erro");
            return;
        }

        String anoDigitado = JOptionPane.showInputDialog(null, "Digite uma data valida");

        if(anoDigitado.matches(regex)){
            ano = (Integer.parseInt(anoDigitado));
        }else{
            JOptionPane.showMessageDialog(null,"erro");
            return;
        }


        LocalDate data = LocalDate.of(ano, mes, dia);
        JOptionPane.showMessageDialog(null,data.toString());
        System.out.println(data.toString());

    }
}
