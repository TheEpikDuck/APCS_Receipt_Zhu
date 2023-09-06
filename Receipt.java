import java.util.Scanner;

public class Receipt
{
    public static void main (String[] args)
    {
        String food = "waffles";
        String food2 = "nuggets";
        String food3 = "potatoes";
        int priceWaffle = 69;
        int priceNuggets = 100;
        int pricePotatoes = 200;
        double price = total;
        
        
        System.out.print("Welcome to Julia's store buy something or else u die :D ");
        System.out.println("We sell waffles, chicken nuggets and potatoes would you like to buy anything? ");
        {
        
            Scanner scan = new Scanner(System.in);
            System.out.println(" Our deliciously burnt waffles are $69, our smelly chicken nuggets are $100, and out raw green potatoes are $200. What do u want to buy? ");
            food = scan.nextLine();

            System.out.println(" do you want to purchase anything else? ");
            food2 = scan.nextLine();
            food3 = scan.nextLine();

            System.out.println(" your total is " + total);

            
        }

        
        System.out.print("you died ");

    }
}
