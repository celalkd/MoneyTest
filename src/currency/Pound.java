package currency;

public class Pound extends Money {
	public Pound(double amount) {
		super(amount);
		this.setRate(0.8);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Pound times(double times){
		return new Pound(this.getAmount()*times);
	}
}
