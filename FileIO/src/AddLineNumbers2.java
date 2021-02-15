import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AddLineNumbers2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		FileInputStream fis = null;
		Scanner inFS = null;
		String inputFileName;
		File outFile = null;
		FileOutputStream fos = null;
		PrintWriter outFS = null;
		String outputFileName;
		int lineNumber = 0;
		String text;

		try {
			System.out.println("Enter input file name: ");
			inputFileName = scnr.nextLine();
			fis = new FileInputStream(inputFileName);
			inFS = new Scanner(fis);
			
			System.out.println("Enter output file name: ");
			outputFileName = scnr.nextLine();
			outFile = new File(outputFileName);
			if (outFile.exists()) {
				throw new FileWouldBeDestroyedException(outputFileName);
			}
			fos = new FileOutputStream(outFile);
			outFS = new PrintWriter(fos);
	
			while (inFS.hasNextLine()) {
				text = inFS.nextLine();
				lineNumber++;
				outFS.printf("%4d: %s\n", lineNumber, text);
			}
	
			System.out.println("Add numbers to " + lineNumber + " lines");
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception: " + e.getMessage());
		} catch (FileWouldBeDestroyedException e) {
			System.out.println("File exists and would be destroyed: " + e.getMessage());
		} finally {
			if (inFS != null) {
				inFS.close();
			}
			if (outFS != null) {
				outFS.close();
			}
		}
	}
}
