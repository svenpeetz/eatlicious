package org.eaticious.common;

import static org.junit.Assert.*;

import org.eaticious.common.Unit;
import org.eaticious.greenlicious.PhysicalDimension;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDimension() {
		assertTrue(Unit.KILOGRAM.getDimension().equals(PhysicalDimension.MASS));
	}

	@Test
	public void testIsMassUnit() {
		Unit unit = Unit.KILOGRAM;
		assertTrue(unit.isMassUnit());
	}

	@Test
	public void testIsConvertable() {
		Unit unit = Unit.KILOGRAM;
		assertTrue(unit.isConvertable(Unit.OUNCE));
	}

	@Test
	public void testConvert() {
		Unit unit = Unit.KILOGRAM;
		assertEquals(new Double(1000), unit.convert(1d,Unit.GRAM));
	}

	@Test
	public void testGetConversionFactor() {
		Unit unit = Unit.GRAM;
		assertEquals(new Double(0.001), unit.getConversionFactor(Unit.KILOGRAM));
	}

}