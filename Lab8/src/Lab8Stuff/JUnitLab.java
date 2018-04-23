package Lab8Stuff;

public class JUnitLab {
	public int addInts(int x, int y) {
		return x+y;
	}
	
	public String addStrings(String x, String y) {
		String result = x+y;
		return result;
	}
	
	public int findLen(String x) {
		return x.length();
	}
	
	public Object divXByY(int x, int y) {
		if (y==0) {
			return null;
		} else {
			return x/y;
		}
	}
	
	public int[] reversIntArray(int[] x) {
		int[] result = new int[x.length];
		int f = 0;
		for (int i = x.length-1; i>=0;i--) {
			result[i]=x[f];
			f++;
		}
		return result;
	}
	
	public int[] range(int x) {
		int[] result = new int[x-1];
		for (int i = 1; i<x;i++) {
			result[i-1]=i;
		}
		
		return result;
	}
	
	public int[] range(int x, int y) {
		int[] result = new int[y-x];
		int i =0;
		for (int f=x; f<y ; f++) {
			result[i]=f;
			i++;
		}
		return result;
	}
	
	public int[] range(int x, int y, int z) {
		int k;
		if ((y-x)%z==0) {
			k=0;
		}else {
			k=1;
		}
		int[] result=new int[(y-x)/z +k];
		int i = 0;
		for (int f=x;f<y;f+=z) {
			result[i]=f;
			i++;
		}
		return result;
	}
}
