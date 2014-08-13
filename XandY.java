import java.util.Scanner;

public class XandY
{
	public static void main( String[] args )
	{
		
		
		System.out.println( "x\ty" );
		System.out.println( "--------" );
		double root;
		
		for ( double number = -10.0; number <= 10; number += 0.5 )
		{
			root = (number * number);
			System.out.println( number + " " + root );
		}
		
	}
}		