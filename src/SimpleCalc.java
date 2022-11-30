
public class SimpleCalc implements Calc{

	
	public int calculateEnteredCoinsTotal(CoinBundle enteredCoins) {

		return enteredCoins.getTotal();
	}

	
	public CoinBundle calcuateChange(int moneyReturned) {
		CoinBundle change =new CoinBundle(new int[5]); 
		int remainingAmount=moneyReturned;
		change.noOf100CentsCoins=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		change.noOf25CentsCoins=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		change.noOf10CentsCoins=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		change.noOf5CentsCoins=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		change.noOf1CentsCoins=remainingAmount/1;
		remainingAmount=remainingAmount%1;
		return change;
	}

}
