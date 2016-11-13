package test;

import static org.junit.Assert.*;
import bank.*;
import currency.*;
import org.junit.Test;

public class TestMoney6 {

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
		ibm.setPrice(dollar25);//price fieldý Money türünde olmalý
		ibm.calculateValue();//totalValue de money sýnýfýndan olmalý
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
		
		Money totInst = bank.sum(ibm.getTotalValue(),ge.getTotalValue());
		assertEquals(65000, totInst.getAmount(), 0);
		
		Money totInstDiffCur = bank.sum(ibm.getTotalValue(),ge.getTotalValue(),novartis.getTotalValue());
		assertEquals(105000, totInstDiffCur.getAmount(), 0);
		
		
		
	}

}
