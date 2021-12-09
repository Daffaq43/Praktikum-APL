
/*** Class Main.
 * @author Daffaq Syafiq
 * 
 */

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        // Penggunaan Strategy pattern
        System.out.println("Pilih minuman kesukaan anda : \n1. Aqua\n2. Susu");
        scanner = new Scanner(System.in);
        int pilih = scanner.nextInt();

        StrategyPattern drink = new StrategyPattern();

        if (pilih == 1) {
            drink.setBasicDrink(new Aqua());
        } else if (pilih == 2) {
            drink.setBasicDrink(new Susu());
        } 

        System.out.println("Minuman kesukaan anda adalah " + drink.getBasicDrink() + "\n");

        // Penggunaan Adapter Pattern
        SweatDrink fanta = new Fanta();

        System.out.print("Minuman " + drink.getBasicDrink() + " adalah ");
        drink.basic();

        BasicDrink adapter = new AdapterPattern(fanta);
        System.out.print("kini " + drink.getBasicDrink() + "  adalah ");
        adapter.basic();
    }
}
