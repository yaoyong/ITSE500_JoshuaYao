package edu.oit.lesson2;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class DayCountTest {
private static DayCount myDayCount;
	
	@BeforeClass public static void init() {
		myDayCount = new DayCount();
			
	}
	@Test
	public void test() {
		assertEquals(myDayCount.dayCount(2000, 2)[0], 29);
		assertEquals(myDayCount.dayCount(2014, 2)[1], 365);
	}

}
