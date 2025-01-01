import java.util.*;

class GarageInventory {
    private String make;
    private String model;
    private int year;
    private String issue;

    public GarageInventory(String make, String model, int year, String issue) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.issue = issue;
    }
    public String toString() {
        return make + " " + model + " " + year + "| Current Issue: " + issue + " " + "\n";
    }
}
public class GarageInventoryMain {
    public static void carGarageInventory() {
        ArrayList<GarageInventory> garageList = new ArrayList<>();
        garageList.add(new GarageInventory("Chevy", "Silverado", 2015, "Radiator"));
        garageList.add(new GarageInventory("Honda", "CRV", 2019, "Catalytic Convertor"));
        while (true) {
            for (GarageInventory garage : garageList) {
                System.out.println(garage);
            }
            System.out.println("to return to the main menu, press M");
            String input = System.console().readLine();
            if (input.equalsIgnoreCase("M")) {
                Main.Menu();
                break;
            }
            else {
                System.out.println("Please enter a valid option");
            }

        }
    }
    public static void main(String[] args) {
        carGarageInventory();
    }
}


