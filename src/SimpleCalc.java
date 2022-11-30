
public class SimpleCalc implements Calc{

	
	public int calculateTotal(CoinBundle enteredCoins) {

		return enteredCoins.getTotal();
	}

	
	public CoinBundle calcuateChange(int amountMoneyToReturn) {
		CoinBundle change =new CoinBundle(new int[5]);
		int remainingAmount=amountMoneyToReturn;
		change.number100CentsCoins=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		change.number25CentsCoins=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		change.number10CentsCoins=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		change.number5CentsCoins=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		change.number1CentsCoins=remainingAmount/1;
		remainingAmount=remainingAmount%1;
		return change;
	}

}
