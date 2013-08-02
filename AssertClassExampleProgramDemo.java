import java.util.Scanner;


public class AssertClassExampleProgramDemo {

	/**
	 * @param args
	 */
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a number between 0 and 10: " );
		int number = input.nextInt();
		// Assert to check if entered number is between range
		assert ( number >= 0 && number <= 10 ) : "bad number: " + number;
		System.out.println( "You entered: "+number );
	} 
}