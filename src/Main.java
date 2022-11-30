
import java.util.Scanner;



public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Console Input
         // Calling all the methods from the interface VM whose methods are called in DisplayVM class
        VM vendingMachine = new DisplayVM();
        // created the vendingMachine object 
        vendingMachine.displayAllProducts();

        String selectedProduct = scanner.nextLine();
        
        vendingMachine.SelectProduct(Integer.parseInt(selectedProduct));

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine(); // taking the input as string and converting into 
        
        //Converted string to array by calling parsing method from Coin Enum
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins); 
        vendingMachine.enterCoinsUser(enteredCoins);

        vendingMachine.displayChangeMessage();

    }
}