
public class Fibonacci {
	private long num=0;
	private long num2=1;
	private long nextnum;
	
	public void calc(int n) {
		//if (n==0) {
			//System.out.println("0");
		//} else if (n==1 || n==2) {
			//System.out.println("1");
		//} else {
			for(int i = 0; i < n; i++) {
				nextnum = num+num2;
				num = num2;
				num2 = nextnum;
			}
			System.out.println(num);
		//}
	}
	
}
