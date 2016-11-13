package currency;

public class Dollar extends Money {
	
	
	
	public Dollar(double amount) {
		super(amount);
		this.setRate(1.0);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Dollar times(double times){
		return new Dollar(this.getAmount()*times);
	}

}
