import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyConverter {


    public static double yenToDollar(double yen){

        double dollarAmount = yen*0.15;

        return dollarAmount;

    }
    public static double dollarToYen(double dollar){

        double yenAmount = dollar*0.15;

        return yenAmount;

    }


    public static void main(String[] args) throws Exception{
//        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
////        String value = nf.getCurrency().getDisplayName();
//        double amount = 123.55;
//        System.out.println(nf.format(amount));

        NumberFormat yenF = NumberFormat.getCurrencyInstance(Locale.CHINA);

        String yenValue = yenF.getCurrency().getDisplayName();
        System.out.println(yenValue);
        double yenAmount1 = 550;
        System.out.println(yenF.format(yenAmount1));

        double dollar1 = yenToDollar(yenAmount1);
        System.out.println(dollar1);

        int i = 50;

        String s = String.valueOf(i);
        System.out.println(s);



    }


}
