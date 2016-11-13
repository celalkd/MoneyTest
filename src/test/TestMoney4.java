package test;

import static org.junit.Assert.*;
import org.junit.Test;
import bank.Bank;
import currency.*;

public class TestMoney4 {

	@Test
	public void test() {
		Dollar tenDollar = new Dollar(10);
		Dollar dollar250 = tenDollar.times(25);
		
		CHF tenCHF = new CHF(10);
		CHF cfh150 = tenCHF.times(15);
		
		Pound tenPound = new Pound(10);
		Pound pound80 = tenPound.times(8);
		
		Bank bank = new Bank();//banka sýnýfý lazým, para iþlemleri ona yüklenecek
		Money total = bank.sum(pound80, dollar250, cfh150);//add fonksiyonu lazým
		assertEquals(450,total.getAmount(),0);
	}

}
