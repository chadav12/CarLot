import java.util.*;

class carList {
    private int carsSold;
    private int totalProfit;

    public carList(int carsSold, int totalProfit) {
        this.carsSold = carsSold;
        this.totalProfit = totalProfit;
    }
    public String toString() {
        return "Cars Sold: " + carsSold + " Total Profit: " + totalProfit;  // TODO Need to set this to include a list
    }
}
public class salesMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Cars Sold: ");
        int carsSold = sc.nextInt();
        System.out.println("Enter the total Profit: ");
        int totalProfit = sc.nextInt();
        carList carList = new carList(carsSold, totalProfit);
        System.out.println(carList);
    }
}

