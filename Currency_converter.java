import java.util.Scanner;
public class Currency_converter {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base currency (USD, EUR, GBP, OMR, KWD, INR): ");
        String currency = scanner.next().toUpperCase();
        System.out.print("Enter target currency (USD, EUR, GBP, OMR, KWD, INR): ");
        String tartget = scanner.next().toUpperCase();
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        double change_to = getExchangeRate(currency, tartget);
        if (change_to != 0.0) {
            double finalamount = amount * change_to;
            System.out.println("Converted Amount: " + finalamount + " " + tartget);
        } else {
            System.out.println("Currency conversion not available for the selected currencies.");
        }
        scanner.close();
    }
    public static double getExchangeRate(String base, String target) {
        if (base.equals("USD") && target.equals("EUR")) {
            return 0.85;
        } else if (base.equals("USD") && target.equals("GBP")) {
            return 0.75;
        } else if (base.equals("USD") && target.equals("OMR")) {
            return 0.38;
        } else if (base.equals("USD") && target.equals("KWD")) {
            return 0.30;
        } else if (base.equals("USD") && target.equals("INR")) {
            return 73.5;
        } else if (base.equals("EUR") && target.equals("USD")) {
            return 1.18; 
        } else if (base.equals("EUR") && target.equals("GBP")) {
            return 0.88;
        } else if (base.equals("GBP") && target.equals("USD")) {
            return 1.33;
        } else if (base.equals("GBP") && target.equals("EUR")) {
            return 1.14;
        } else if (base.equals("OMR") && target.equals("USD")) {
            return 2.60;
        } else if (base.equals("KWD") && target.equals("USD")) {
            return 3.30;
        } else if (base.equals("INR") && target.equals("USD")) {
            return 0.014;
        } else if (base.equals("INR") && target.equals("KWD")) {
            return 0.0043;
        } else if (base.equals("KWD") && target.equals("INR")) {
            return 274.80;
        } else {
            return 0.0;
        }
    }
}
