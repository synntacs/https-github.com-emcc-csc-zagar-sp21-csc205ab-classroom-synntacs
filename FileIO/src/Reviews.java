import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Reviews {
	public static void main(String[] args) throws IOException {
		String inputFileName = "Trattoria_Reviews.txt";
		FileInputStream fis = null;
		Scanner inFS = null;
		String restaurantName;
		String userName;
		double userRating;

		// Try to open file
		System.out.println("Opening file " + inputFileName);
		fis = new FileInputStream(inputFileName);
		inFS = new Scanner(fis);

		restaurantName = inFS.nextLine();
		System.out.println("Reviews for " + restaurantName);
		System.out.println();
		System.out.println("User                 Rating");
		
		while (inFS.hasNext()) {
			userName = inFS.next();
			userRating = inFS.nextDouble();
			// The %-20s indicates that the string should be padded out
			// with spaces to occupy 20 characters with the - indicating
			// that it should be left-justified.
			
			// The %4.1f indicates that the double should be displayed
			// allowing 4 characters, 1 of which should be to the right
			// of the decimal point and that all 4 characters should be
			// right justified to make the decimal point line up.
			System.out.printf("%-20s %4.1f\n", userName, userRating);
		}

		inFS.close();
	}
}
