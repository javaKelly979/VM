	//Created Calculator interface to make sure the encapsulation principle is followed
public interface Calc {
 int calculateEnteredCoinsTotal(CoinBundle enteredCoins); //Calculating the total number of Coins Bundle entered by user
 CoinBundle calcuateChange(int moneyReturned); //Changed in Denominations Money to be returned to Customer
}
