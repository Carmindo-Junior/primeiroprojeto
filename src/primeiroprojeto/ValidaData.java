package primeiroprojeto;


import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
//biblioteca para pegar os dados digitados pelo usuario


public class ValidaData {

    public boolean validacaoData(int dia, int mes, int ano)
    {
        boolean flag = true;

       if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || ano <= 0) {
            flag = false;
        } else {
            if (dia > 0 && dia <= 31 && mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && ano > 0) {
                flag = true;
            } else {
            } if (dia > 0 && dia <= 30 && mes == 4 || mes == 6 || mes == 9 || mes == 11 && ano > 0) {
               flag = true;
            } else {
                if (dia > 0 && dia <= 28 && mes == 2 && ano > 0) {
                    flag = true;
                } else {
                    if (dia > 0 && dia <= 29 && mes == 2 && ano > 0 && ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
                        flag = true;
                    } else {
                        if (dia >= 29 && mes == 2 && ano % 400 != 0 || ano % 4 != 0 && ano % 100 == 0) {
                            flag = false;
                        } else {
                            if (dia >= 31 && mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                                flag = false;
                            }
                        }
                    }
                }
            }
        }

        return flag;
    }
}
