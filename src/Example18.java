import java.util.Scanner;

public class Example18 {
    public static void main(String[] argv) {
        float hours;
        float price;
        double gross;
        double taxes = 0;
        double netpay;

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write hours");
        hours = inputValue.nextFloat();

        System.out.println("Write price");
        price = inputValue.nextFloat();

        if(hours > 35) {
            gross = 35 * price + (hours - 35) * price * 1.5;
        } else {
            gross = hours * price;
        }
        System.out.println("gross salary:" +gross+ "");

        if(gross > 500) {
            if(gross >  900) {
                taxes = 400 * 0.25 + (gross - 900) * 0.45;
            } else {
                taxes = (gross - 500) * 0.25;
            }

        }

        netpay = gross - taxes;
        System.out.println("Taxes:" +taxes);
        System.out.println("Net Pay:" +netpay);

    }
}
