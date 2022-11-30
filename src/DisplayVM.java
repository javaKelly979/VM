

public class DisplayVM implements VM{

	private int selectedProduct;
	private CoinBundle change;

	
	public void displayProducts() {
		 	System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println("     WELCOME TO THE GRP-9 VENDING MACHINE           ");
	        System.out.println(" +++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println("            Products available:               ");
	        System.out.println("                                              ");
	        for(Product product: Product.values()){
	            if(!Product.EMPTY.equals(product)) {
	                System.out.println("     " + product.getId() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
	            }
	        }
	        System.out.println("                                              ");
	        System.out.println(" Please select your product: ");

		
	}

	
	public void SelectProduct(int product) {
		this.selectedProduct=product;
		
	}

	
	public void displayEnterCoinsMessage() {
		System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 1 cents coins,num of 5 cents coins,num of 10 cents coins,num of 25 cents coins,num of 10 cents coins,num of 1 Dollar");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,0,2,0,0");
        System.out.println("Plese enter coins:");
		
	}

	
	public void enterCoins(int[] coins) {
		Calc calculator=new SimpleCalc();
		Product product=Product.valueOf(this.selectedProduct);
		int total=calculator.calculateTotal(new CoinBundle(coins));
		
		double x=total-product.getPrice();
		int changeAmount=(int)x;
		this.change=calculator.calcuateChange(changeAmount);
	}

	
	public void displayChangeMessage() {
	     	System.out.println("                                              ");
	        System.out.println("Your change is :"+ change.getTotal()+"cents splitted as follows: ");
	        System.out.println("    1 Dollar coins: "+ change.number100CentsCoins);
	        System.out.println("    25 cents coins: "+ change.number25CentsCoins);
	        System.out.println("    10 cents coins: "+ change.number10CentsCoins);
	        System.out.println("    5 cents coins: "+ change.number5CentsCoins);
	        System.out.println("    1 cents coins: "+ change.number1CentsCoins);

	    }
	
}
