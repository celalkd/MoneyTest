package test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoney2 {

	@Test
	public void test() {
		/*Money oneDollar = new Money("$", 1);
		Money dollar25 = oneDollar.times(25);//times methodunu deðiþtir
		assertEquals(25, dollar25.getAmount(),0);
		Money oneCHF = new Money("CHF", 1);
		Money chf150 = oneCHF.times(150);
		assertEquals(150,chf150.getAmount(),0);
		
		Money total = new Money("$",0);//money toplama methodu gerekli
		total.add(chf150);
		total.add(dollar25);
		
		assertEquals(125,total.getAmount(),0);
		//hata verdi çünkü currency exchange yok
		//tüm paralarý dollar cinsinden toplamak istiyoruz
		//dollara çevirmek için rate bilmemiz gerekli
		//her currency için bir subclass yapýp final static olarak rate'i saklayabiliriz
		//böylece para classýndan currency fieldýný da çýkartýrýz*/
	}

}
