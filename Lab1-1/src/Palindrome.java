import java.util.Scanner;

public class Palindrome {
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		word = scan.nextLine();
		//System.out.println(word);
	}
	
	public void check() {
		String word2="";
		for (int n = word.length()-1; n>=0;n--) {
			word2=word2 + word.charAt(n);
		}
		System.out.println(word2);
		
		int n = 0;
		while(n<word.length()) {
			if (n==word.length()-1 && word.charAt(n)==word2.charAt(n)) {
				System.out.println("Your string is a palindrome.");
				break;
			} else if (word.charAt(n)==word2.charAt(n)) {
				n++;
			} else {
				System.out.println("Your string is not a palindrome.");
				break;
			}
		}
	}
	
	
	
}
