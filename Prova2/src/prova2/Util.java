
package prova2;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Util {
    public static String formatarData(LocalDate data){

DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");

return formatar.format(data);

    }

public static String formatarBrl(double valor){



NumberFormat formatar = NumberFormat.getCurrencyInstance();

return formatar.format(valor);
}
