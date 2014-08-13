import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Count from: " );
		int from = keyboard.nextInt();
		
		System.out.print( "Count to: " );
		int to = keyboard.nextInt();
		
		System.out.print( "Count by: " );
		int by = keyboard.nextInt();
		
	 
		for ( ; from <= to ; from = from + by )
		{
			System.out.print( from + " " );
		}
		
	}
}		