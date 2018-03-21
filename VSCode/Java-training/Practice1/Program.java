/*Requirements Analysis (English Description) Create a program that allow a user to calculate how much a customer owes for the fruits they are buying at a fruit stand.  The user will be given an option to purchase apples, bananas, or mangoes. Once the user picks one of the fruits, they will be asked how many of that fruit they would like to purchase. The customer will then be charged for that many fruits. The program should end by displaying the amount they owe for the fruits they are purchasing.  Apples cost 30 cents each.  Bananas cost 40 cents each.  Mangoes cost 50 cents each. If the customer picks any other fruit, the program should end by informing the customer that type of fruit is not sold here.
*/
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double price;
        int quantity;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which fruit do you want today? We have apple, banana and mango. Please pick one");
        String fruit = keyboard.nextLine();
        if (fruit.toLowerCase().equals("apple")) {
            price = 0.3;
            System.out.println("How many apple do you want?");
            quantity = keyboard.nextInt();
            System.out.println("You buy " + quantity + " apples. That costs " + price * quantity + " dollars");
        } else if (fruit.toLowerCase().equals("banana")) {
            price = 0.4;
            System.out.println("How many banana do you want?");
            quantity = keyboard.nextInt();
            System.out.println("You buy " + quantity + " bananas. That costs " + price * quantity + " dollars");
        } else if (fruit.toLowerCase().equals("mango")) {
            price = 0.5;
            System.out.println("How many mango do you want?");
            quantity = keyboard.nextInt();
            System.out.println("You buy " + quantity + " mangoes. That costs " + price * quantity + " dollars");
        } else System.out.println("That type of fruit is not sold here");
        keyboard.close();
    }
}
