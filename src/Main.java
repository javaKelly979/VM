
import java.util.Scanner;



public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        VM vendingMachine = new DisplayVM();

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        
        vendingMachine.SelectProduct(Integer.parseInt(selectedProduct));

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins); 
        vendingMachine.enterCoins(enteredCoins);

        vendingMachine.displayChangeMessage();

    }
}