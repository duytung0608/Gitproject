package ss1_introdution_to_java.exercise1;

import java.util.Scanner;

public class CurrencyConverterApp {
    double usd, vnd;

    public CurrencyConverterApp(double usd, double vnd) {
        this.usd = usd;
        this.vnd = vnd;
    }
    public double getUsd() {
        return this.usd;
    }
    public void setUsd(double usd) {
        this.usd = usd;
    }
    public double getVnd() {
        return this.vnd;
    }
    public double convertUsdToVnd() {
        return this.usd*21000;
    }
    public double convertVndToUsd() {
        return this.vnd/21000;
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("money transfer app");
            System.out.println("1.Convert Vnd to Usd");
            System.out.println("2.Convert Usd to Vnd");
            System.out.println("3.Exit");
            System.out.println("Enter choice: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Vnđ: ");
                    double vnd = input.nextDouble();
                    CurrencyConverterApp currencyConverterApp = new CurrencyConverterApp(0,vnd);
                    System.out.println("USD after converting: " + currencyConverterApp.convertVndToUsd() );
                    break;
                }
                case 2: {
                    System.out.println("Enter Usd: ");
                    double usd = input.nextDouble();
                    CurrencyConverterApp currencyConverterApp = new CurrencyConverterApp(usd,0);
                    System.out.println("Vnd after converting: " + currencyConverterApp.convertUsdToVnd());
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("No convert");
                }
            }
        } while (choice != 3);
    }
}
