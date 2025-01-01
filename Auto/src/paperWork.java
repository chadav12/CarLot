import java.awt.Desktop;
import java.util.*;
import java.io.*;

public class paperWork {
    public static void salesFinalize() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Sales Menu!");
            System.out.println("Please print out necessary paperwork to finalize close! ");
            System.out.println("To print out paperwork, press '1', and then enter! to return to the main menu, press 'M' ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                try {File file = new File("Paperwork.txt");
                    Desktop.getDesktop().open(file);
                    }
                catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
            else if (input.equalsIgnoreCase("M")) {
                Main.Menu();
            }
            else {
                System.out.println("Invalid input!");
            }
        }
    }
}
