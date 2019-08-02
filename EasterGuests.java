import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double easterBreadPrice = 4;
        double eggPrice = 0.45;
        double easterBreadNeeeded = Math.ceil(guests / 3.0);
        double eggsNeeded = guests * 2;


        double easterBreatTotalPrice = easterBreadNeeeded * easterBreadPrice;
        double eggsTotalPrice = eggsNeeded * eggPrice;
        double totalPrice = easterBreatTotalPrice + eggsTotalPrice;

        if (budget >= totalPrice) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%nHe has %.2f lv. left.", easterBreadNeeeded, eggsNeeded, budget - totalPrice);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%nHe needs %.2f lv. more.", totalPrice - budget);
        }
    }
}
