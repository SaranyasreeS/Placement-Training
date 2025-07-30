import java.util.*;
class MenuItems{
    public void Menu()
    {
        System.out.println("---------------------Welcome to our restaurant---------------------");
        System.out.println("The menu items are: ");
        System.out.println("1. Dosa - Rs.70");
        System.out.println("2. Idly - Rs.30");
        System.out.println("3. Poori - Rs.50");
        System.out.println("4. Pongal - Rs.80");
        System.out.println("5. parotta - Rs.60");
        System.out.println("-----------------------------------------------");

    }
}
class RestaurantOrder{
    public void Order(){
        Scanner scan = new Scanner(System.in);
        int dish;
        System.out.println("Please enter what would you like to have: ");
        dish = scan.nextInt();
        int quantity;
        System.out.println("Please enter the quantity: ");
        switch (dish) {
            case 1:
                quantity = scan.nextInt();
                System.out.println("Total is: " + quantity * 70);
                System.out.println("Thanks for coming!");
                break;
            case 2:
                quantity = scan.nextInt();
                System.out.println("Total is: " + quantity * 30);
                System.out.println("Thanks for coming!");
                break;
            case 3:
                quantity = scan.nextInt();
                System.out.println("Total is: " + quantity * 50);
                System.out.println("Thanks for coming!");
                break;
            case 4:
                quantity = scan.nextInt();
                System.out.println("Total is: " + quantity * 80);
                System.out.println("Thanks for coming!");
                break; 
            case 5:
                quantity = scan.nextInt();
                System.out.println("Total is: " + quantity * 60);
                System.out.println("Thanks for coming!");
                break;
            default:
                System.out.println("Enter the dish and quantity otherwise we can't place order.");
            }
    }
}
public class RestaurantSystem{
    public static void main(String[] args){
        MenuItems menus = new MenuItems();
        menus.Menu();
        RestaurantOrder orders = new RestaurantOrder();
        orders.Order();
    }
}
