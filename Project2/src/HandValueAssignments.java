import java.util.ArrayList;

public class HandValueAssignments
	{
		static int hand1Value = 0;
		static int hand2Value = 0;
		static boolean colorIsTheSame;
		static boolean numbersAreConsecutive;

		// nothing = 0 (high card)
		// pair = 1 (two of the same rank)
		// two pair = 2 (two of the same rank, and two of another rank)
		// three of a kind = 3 (three of the same rank)
		// straight = 4 (5 consecutive cards)
		// flush = 5 (5 cards of the same suit)
		// full house = 6 (three of a kind and a pair)
		// four of a kind = 7 (four of the same card)
		// straight flush = 8 (any numbers in a row, and same suit)
		// royal flush = 9 (10, J, Q, K, A)

		public static void checkIfColorIsTheSameHand1()
			{
				colorIsTheSame = false;
				if (Hand.hand1.get(0).getColor().equals("black") && Hand.hand1.get(1).getColor().equals("black")
						&& Hand.hand1.get(2).getColor().equals("black") && Hand.hand1.get(3).getColor().equals("black")
						&& Hand.hand1.get(4).getColor().equals("black"))
					{
						colorIsTheSame = true;
					}
				if (Hand.hand1.get(0).getColor().equals("red") && Hand.hand1.get(1).getColor().equals("red")
						&& Hand.hand1.get(2).getColor().equals("red") && Hand.hand1.get(3).getColor().equals("red")
						&& Hand.hand1.get(4).getColor().equals("red"))
					{
						colorIsTheSame = true;
					} else
					{
						colorIsTheSame = false;
					}
			}

		public static void checkIfColorIsTheSameHand2()
			{
				colorIsTheSame = false;
				if (Hand.hand2.get(0).getColor().equals("black") && Hand.hand2.get(1).getColor().equals("black")
						&& Hand.hand2.get(2).getColor().equals("black") && Hand.hand2.get(3).getColor().equals("black")
						&& Hand.hand2.get(4).getColor().equals("black"))
					{
						colorIsTheSame = true;
					}
				if (Hand.hand2.get(0).getColor().equals("red") && Hand.hand2.get(1).getColor().equals("red")
						&& Hand.hand2.get(2).getColor().equals("red") && Hand.hand2.get(3).getColor().equals("red")
						&& Hand.hand2.get(4).getColor().equals("red"))
					{
						colorIsTheSame = true;
					} else
					{
						colorIsTheSame = false;
					}
			}

		public static void checkIfNumbersAreConsecutiveHand1()
			{
				int[] counter = new int[5];
				for (int i = 2; i < 8; i++)
					{
						counter[0] = i;
						counter[1] = i + 1;
						counter[2] = i + 2;
						counter[3] = i + 3;
						counter[4] = i + 4;
						if (Hand.hand1.get(0).getCardValue() == counter[0]
								&& Hand.hand1.get(1).getCardValue() == counter[1]
								&& Hand.hand1.get(2).getCardValue() == counter[2]
								&& Hand.hand1.get(3).getCardValue() == counter[3]
								&& Hand.hand1.get(4).getCardValue() == counter[4])
							{
								numbersAreConsecutive = true;
							}
					}
			}

		public static void checkIfNumbersAreConsecutiveHand2()
			{
				int[] counter = new int[5];
				for (int i = 2; i < 14; i++)
					{
						counter[0] = i;
						counter[1] = i + 1;
						counter[2] = i + 2;
						counter[3] = i + 3;
						counter[4] = i + 4;

						if (Hand.hand2.get(0).getCardValue() == counter[0]
								&& Hand.hand2.get(1).getCardValue() == counter[1]
								&& Hand.hand2.get(2).getCardValue() == counter[2]
								&& Hand.hand2.get(3).getCardValue() == counter[3]
								&& Hand.hand2.get(4).getCardValue() == counter[4])
							{
								numbersAreConsecutive = true;
							} else
							{
								numbersAreConsecutive = false;
							}
					}
			}

		public static void checkRoyalFlushHand1()
			{
				checkIfColorIsTheSameHand1();
					{
						boolean numbersAreCorrect = false;
						if (Hand.hand1.get(0).getCardValue() == 10 && Hand.hand1.get(1).getCardValue() == 11
								&& Hand.hand1.get(2).getCardValue() == 12 && Hand.hand1.get(3).getCardValue() == 13
								&& Hand.hand1.get(4).getCardValue() == 14)
							{
								numbersAreCorrect = true;
							} else
							{
								numbersAreCorrect = false;
							}

						if (colorIsTheSame && numbersAreCorrect)
							{
								hand1Value = 9;
							}
					}
			}

		public static void checkRoyalFlushHand2()
			{
				checkIfColorIsTheSameHand2();

					{
						boolean numbersAreCorrect = false;
						if (Hand.hand2.get(0).getCardValue() == 10 && Hand.hand2.get(1).getCardValue() == 11
								&& Hand.hand2.get(2).getCardValue() == 12 && Hand.hand2.get(3).getCardValue() == 13
								&& Hand.hand2.get(4).getCardValue() == 14)
							{
								numbersAreCorrect = true;
							} else
							{
								numbersAreCorrect = false;
							}

						if (colorIsTheSame && numbersAreCorrect)
							{
								hand2Value = 9;
							}
					}
			}

		public static void checkStraightFlushHand1()
			{
				checkIfColorIsTheSameHand1();
				checkIfNumbersAreConsecutiveHand1();
				if (colorIsTheSame && numbersAreConsecutive)
					{
						hand1Value = 8;
					}
			}

		public static void checkStraightFlushHand2()
			{
				checkIfColorIsTheSameHand2();
				checkIfNumbersAreConsecutiveHand2();
				if (colorIsTheSame && numbersAreConsecutive)
					{
						hand2Value = 8;
					}
			}

		public static void checkFourOfAKindHand1()
			{

			}

		public static void checkFullHouseHand1()
			{

			}

		public static void checkFlushHand1()
			{
				checkIfColorIsTheSameHand1();
				if (colorIsTheSame)
					{
						hand1Value = 5;
					}
			}

		public static void checkFlushHand2()
			{
				checkIfColorIsTheSameHand2();
				if (colorIsTheSame)
					{
						hand2Value = 5;
					}
			}

		public static void checkStraightHand1()
			{
				checkIfNumbersAreConsecutiveHand1();
				if (numbersAreConsecutive)
					{
						hand1Value = 4;
					}
			}

		public static void checkStraightHand2()
			{
				checkIfNumbersAreConsecutiveHand2();
				if (numbersAreConsecutive)
					{
						hand2Value = 4;
					}
			}

		public static void checkThreeOfAKindHand1()
			{

			}

		public static void checkTwoPairHand1()
			{

			}

		public static void checkPairHand1()
			{
				
			}

		public static void checkNothingHand1()
			{

			}
	}