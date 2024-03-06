

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
public class utils{

    static NumberFormat numberFormat = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols());// ta faltando uma parte pq ta fora de uso

    public static String doubleToString(Double value){
        return numberFormat.format(value);
    }
}