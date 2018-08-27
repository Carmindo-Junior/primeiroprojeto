package primeiroprojeto;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
//biblioteca para pegar os dados digitados pelo usuario


public class CarroLitro {

    public static void main(String[] args) {


        double litro;
        double tempo;
        double velocidade;
        double distancia;
        double litro12 = 12;


        String tempoDigitado = JOptionPane.showInputDialog(null, "Digite o tempo do percusso em horas");
        String regex = "\\d+";
        //regex e uma expressao regular juntamente com \\d+

        if (tempoDigitado.matches(regex)) {//tempo é um número
            // se sim
            //transforma a string digitada em double
            tempo = Double.parseDouble(tempoDigitado);

        } else {
            //não
            JOptionPane.showMessageDialog(null, "Digite um tempo valido");
            return;
        }

        String velocidadeDigitado = JOptionPane.showInputDialog(null, "Digite a velocidade media");


        if (velocidadeDigitado.matches(regex)) {//mes é um numero
            velocidade = (Double.parseDouble(velocidadeDigitado));
        } else {
            JOptionPane.showMessageDialog(null, "velocidade invalida");
            return;
        }


        distancia = tempo * velocidade;
        litro = distancia / litro12;

        JOptionPane.showMessageDialog(null, "Foram gastos" + litro + "litros na viagem em" + tempo + "horas, " +
                "percorrendo uma distancia de" + distancia);


    }
}

