package currency;

public class Money {
	private double amount;
	private double rate ;
	
	public Money(){
		this.amount = 0;
	}	
	public Money(Money... moneys){
		for(Money m : moneys){
			this.amount += m.getAmount()/m.getRate();
		}
	}	
	public Money(double amount){
		this.amount = amount;
	}
	public boolean equals(Money m){
		if(m.getAmount()==this.amount && m.getClass()== this.getClass())
			return true;
		return false;
			
	}
	public Money times(double times){
		return new Money(this.amount*times);
	}	
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double value) {
		this.amount = value;
	}
}
