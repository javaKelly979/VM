public enum Coin {
	ONE_CENT(1),FIVE_CENTS(5),TEN_CENTS(10),TWENTYFIVE_CENTS(25);
	private int value;
	 Coin(int value) {
		this.value=value;
	}
	 public int getValue() {
		 return this.value;
	 }
	 public static int[] parseCoins(String coins) {
		 String[] coinsInText=coins.split(",");
		 int[] result = new int[coinsInText.length];
		 
		 for(int index=0;index<coinsInText.length;index++) {
			 result[index]=Integer.parseInt(coinsInText[index]);
		 }
		 return result;
	 }
}
