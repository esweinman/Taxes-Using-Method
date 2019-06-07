package taxes;

import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price, njrate, nyrate, njcost, nycost;

        njrate = 0.07;
        nyrate = 0.10;

        System.out.print("enter a price: $");
        price = input.nextDouble();

        njcost = price + tax(price, njrate);
        nycost = price + tax(price, nyrate);

        System.out.println("The NJ cost with tax is: $" + njcost);
        System.out.println("The NY cost tax is: $" + nycost);

    }

    public static double tax(double price, double rate) {
        return price * rate;
    }
}
