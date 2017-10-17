
public class HandValueComparisons
	{
		public static void handValueComparisons()
			{
				
				if (HandValueAssignments.hand1Value > HandValueAssignments.hand2Value)
					{
						System.out.println("");
						System.out.println("Player 1 wins!");
					}
				else if (HandValueAssignments.hand2Value > HandValueAssignments.hand1Value)
					{
						System.out.println("");
						System.out.println("Player 2 wins!");
					}
				else if (HandValueAssignments.hand2Value == HandValueAssignments.hand1Value)
					{
						if (HandValueAssignments.valueOfHighestCardHand1 > HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("Player 1 wins!");
							}
						else if (HandValueAssignments.valueOfHighestCardHand1 < HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("Player 2 wins!");
							}
						else if (HandValueAssignments.valueOfHighestCardHand1 == HandValueAssignments.valueOfHighestCardHand2)
							{
								System.out.println("");
								System.out.println("It's a tie! (As far of the computer can tell, anyway)");
							}
						else
							{
								System.out.println("Error1...");
							}
					}
				else
					{
						System.out.println("Error2...");
					}
			}
	}