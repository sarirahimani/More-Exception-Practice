package exp;
import java.util.Scanner;
import java.io.*;

public class practica {


		public static void main(String[] args) {
			
			Scanner keyboard=new Scanner(System.in);
			String nameIn="";
			String nameOut="";
			Scanner fileIn=null;
			PrintWriter fileOut=null;
			double num1=0;
			double sum=0;
			double avg=0;
			
			
			try {
				System.out.print("Enter the name of the input file:");
				nameIn=keyboard.nextLine();
				fileIn=new Scanner(new File(nameIn));
				
		
				
			}catch(FileNotFoundException e) {
				System.out.println("File not found");
			}
			try {
				System.out.print("Enter the name of the output file:");
				nameOut=keyboard.nextLine();
				fileOut=new PrintWriter(new File(nameOut));
				
			}catch(IOException ex) {
				System.out.println("File not found");
			}
			
	try {
			while(fileIn.hasNextLine()) {
				String numbers=fileIn.nextLine();
				String numArr[]=numbers.split(":");
				sum=0;
				for(int i=0;i<2;i++) {
					num1=Double.parseDouble(numArr[i]);
					sum=sum+num1;
				}
				avg=sum/2.0;
				fileOut.println(sum+":"+avg);
				System.out.println(sum+":"+avg);
			}
			
	}catch(NumberFormatException a) {
		System.out.println( "Error converting numbers.");
		fileOut.println( "Error converting numbers.");
	}catch(ArrayIndexOutOfBoundsException lala) {
		System.out.println( "Missing column(s).");
		fileOut.println( "Missing column(s).");
	}finally {
			fileOut.close();
			fileIn.close();
			keyboard.close();
	}
		}

	}




	/*
	 
	Write a program that completes 
	the following tasks.
	 Collect an input filename and an output filename.
	   The input file contains lines 
	   with two double numbers per line
	    separated by a ‘:’.  
	    Write the sum and average of each line in the
	     input file to the output file.  
	     Use a Scanner to collect
	      the filenames from the user. 
	      Test your program using numbers.txt for input.

	Consider starting with the first input file (numbers.txt) as shown below:

	(input and output shown in Eclipse 
	- my output has tabs but they don't show up in here)

	Enter input file name: numbers.txt
	Enter output file name: sum.txt
	Processing complete.


	After completion, my program produces sum.txt with contents:


	27.52 13.76
	0.48 0.24
	-17.299999999999997 -8.649999999999999
	29.4 14.7
	2047.9 1023.95
	0.0011 5.5E-4
	6.57 3.285
	24.660000000000004 12.330000000000002
	111.86099999999999 55.930499999999995
	768.0 384.0


	When you have the first file working properly,
	 modify your program to use exceptions to 
	 respond to values that are missing or that
	  cannot be converted to numbers 
	  by putting an appropriate message in the output file.
	    Use moreNumbers.txt to test. 
	     Here are the contents of my output.txt file:


	27.52 13.76
	0.48 0.24
	Error converting numbers.
	29.4 14.7
	2047.9 1023.95
	0.0011 5.5E-4
	6.57 3.285
	Missing column(s).
	111.86099999999999 55.930499999999995
	768.0 384.0

	***Note: In your program,
	* you'll request the filenames from the "user".
	*  As long as the user enters the right filenames, 
	*  they will be found within the project structure,
	*   as long as you don't move them anywhere.***
	 */



