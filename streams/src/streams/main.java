package streams;

import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("Example.txt");
		fw.write("First line of the text file.");
		fw.write("\r\n");
		fw.write("Second line of the text file.");
		fw.write("\r\n");
		fw.close();
	}

}
