import java.util.Scanner;

public class StringCheck {
	private Scanner scan = new Scanner(System.in);
	private String input;
	
	public void setInput() {
		System.out.print("Enter some text input: ");
		input = scan.nextLine();
	}
	
	public void CheckJava() {
		String lastCharacter = Character.toString(input.charAt(input.length()-1));
		if (lastCharacter.equals(";")){
			System.out.println("Unsafe");
		} else {
			System.out.println("Safe");
			System.out.println(input.charAt(input.length()-1));
		}
	}
	
	public void CheckQuotes() {
		for()
	}
	
	
	
}
