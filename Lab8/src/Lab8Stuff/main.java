package Lab8Stuff;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JUnitLab test = new JUnitLab();
	/*	int[] x = {1,2,3,4};
		
		System.out.println(test.addInts(4, 5));
		System.out.println(test.addStrings("Hello ", "world!"));
		System.out.println(test.findLen("This is a string"));
		System.out.println(test.divXByY(4, 2));
		System.out.println(test.divXByY(4, 0));
		int[] f= test.reversIntArray(x);
		for(int i = 0; i<f.length;i++) {
			System.out.print(f[i]);
		}
		int[] y = {4,3,2,1};
		System.out.println(Arrays.equals(f,y));*/
		
		//int[] a = test.range(72);
		//int[] a = test.range(5,20);
		int[] a = test.range(-10,100,10);
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
