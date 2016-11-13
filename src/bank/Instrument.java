package bank;

import currency.*;

public class Instrument {
	private double shares;
	private Money price;
	private Money totalValue;
	
	public void calculateValue(){
		this.setTotalValue(this.price.times(shares));
	}
	public double getShares() {
		return shares;
	}
	public Money getPrice() {
		return price;
	}
	public Money getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Money totalValue) {
		this.totalValue = totalValue;
	}
	public void setShares(double shares) {
		this.shares = shares;
	}
	public void setPrice(Money price) {
		this.price = price;
	}
}
