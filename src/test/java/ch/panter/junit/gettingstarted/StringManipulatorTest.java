package ch.panter.junit.gettingstarted;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.panter.jmock.gettingstarted.StringManipulator;

public class StringManipulatorTest {

	String testString = "";
	String emptyString = "";
	static StringManipulator stringman;
	
	@Test
	public void testEmpty() {
		assertTrue(stringman.isEmpty(emptyString));
	}
	
	@Test
	public void testLengthZero() {
		assertTrue(stringman.isEmpty(""));
	}
	
	@Test
	public void testNotEmpty() {
		assertFalse(stringman.isEmpty(testString));
	}
	
	@Test
	public void testCapitalizeLowercase() {
		assertEquals("Hello", stringman.capitalize("hello"));
	}
	@Test
	public void testCapitalizeUppercase() {
		assertEquals("Hello", stringman.capitalize("HELLO"));
	}
	@Test
	public void testCapitalizeNumber() {
		assertEquals("123abc", stringman.capitalize("123abc"));
	}
	
	@Test
	public void testReverseString() {
		assertEquals("Test Hsz", stringman.reverse("zsH tseT"));
	}
	
	@Test
	public void testReverseNull() {
		try {
			stringman.reverse("");	
		} catch (NullPointerException e) {
			// TODO: handle exception
			assertNull(e);
		}
	}
	
	@Test
	public void testJoinStrings() {
		assertEquals("a b c ", stringman.join("a","b","c"));
	}
	
    @BeforeClass
    public static void setUpClass() throws Exception {
        // Code executed before the first test method
    	stringman = new StringManipulator();
    }
 
    @Before
    public void setUp() throws Exception {
        // Code executed before each test
    	testString = "hello";
    	
    }
    @After
    public void tearDown() throws Exception {
        // Code executed after each test   
    }
 
    @AfterClass
    public static void tearDownClass() throws Exception {
        // Code executed after the last test method 
    }
}
