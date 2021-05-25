package practice_codes.paypal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashRegisterTest {

	@Test
	void testCashRegister() {
		Assertions.assertEquals("NICKEL,PENNY", CashRegister.callCashRegister(15.94f, 16.00f));
		Assertions.assertEquals("ERROR", CashRegister.callCashRegister(17f, 16f));
		Assertions.assertEquals("ZERO", CashRegister.callCashRegister(35f, 35f));
		Assertions.assertEquals("FIVE", CashRegister.callCashRegister(45f, 50f));
	}
	
}
