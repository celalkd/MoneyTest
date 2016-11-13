package bank;

import java.util.ArrayList;

import currency.Money;

public class Report {
	private ArrayList<Instrument> instruments = new ArrayList<>();
	private Money repTotal;
	
	public void addInstrument(Instrument... insts){
		for(Instrument instrument : insts){
			instruments.add(instrument);
		}
	}
	public Money getRepTotal(){
		double repTotalAmount=0;
		for(Instrument instrument : instruments){
			repTotalAmount+=instrument.getTotalValue().getAmount()/instrument.getTotalValue().getRate();
		}
		return new Money(repTotalAmount);
	}
}
