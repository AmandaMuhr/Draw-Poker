import java.util.Scanner;

public class HandValueComparisons
	{
		public static boolean notKeepPlaying;
		
		public static void handValueComparisons()
			{
				
				if (HandValueAssignments.hand1Value > HandValueAssignments.hand2Value)
					{
						System.out.println("");
						System.out.println("You win!");
						Betting.playerMoney = Betting.playerMoney + Betting.pot;
						System.out.println("You now have $" + Betting.playerMoney + ".");
						doYouWantToPlayAgain();
					} else if (HandValueAssignments.hand2Value > HandValueAssignments.hand1Value)
					{
						System.out.println("");
						System.out.println("Sorry, the computer wins!");
						System.out.println("You now have $" + Betting.playerMoney + ".");
						doYouWantToPlayAgain();
					} else if (HandValueAssignments.hand2Value == HandValueAssignments.hand1Value)
					{
						if (HandValueAssignments.valueOfHighestCardHand1 > HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("You win!");
								Betting.playerMoney = Betting.playerMoney + Betting.pot;
								System.out.println("You now have $" + Betting.playerMoney + ".");
								doYouWantToPlayAgain();
							} else if (HandValueAssignments.valueOfHighestCardHand1 < HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("Sorry, the computer wins!");
								System.out.println("You now have $" + Betting.playerMoney + ".");
								doYouWantToPlayAgain();
							} else if (HandValueAssignments.valueOfHighestCardHand1 == HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("It's a tie! (As far of the computer can tell, anyway)");
								System.out
										.println("I'm sorry, you don't gain or lose any money in this game. You have $"
												+ Betting.playerMoney + " left.");
								doYouWantToPlayAgain();
							} else
							{
								System.out.println("Error1...");
							}
					} else
					{
						System.out.println("Error2...");
					}
				
				System.out.println("Here is the computer's hand:");
				DisplayDeck.displayHand2();
			}

		public static void doYouWantToPlayAgain()
			{
//				Hand.hand1.clear();
//				Hand.hand2.clear();
				System.out.println("");
				System.out.println("See you later!");
//				System.out.println("Would you like to keep playing?");
//				System.out.println("1. Yes");
//				System.out.println("2. No");
//				Scanner userInput = new Scanner(System.in);
//				int choice = userInput.nextInt();
//
//				if (choice == 1)
//					{
//						System.out.println("All right, let's keep playing!");
//						Hand.hand1.clear();
//						Hand.hand2.clear();
//						CardDealer.stillPlayingPart1 = true;
//						notKeepPlaying = false;
//					} else if (choice == 2)
//					{
//						System.out.println("All right, see you next time!");
//						CardDealer.stillPlayingPart1 = false;
//						notKeepPlaying = true;
//						System.exit(0);
//					} else
//					{
//						System.out.println("Sorry, this is not a valid input...");
//						doYouWantToPlayAgain();
//					}
			}
	}