package com.DBS.TrainingMAven.demporj;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {

	@Test
	public void test() {
	Calculator cal = new Calculator();
	int ans = cal.add(5, 10);
	assertEquals(15,ans);
	}

}
