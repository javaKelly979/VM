

public class DisplayVM implements VM{

	private int selectedProduct;
	private CoinBundle change;

	
	public void displayAllProducts() {
		 	System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println("     WELCOME TO THE GRP-9 VENDING MACHINE           ");
	        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println("            Products Available are:               ");
	        System.out.println("                                              ");
	        for(Product product: Product.values()){
	        System.out.println("     " + product.getId() + "  " + product.name() + " - Price:$ " + product.getValue() + "   ");
	            
	        }
	        System.out.println("                                              ");
	        System.out.println(" Kindly, select your product: ");

		
	}

	
	public void SelectProduct(int product) {
		this.selectedProduct=product;
		
	}

	
	public void displayEnterCoinsMessage() {
		System.out.println(" Please enter coins as follows: ");
        System.out.println(" no. of 1 cents coins,no. of 5 cents coins,no. of 10 cents coins,no. of 25 cents coins,no. of 10 cents coins,no of $1 Dollar(100 Cents) ");
        System.out.println("-------------------------****Example****-------------------------");
        System.out.println("If you would like to enter 2 ten cents coins: 0,0,2,0,0");
        System.out.println("Kindly, enter your coins:");
		
	}

	
	public void enterCoinsUser(int[] coins) {
		Calc calculator=new SimpleCalc(); // creating the calculator object 
		Product product=Product.valueOf(this.selectedProduct);
		int total=calculator.calculateEnteredCoinsTotal(new CoinBundle(coins));
		
		double x=total-product.getValue();
		int changeAmount=(int)x;
		this.change=calculator.calcuateChange(changeAmount);
	}

	
	public void displayChangeMessage() {
	     	System.out.println("                                              ");
	        System.out.println("Collect your total Change of $ :"+ change.getTotal()+"cents splitted as follows: ");
	        System.out.println("    $1			  coins: "+ change.noOf100CentsCoins);
	        System.out.println("    25    	cents coins: "+ change.noOf25CentsCoins);
	        System.out.println("    10  	cents coins: "+ change.noOf10CentsCoins);
	        System.out.println("    5 		cents coins: "+ change.noOf5CentsCoins);
	        System.out.println("    1  		cents coins: "+ change.noOf1CentsCoins);

	    }
	
}
