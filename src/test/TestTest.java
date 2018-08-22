package test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTest {
	
	
//	    @Test
//	    public void shouldWorkForSomeExamples() throws Exception {
//	      assertEquals("negative numbers aren't square numbers", false, TestClass.isSquare(-1));
//	      assertEquals("0 is a square number (0 * 0)",    true,   TestClass.isSquare(0));
//	      assertEquals("3 isn't a square number", false,  TestClass.isSquare(3));
//	      assertEquals("4 is a square number (2 * 2)",    true,   TestClass.isSquare(4));
//	      assertEquals("25 is a square number (5 * 5)",   true,   TestClass.isSquare(25));
//	      assertEquals("26 isn't a square number",false,  TestClass.isSquare(26));      
//	    }
	
	
//    @Test
//    public void exampleTests() {
//        assertEquals('e', TestClass.findMissingLetter(new char[] { 'a','b','c','d','f' }));
//        assertEquals('P', TestClass.findMissingLetter(new char[] { 'O','Q','R','S' }));
//    }
	
//	@Test
//    public void test() {
//        System.out.println("Fixed Tests calculateYears");
//        assertEquals(3, TestClass.calculateYears(1000,0.05,0.18,1100));
//        assertEquals(14 , TestClass.calculateYears(1000,0.01625,0.18,1200));
//        assertEquals(0, TestClass.calculateYears(1000,0.05,0.18,1000));
//    }
//	@Test
//	  public void Test1() {
//	    assertEquals("42 -9", TestClass.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
//	  }
//	
//
//    private static void testing(long a, long b, long[] res) {
//        assertEquals(Arrays.toString(res), 
//                     Arrays.toString(TestClass.sumDigPow(a, b).toArray()));
//    }
//    @Test
//    public void test() {
//        System.out.println("Basic Tests");
//        testing(1, 10, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
//        testing(1, 100, new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
//        testing(10, 100,  new long[] {89});
//        testing(90, 100, new long[] {});
//        testing(90, 150, new long[] {135});
//        testing(50, 150, new long[] {89, 135});
//        testing(10, 150, new long[] {89, 135});
//    }
    
//    @Test
//	public void BasicTests() {
//		System.out.println("****** Basic Tests ******");
//		assertEquals(3, TestClass.persistence(39));
//		assertEquals(0, TestClass.persistence(4));
//	  assertEquals(2, TestClass.persistence(25));
//	  assertEquals(4, TestClass.persistence(999));
//	}
	
//	 @org.junit.Test
//	    public void convertBinaryArrayToInt() throws Exception {
//
//	      assertEquals(1, TestClass.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
//	      assertEquals(15, TestClass.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,1,1,1))));
//	      assertEquals(6, TestClass.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0))));
//	      assertEquals(9, TestClass.convertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1))));
//
//
//	    }
////	 
//	 @Test
//	  public void testEncrypt() {
//	    // assertEquals("expected", "actual");
//	    assertEquals("This is a test!", TestClass.encrypt("This is a test!", 0));
//	    assertEquals("hsi  etTi sats!", TestClass.encrypt("This is a test!", 1));
//	    assertEquals("s eT ashi tist!", TestClass.encrypt("This is a test!", 2));
//	    assertEquals(" Tah itse sits!", TestClass.encrypt("This is a test!", 3));
//	    assertEquals("This is a test!", TestClass.encrypt("This is a test!", 4));
//	    assertEquals("This is a test!", TestClass.encrypt("This is a test!", -1));
//	    assertEquals("hskt svr neetn!Ti aai eyitrsig", TestClass.encrypt("This kata is very interesting!", 1));
//	  }
//	    
//	  @Test
//	  public void testDecrypt() {
//	    // assertEquals("expected", "actual");
//	    assertEquals("This is a test!", TestClass.decrypt("This is a test!", 0));
//	    assertEquals("This is a test!", TestClass.decrypt("hsi  etTi sats!", 1));
//	    assertEquals("This is a test!", TestClass.decrypt("s eT ashi tist!", 2));
//	    assertEquals("This is a test!", TestClass.decrypt(" Tah itse sits!", 3));
//	    assertEquals("This is a test!", TestClass.decrypt("This is a test!", 4));
//	    assertEquals("This is a test!", TestClass.decrypt("This is a test!", -1));
//	    assertEquals("This kata is very interesting!", TestClass.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
//	  }
//	    
//	  @Test
//	  public void testNullOrEmpty() {
//	    // assertEquals("expected", "actual");
//	    assertEquals("", TestClass.encrypt("", 0));
//	    assertEquals("", TestClass.decrypt("", 0));
//	    assertEquals(null, TestClass.encrypt(null, 0));
//	    assertEquals(null, TestClass.decrypt(null, 0));
//	  }
	  
	  @Test
		public void testNormalCondition() {
			assertEquals(9, TestClass.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
		}

		@Test
		public void testEmptyArray() {
			assertEquals(0, TestClass.solveSuperMarketQueue(new int[] {}, 1));
		}

		@Test
		public void testSingleTillManyCustomers() {
			assertEquals(15, TestClass.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
		}




	
}
