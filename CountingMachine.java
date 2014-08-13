import java.util.Scanner;

public class CountingMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count to: " );
		int given = keyboard.nextInt(), number = 0;
		
	 
		for ( ; number <= given; number++ )
		{
			System.out.print( number + " " );
		}
		
	}
}		