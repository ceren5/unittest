package com.pabeda.unittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class pabedaTest {

	@Test
	public void test() {
		pabeda islem = new pabeda ();
		int toplam  = islem.topla(34, 4);
		assertEquals(toplam,38);
}

}
