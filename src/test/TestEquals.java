package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import currency.CHF;
import currency.Dollar;
import currency.Money;
import currency.Pound;

public class TestEquals {
 
	@Test
	public void test() {
		Money money1 = new Dollar(10);
		Money money2 = new Dollar(10);
		Money money3 = new CHF(10);
		Money money4 = new Dollar(5);		
		Money money5 = new CHF(15);
		Money money6 = new Pound(8);
		assertTrue(money1.equals(money2));
		assertFalse(money3.equals(money2));
		assertFalse(money4.equals(money2));
		assertTrue(money5.equals(money2));
		assertTrue(money6.equals(money2));
	}

}
