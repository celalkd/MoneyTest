package bank;
import currency.*;

public class Bank {
	
	public Money sum(Money... moneys){
		double sum=0;
		for(Money m : moneys){
			 sum += m.getAmount()/m.getRate();
		}
		return new Money(sum);
	}
}
