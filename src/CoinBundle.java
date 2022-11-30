//Created Coind Bundle to take array of coins denominations and give the total exact chnage 
public class CoinBundle {
    public int noOf1CentsCoins;
    public int noOf5CentsCoins;
    public int noOf10CentsCoins;
    public int noOf25CentsCoins;
    public int noOf100CentsCoins;
    
    public CoinBundle(int[] enteredCoins) {
        this.noOf1CentsCoins = enteredCoins[0];
        this.noOf5CentsCoins = enteredCoins[1];
        this.noOf10CentsCoins = enteredCoins[2];
        this.noOf25CentsCoins = enteredCoins[3];
        this.noOf100CentsCoins = enteredCoins[4];
    }
    public int getTotal() {
    	int total=0;
    	total=total+this.noOf1CentsCoins*1;
    	total=total+this.noOf5CentsCoins*5;
    	total=total+this.noOf10CentsCoins*10;
    	total=total+this.noOf25CentsCoins*25;
    	total=total+this.noOf100CentsCoins*100;
    	return total;
    }
}