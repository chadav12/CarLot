import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new username: ");
        String username = sc.nextLine();
        System.out.print("Enter new Pasword: ");
        String newPasword = sc.nextLine();
        System.out.print("You entered, " + username + " and " + newPasword + ": ");
        while (true) {
            Scanner scanner = new Scanner(System.in); // Scanner used for input next prompts
            System.out.println("Welcome to the CAR dealership! please enter your login below!");
            System.out.print("Login: ");  // Input login
            String login = scanner.nextLine();
            System.out.print("Password: "); // Input password
            String password = scanner.nextLine();
            if (login.equals(username) && password.equals(newPasword)) {  // TODO Change the password to be customizable
                System.out.println("Welcome Charlie!");
                Menu();
                break;
            }
            else {
                System.out.println("Incorrect Login or Password! Try again!");  // if incorrect prompts to try again!
            }
        }
    }
    public static void Menu () {
        while (true) {  // Displays main menu loop
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the main menu!");
            System.out.println("View Sales: 1");
            System.out.println("View Car lot: 2");
            System.out.println("View Cars in the garage: 3");
            System.out.println("Buyer Menu: 4");
            int option = scanner.nextInt();
            if (option == 1) {
                Sales();  // Move to the sales menu
                break;
            }
            else if (option == 2) {
                carLot();  // Moves to the car inventory menu
                break;
            }
            else if (option == 3) {
                carGarage();  // Moves to the garage menu
                break;
            }
            else if (option == 4) {
                buyermenu();  // Moves to the buyer Menu where transactions are made
                break;
            }
            else {
                System.out.println("Invalid option! Try again!");
            }
        }
    }
    public static void Sales () {
        System.out.println("Welcome to the sales menu!");  // Display the sales and the quota for the fiscal year
        salesMenu.main(null);
    }
    public static void carLot() {
        System.out.println("Welcome to the car lot!");  // Displays what is currently available in the inventory
        Inventory.currentInventory();
    }
    public static void carGarage() {
        System.out.println("Welcome to the car garage!");  // Displays current vehicles that are being serviced
        GarageInventoryMain.carGarageInventory();
    }
    public static void buyermenu() {
        System.out.println("Welcome to the buyer menu!");  // This is for when it is time to make a sale
        paperWork.salesFinalize();
    }
}
