import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddLineNumbers {
	public static void main(String[] args) throws IOException {
		String inputFileName = "original.txt";
		String outputFileName = "numbered.txt";
		FileInputStream fis = null;
		Scanner inFS = null;
		FileOutputStream fos = null;
		PrintWriter outFS = null;
		int lineNumber = 0;
		String text;

		System.out.println("Opening input file: " + inputFileName);
		fis = new FileInputStream(inputFileName);
		inFS = new Scanner(fis);
		
		System.out.println("Opening output file: " + outputFileName);
		fos = new FileOutputStream(outputFileName);
		outFS = new PrintWriter(fos);

		while (inFS.hasNextLine()) {
			text = inFS.nextLine();
			lineNumber++;
			outFS.println(lineNumber + ": " + text);
		}

		System.out.println("Add numbers to " + lineNumber + " lines");
		
		// When you are done using a Scanner or PrintWriter, you should always close them.
		// This is crucial for a PrintWriter to ensure all data is saved to disk.
		inFS.close();
		outFS.close();
	}
}
