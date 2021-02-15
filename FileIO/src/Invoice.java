import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This programs must:
 * 
 *     1. Read from order.txt and write to invoice.txt.
 *     2. Write a header to the output file.
 *     3. For each line of the input file:
 *        a. Read the quantity, price, and description.
 *        b. Compute the extension (quantity * price)
 *        c. Format and write these values to the output file using printf.
 *        d. Keep track of the running total.
 *     4. After all lines have been processed, write the total to the file using printf.
 *
 * Refer to AddLineNumbers.java and Reviews.java for pieces needed to develop this program.
 * 
 * Do not assume that the input file has a certain number of lines. Your program must
 * continue reading until the end of the input file is reached.
 * 
 * Before starting, look at invoice_example.txt to see how the invoice.txt file you are going
 * to create must be formatted.
 * 
 * The first time you run this program, invoice.txt is not going to appear automatically
 * in Eclipse. To see the file, right-click on the FileIO project and choose Refresh.
 */

public class Invoice {
	public static void main(String[] args) throws IOException {
		// YOU MUST USE THESE EXACT FILENAMES! Do not change them or your program
		// will not run correctly for grading.
		String inputFileName = "order.txt";
		String outputFileName = "invoice.txt";
		
		// Insert your logic here
		
	}
}
