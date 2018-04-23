package Lab8Stuff;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class JUnitLabTests {
	
	@Test
	public void AddIntsTest() {
		JUnitLab j = new JUnitLab();
		int x = 1;
		int y = 2;
		int expect = 3;
		int actual = j.addInts(x, y);
		assertEquals(expect, actual);
	}
	
	@Test
	public void AddIntsTestFail() {
		JUnitLab j = new JUnitLab();
		int x = 1;
		int y = 2;
		int expect = 4;
		int actual = j.addInts(x,y);
		assertFalse(actual==expect);
	}
	
	@Test
	public void AddIntsTestNegatives() {
		JUnitLab j = new JUnitLab();
		int x= -1;
		int y=-2;
		int expect = -3;
		int actual = j.addInts(x, y);
		assertEquals(expect,actual);
	}
	
	@Test
	public void AddIntsTestOverflow() {
		JUnitLab j = new JUnitLab();
		int x = 1;
		int y = 2147483647;
		int max = 2147483647;
		int actual = j.addInts(x, y);
		assertFalse(max<actual);
	}
	
	@Test
	public void AddStringsTest() {
		JUnitLab j = new JUnitLab();
		String x = "hello ";
		String y = "world";
		String expect ="hello world";
		String actual = j.addStrings(x, y);
		assertEquals(expect,actual);
	}
	
	@Test
	public void AddStringsTestFail() {
		JUnitLab j = new JUnitLab();
		String x = "hello ";
		String y = "world";
		String expect ="helloworld";
		String actual = j.addStrings(x, y);
		assertFalse(expect==actual);
	}
	
	@Test
	public void AddStringsTestLength() {
		JUnitLab j = new JUnitLab();
		String x = "hello ";
		String y = "world";
		String expect ="hello world";
		String actual = j.addStrings(x, y);
		assertEquals(x.length()+y.length(),actual.length());
	}
	
	@Test
	public void findLenTest() {
		JUnitLab j = new JUnitLab();
		String x = "This is a string";
		int y = 16;
		int z = j.findLen(x);
		assertEquals(y,z);
	}
	
	@Test
	public void findLenTestFail() {
		JUnitLab j = new JUnitLab();
		String x = "This is a String";
		int y=10;
		int z=j.findLen(x);
		assertFalse(y==z);
	}
	
	@Test
	public void findLenTestEmptyString() {
		JUnitLab j = new JUnitLab();
		String x = "";
		int y=0;
		int z=j.findLen(x);
		assertEquals(y,z);
	}
	
	@Test
	public void DivideTest() {
		JUnitLab j = new JUnitLab();
		int x = 4;
		int y = 2;
		int expect = 2;
		int actual = (int) j.divXByY(x, y);
		assertEquals(expect,actual);
	}
	
	@Test
	public void DivideTestFail() {
		JUnitLab j = new JUnitLab();
		int x = 4;
		int y = 2;
		int expect = 3;
		int actual = (int) j.divXByY(x, y);
		assertFalse(expect==actual);
	}
	
	/*@Test
	public void DivideTestNullReturn() {
		JUnitLab j = new JUnitLab();
		int x = 4;
		int y = 0;
		int actual = (int) j.divXByY(x, y);
		assertEquals(null,actual);
	}*/
	
	@Test
	public void DivideTestReturnType() {
		JUnitLab j = new JUnitLab();
		int x = 4;
		int y = 2;
		int z = (int)j.divXByY(x, y);
		
	}
	
	@Test
	public void reverseArrayTest() {
		JUnitLab j = new JUnitLab();
		int[] x = {1,2,3,4};
		int[] expect = {4,3,2,1};
		int[] actual = j.reversIntArray(x);
		assertArrayEquals(expect,actual);
	}
	
	@Test
	public void reverseArrayTestFail() {
		JUnitLab j = new JUnitLab();
		int[] x = {1,2,3,4};
		int[] expect = {4,2,3,1};
		int[] actual = j.reversIntArray(x);
		assertFalse(expect==actual);
	}
	
	@Test
	public void reverseArrayTestSums() {
		JUnitLab j = new JUnitLab();
		int[] x = {1,2,3,4};
		int[] actual = j.reversIntArray(x);
		int sum1=0;
		int sum2=0;
		for (int i =0; i<x.length;i++) {
			sum1+=x[i];
			sum2+=actual[i];
		}
		assertEquals(sum1,sum2);
	}
	
	@Test
	public void rangeTest1Arg() {
		JUnitLab j = new JUnitLab();
		int[] actual = j.range(5);
		int[] expect = {1,2,3,4};
		assertArrayEquals(expect,actual);
	}
	
	@Test
	public void rangeTest2Arg() {
		JUnitLab j = new JUnitLab();
		int[] actual = j.range(1,5);
		int[] expect = {1,2,3,4};
		assertArrayEquals(expect,actual);
	}
	
	@Test
	public void rangeTest3Arg() {
		JUnitLab j = new JUnitLab();
		int[] actual = j.range(1,10,2);
		int[] expect = {1,3,5,7,9};
		assertArrayEquals(expect,actual);
	}
	
	@Test
	public void rangeTest1ArgFail() {
		JUnitLab j = new JUnitLab();
		int[] actual = j.range(5);
		int[] expect = {1,2,3,4,5};
		assertFalse(Arrays.equals(actual,expect));
	}
	
	@Test
	public void rangeTest2ArgFail() {
		JUnitLab j = new JUnitLab();
		int[] actual = j.range(2,5);
		int[] expect = {2,3,4,5};
		assertFalse(Arrays.equals(actual,expect));
	}
	
	@Test
	public void rangeTest3ArgFail() {
		JUnitLab j = new JUnitLab();
		int[] actual = j.range(1,10,2);
		int[] expect = {1,3,5,7,9,11};
		assertFalse(Arrays.equals(actual,expect));
	}
}
