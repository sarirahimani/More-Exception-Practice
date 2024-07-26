package exp;
import java.util.Scanner;
import java.io.*;
public class files {
	public static void main(String[] args) throws IOException  {

	
			Scanner fileInput=new Scanner(new File("input.txt"));
			PrintWriter fileOutput=new PrintWriter("output.txt");
	
		
		while(fileInput.hasNextLine()) {
			String s=fileInput.nextLine();
			fileOutput.println(s);
			fileInput.nextLine();
		}
		
		
		fileInput.close();
		fileOutput.close();
		
		
	}

}
