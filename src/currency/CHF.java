package currency;

public class CHF extends Money {
	
	
	
	public CHF(double amount){
		super(amount);
		this.setRate(1.5);
		// TODO Auto-generated constructor stub
	}
	@Override
	public CHF times(double times){
		return new CHF(this.getAmount()*times);
	}

}
