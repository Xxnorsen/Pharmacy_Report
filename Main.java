import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter pharmacy capacity: ");

            if (scanner.hasNextInt()) {
                capacity = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            }
            else {
                System.out.println("Invalid input. Capacity must be an integer.");
                scanner.nextLine();
            }
        }

        Pharmacy pharmacy = new Pharmacy(capacity);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add drug");
            System.out.println("2. Remove drug");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    pharmacy.addDrug();
                    break;
                case 2:
                    pharmacy.removeDrug();
                    break;
            }
            System.out.println();
        }
    }
}