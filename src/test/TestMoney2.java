package test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoney2 {

	@Test
	public void test() {
		/*Money oneDollar = new Money("$", 1);
		Money dollar25 = oneDollar.times(25);//times methodunu de�i�tir
		assertEquals(25, dollar25.getAmount(),0);
		Money oneCHF = new Money("CHF", 1);
		Money chf150 = oneCHF.times(150);
		assertEquals(150,chf150.getAmount(),0);
		
		Money total = new Money("$",0);//money toplama methodu gerekli
		total.add(chf150);
		total.add(dollar25);
		
		assertEquals(125,total.getAmount(),0);
		//hata verdi ��nk� currency exchange yok
		//t�m paralar� dollar cinsinden toplamak istiyoruz
		//dollara �evirmek i�in rate bilmemiz gerekli
		//her currency i�in bir subclass yap�p final static olarak rate'i saklayabiliriz
		//b�ylece para class�ndan currency field�n� da ��kart�r�z*/
	}

}
