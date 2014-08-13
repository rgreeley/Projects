import java.util.Scanner;

public class CountingByHalves
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println( "x" );
		System.out.println( "--------" );
		double number = -10;
		
		for ( ; number <= 10 ; number = number + 0.5 )
		{
			System.out.print( number + " " );
		}
		
	}
}		