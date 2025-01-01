import java.util.*;

class Car {  // Creates a private class setting up for the array list
    private String make;
    private String model;
    private int year;
    private int price;

    public Car(String make, String model, int year, int price) {
        this.make = make;  // sets all strings in integers ready to be defined in the list!
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public String toString() {
        return make + " " + model + ": " + year + "| Price: " + price + "\n";
    }
}

public class Inventory {
    public static void currentInventory() {
        // Displays current inventory
        ArrayList<Car> carList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        carList.add(new Car("Mercedes", "Ford", 1990, 800));
        carList.add(new Car("BMW", "Audi", 1980, 1300));
        carList.add(new Car("Honda", "Honda", 1980, 700));
        carList.add(new Car("Volvo", "Volvo", 1980, 600));

        while (true) {
            // Print the list of cars Loop
            System.out.println("Current Inventory");
            for (Car car : carList) {
                System.out.print(car);
            }
            System.out.println("to return to the main menu, press M. ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("M")) {
                Main.Menu();
                break;
            } else {
                System.out.println("Please enter a valid option");
            }
        }
    }
    public static void main(String[] args) {
        currentInventory();  // Current Inventory Status
    }
}

