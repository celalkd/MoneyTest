package test;

import static org.junit.Assert.*;

import org.junit.Test;

import bank.Bank;
import bank.Instrument;
import bank.Report;
import currency.CHF;
import currency.Dollar;
import currency.Money;

public class TestMoney7 {

	@Test
	public void test() {
		Bank bank = new Bank();
		Dollar tenDollar = new Dollar(10);
		Dollar dollar25 = tenDollar.times(2.5);		
		Dollar dollar100 = tenDollar.times(10);
		
		CHF tenCHF = new CHF(10);
		CHF chf150 = tenCHF.times(15);
		
		Instrument ibm = new Instrument();
		ibm.setShares(1000);
		ibm.setPrice(dollar25);
		ibm.calculateValue();
		assertEquals(25000, ibm.getTotalValue().getAmount(), 0);
		
		Instrument ge = new Instrument();
		ge.setShares(400);
		ge.setPrice(dollar100);
		ge.calculateValue();
		assertEquals(40000, ge.getTotalValue().getAmount(), 0);

		Instrument novartis = new Instrument();
		novartis.setShares(400);
		novartis.setPrice(chf150);
		novartis.calculateValue();
		assertEquals(60000, novartis.getTotalValue().getAmount(), 0);
		
		Report report = new Report();		
		report.addInstrument(novartis, ge, ibm);
		Money repTotal = report.getRepTotal();//instrumentlarýn toplam Money deðerini döndüren method yaz
		assertEquals(105000, repTotal.getAmount(), 0);//Bank sýnýfýna gerek kalmadý
	}

}
