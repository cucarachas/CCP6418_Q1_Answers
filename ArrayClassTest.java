import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayClassTest {

	@Test
	public void test() {
		
		int[] arr = {6, 3, 5, 10, 2, 7, 1, 8};
		int[] arrs = {1, 2, 3, 5, 6, 7, 8, 10};
		
		ArrayClass.sort(arr);
		assertArrayEquals(arrs, arr);
		
		assertEquals(1, ArrayClass.min(arr));		
		assertEquals(10, ArrayClass.max(arr));
	}
	
	@Test
	public void test100() {
		int[] arr = {6, 3, 5, 10, 2, 7, 1, 8};
		
		ArrayClass.sort(arr);
		for (int i = 0; i < arr.length - 1; i++)
			assertTrue(arr[i] <= arr[i + 1]);
		
		assertEquals(arr[0], ArrayClass.min(arr));
		assertEquals(arr[1], ArrayClass.max(arr));
	}

	//case #1
	@test
	public void testCase1(){
		int[] arr = {5, 9, 19, 54, 458, 894};
		assertTrue(ArrayClass.search(arr, 7));
	}

	//case #2
	@test
	public void testCase2(){
		int[] arr = {5, 9, 19, 54, 458, 894};
		int expected_index = 1;
		assertTrue(ArrayClass.search(arr, 9));
	}

}
