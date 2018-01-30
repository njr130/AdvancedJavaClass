import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Recipe{
	Scanner scan = new Scanner(System.in);
	FileWriter fw;
	private String file;
	
	
	public void RecipeName() throws IOException {
		System.out.print("Enter your recipe's name: ");
		file = scan.nextLine();
		fw = new FileWriter(file+".txt");
	}
	
	public void Ingredients() throws IOException {
		fw.write("Ingredients:\r\n");
		System.out.println("What are the ingredient(s)?(enter a blank line if done)");
		String ingredient=scan.nextLine();
		while (!ingredient.equals("")) {
			fw.write(ingredient+"\r\n");;
			ingredient=scan.nextLine();
		}
	}
	
	public void Steps() throws IOException {
		fw.write("\r\nCooking Steps: \r\n");
		System.out.println("What are the steps to cook the recipe?(enter a blank line if done)");
		String step = scan.nextLine();
		int counter = 1;
		while (!step.equals("")) {
			fw.write(counter+". "+step+"\r\n");
			step=scan.nextLine();
			counter++;
		}
		fw.close();
	}
}
