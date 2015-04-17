package ExpediaTest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import Expedia.Hotel;

public class HotelTest {

	@Test
	public void TestThatHotelInitializes() {
		Hotel target = new Hotel(5);
		Assert.assertNull(target);
	}
	
	@Test(expected=RuntimeException.class)
	public void TestThatHotelConstructorThrowsException() {
		Hotel target = new Hotel(-1);
	}

}
