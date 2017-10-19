import java.util.Scanner;

public class Betting
	{
		public static Scanner userInput = new Scanner(System.in);
		public static int playerBet;
		public static int playerMoney = 100;
		public static int pot;
		public static int compMoney = 100;
		public static int compBet;
		

		public static void playerBetting()
			{
				System.out.println("You have $" + Betting.playerMoney + "; how much would you like to bet on your hand? If you would like to fold, type 0.");
				playerBet = userInput.nextInt();
				if (playerBet == 0)
					{
						System.out.println("All right!");
						HandValueComparisons.doYouWantToPlayAgain();
					}
				else if (playerBet < compBet)
					{
						System.out.println("Sorry, that is less than the computer has bet. Please bet more.");
						playerBetting();
					}
				else if (playerBet <= 0)
					{
						System.out.println("Sorry, this is not a valid input...");
						playerBetting();
					} else if (playerBet > playerMoney)
					{
						System.out.println("Sorry, this is more money than you have!");
						playerBetting();
					} else if (playerBet < Betting.playerMoney)
					{
						System.out.println("All right! You bet $" + playerBet + ".");
					} else
					{
						System.out.println("Error...");
						playerBetting();
					}
			}

		public static void compBetting()
			{
				if (HandValueAssignments.hand2Value >= 7)
					{
						compBet = 40;
					}
				else if (HandValueAssignments.hand2Value >= 4)
					{
						compBet = 28;
					}
				else if (HandValueAssignments.hand2Value > 2)
					{
						compBet = 17;
					}
				else if (HandValueAssignments.hand2Value > 0)
					{
						compBet = 10;
					} else
					{
						compBet = 5;
					}
				
				boolean compStillBetting = true;
				while (compStillBetting)
					{
						if (compBet > 70 && HandValueAssignments.hand2Value >= 7)
							{
								System.out.println("The computer folded. You win!");
								pot = playerBet + compBet;
								playerMoney = playerMoney + pot;
								compStillBetting = false;
							}
						else if (compBet > 40 && HandValueAssignments.hand2Value >= 4)
							{
								System.out.println("The computer folded. You win!");
								pot = playerBet + compBet;
								playerMoney = playerMoney + pot;
								compStillBetting = false;
							}
						else if (compBet > 27 && HandValueAssignments.hand2Value > 2)
							{
								System.out.println("The computer folded. You win!");
								playerMoney = playerMoney + pot;
								compStillBetting = false;
							}
						else if (compBet > 15 && HandValueAssignments.hand2Value > 0)
							{
								System.out.println("The computer folded. You win!");
								playerMoney = playerMoney + pot;
								compStillBetting = false;
							}

						else if (playerBet > compBet)
							{
								compBet = compBet + 1;
							} else if (playerBet == compBet)
							{
								compStillBetting = false;
							}
						System.out.println("The computer bet $" + compBet + ".");
						System.out.println("");
					}
			}

		public static void calculatePot()
		{
			pot = compBet + playerBet;
			System.out.println("The pot is $" + pot + ".");
		}
	}