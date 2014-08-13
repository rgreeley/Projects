import java.util.Scanner;

public class CountingFor
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "Type in a message, and I'll display it ten times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		// removing n=1 gets rid of the variable for the message// Removing n = n+1 makes it so that the message does not continue to print. 
		for ( int n = 2 ; n <= 20; n = n+2)
		{
			System.out.println( n + ". " + message );
		}
	}
}		