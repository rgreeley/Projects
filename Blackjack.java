import java.util.Scanner;
import java.util.Random;
		
		public class Blackjack
		{
			public static void main( String[] args )
			{

				Random r = new Random();
				Scanner keyboard = new Scanner(System.in);

				String userName, dealerName, playAgain, choice;

						System.out.println( "Time to play some BLACKJACK!!!\n" );
						System.out.print( "May I ask who will be playing with us this fine day?\n" );
						userName = keyboard.next();
				
						System.out.println( "Well hello " + userName + ". This is Robert he will be your dealer, but a high roller such as yourself may call him whatever you like." );
						System.out.print( "What will his name be tonight?\n" );
						dealerName = keyboard.next();
						
						System.out.println( "So we have our player " + userName + " playing our dealer " + dealerName + ".\n" );
						System.out.println( "Let's get this party started!!!\n" );
						
				int userCard1, userCard2, dealerCard1, dealerCard2, userHand, dealerHand, newCard;
				int bank = 200, bet;

					do
					{

						System.out.println( "Now it is time to place your bet " + userName + ", what will it be?" );
						System.out.println( "Your current funds are " + bank + "." );
					
					do
					{

						System.out.print( "What would you like to bet? (Min: $1 Max: $200)? " );

						bet = keyboard.nextInt();

							if ( bet < 1 || bet > 100 || bet > bank || bet % 1 != 0)
								System.out.println( "You cannot bet $" + bet + ". Please try again." );
					}	 
							while ( bet < 1 || bet > 100 || bet > bank || bet % 1 != 0);
					
				userCard1 = 2 + r.nextInt(10); userCard2 = 2 + r.nextInt(10); userHand = userCard1 + userCard2;
				dealerCard1 = 2 + r.nextInt(10); dealerCard2 = 2 + r.nextInt(10); dealerHand = dealerCard1 + dealerCard2;

				System.out.println( "\nSo, " + userName + " here is your hand, " + userCard1 + " and " + userCard2 + "." );
				System.out.println( "Your hands total is " + userHand + ".\n" );
				System.out.println( dealerName + "'s hand is " + dealerCard1 + " but he is only showing the one card." );

					do
					{
						System.out.print( "Time to make a choice: \"hit\" or \"stay\"? " );
						choice = keyboard.next();
						
							if ( choice.equals("hit") )
							{

								newCard = 2 + r.nextInt(10);
								System.out.println( "Here is your new card " + newCard + "." );
							
								userHand += newCard;
								System.out.println( "Your new hand is " + userHand + ".\n" );
							}
							
					}while ( userHand <= 21 && (! choice.equals("stay") ) );

							if ( userHand <= 21 )
							{

								System.out.println( "It is now time for " + dealerName + " to you what hes got." );
								System.out.println( dealerName + "'s second card is " + dealerCard2 + "." );
								System.out.println( dealerName +"'s hand is now at " + dealerHand + ".\n" );
			
					do
					{
							if ( dealerHand < 16 )
							{
								choice = "hit";
									System.out.println( dealerName + " hits!" );

								newCard = 2 + r.nextInt(10);
									System.out.println( dealerName + "'s new card is " + newCard + "." );

								dealerHand += newCard;
									System.out.println( dealerName +"'s new hand is " + dealerHand + ".\n" );
							}
						
							else
							{
								choice = "stay";
									System.out.println( dealerName + " will stay\n" );
							}	
							
					} while ( dealerHand <= 21 && (! choice.equals("stay") ) );
					
							}

								System.out.println( dealerName + " hand is " + dealerHand + "." );
								System.out.println( "Your hand is " + userHand + ".\n" );

							
						
								if ( userHand > 21 )
								{
									System.out.println( "Looks like this one is a bust. Sorry my friend." );
									bank -= bet;
								}
								else if ( userHand > dealerHand )
								{
									System.out.println ( "Good go!!! You win!!!" );
									bank += bet;
								}
								 else if ( dealerHand > 21)
								{
									System.out.println( "Looks like " + dealerName + " has busted!!! YOU WIN!!!" );
									bank += bet;
								}
								else if ( userHand == dealerHand )
								{
									System.out.println( "It's a draw." );
									System.out.println( "Good thing we always side on the player!!!");
									bank += bet;
								}
								else if ( dealerHand <= 21 )
								{
									System.out.println( "Sorry my friend. Looks like its not your night." );
									bank -= bet;
								}
								else if ( userHand <= 21 )
								{
									System.out.println( "And we have ourselves a winner!!!!" );
									bank += bet;
								}
								
									if ( bank <= 0 )
								{

									System.out.println( "\nSorry my friend but you are all out of cash: " + bank + ". We will see you next time." );
									break;
								}
									System.out.println ("Your current funds are at " + bank + "." );
									System.out.print( "Want another go??? (yay or nay)? " );
									playAgain = keyboard.next();
								
						}while (! playAgain.equals("nay") );
							System.out.println("Guess we will see you next time!" );
			}
}