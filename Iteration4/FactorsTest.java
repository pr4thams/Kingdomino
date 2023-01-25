import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FactorsTester {

	@Test
	void testPerfect1()
	{	
		// TEST 1: should throw the exception because the parameter value is less than 1
		assertThrows(IllegalArgumentException.class, () -> FactorsUtility.perfect(0));
	}
	
	@Test
	void testPerfect2()
	{	
		// TEST 2: should succeed because 1 is a valid parameter value, but is not a perfect number
		assertFalse(FactorsUtility.perfect(1));
	}
	
	@Test
	void testPerfect3()
	{	
		// TEST 3: should succeed because 6 is a valid parameter value, and is a perfect number
		assertTrue(FactorsUtility.perfect(6));
	}
	
	@Test
	void testPerfect4()
	{	
		// TEST 4: should succeed because 7 is a valid parameter value, but is not a perfect number
		// I've coded this using assertEquals to show that there's often more than one way to write a test 
		boolean expected = false;
		assertEquals(expected, FactorsUtility.perfect(7));
	}
	@Test void testGetFactors1() 
	{ 
	 //TEST 1: should succeed because 2 is a valid parameter value and has 1 as a factor 
		ArrayList<Integer> expected = new ArrayList<Integer>();
	 	expected.add(1);
	 	assertEquals(expected, FactorsUtility.getFactors(2)); 
	}
	  
	@Test void testGetFactors2() 
	{ 
		//TEST 2: should succeed because 1 is a valid parameter value with no factors other than itself 
		ArrayList<Integer> expected = new ArrayList<Integer>();
		assertEquals(expected, FactorsUtility.getFactors(1)); 
	}
	   
	@Test void testGetFactors3() 
	{ 
		//TEST 3: should succeed because 0 is a valid parameter value with no factors 
		ArrayList<Integer> expected = new ArrayList<Integer>();
		assertEquals(expected, FactorsUtility.getFactors(0)); 
	}
	 
	@Test
	void testGetFactors4()
	{
		//TEST 4: should throw the exception because -1 is not a valid parameter value
		assertThrows(IllegalArgumentException.class, () -> FactorsUtility.getFactors(-1));
	}
	
	@Test void testGetFactors5() 
	{ //TEST 5: should succeed because 12 is a valid parameter value with a list of factors [1,2,3,4,6] 
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(6);
		assertEquals(expected, FactorsUtility.getFactors(12));
	}
	@Test
	void testFactor1()
	{
		//TEST 1: should throw an exception because a is less than 0
		assertThrows(IllegalArgumentException.class, () -> FactorsUtility.factor(-2, 2));
	}
	@Test
	void testFactor2()
	{
		//TEST 2: should throw an exception because b is less than 1
		assertThrows(IllegalArgumentException.class, () -> FactorsUtility.factor(2, 0));
	}
	@Test
	void testFactor3()
	{
		//TEST 3: should succeed because a = 0 and b = 1 are valid parameter values and 1 is a factor of 0
		assertTrue(FactorsUtility.factor(0, 1));
	}
	@Test
	void testFactor4()
	{
		//TEST 4: should succeed because a = 8 and b = 4 are valid parameters and 2 is a factor of 6
		assertTrue(FactorsUtility.factor(8, 4));
	}
	@Test
	void testFactor5()
	{
		//TEST 5: should succeed because a = 8 and b = 3 are valid parameters but 5 is not a factor of 6
		assertFalse(FactorsUtility.factor(8, 3));
	}
	
	

}
