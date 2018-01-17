import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int line = 1;
		Scanner file = new Scanner(new File("text.txt"));
		while(file.hasNextLine()){
			System.out.println(Integer.toString(line)+" "+file.nextLine());
			line++;
		}
		file.close();
	}

}
