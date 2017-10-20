import java.util.ArrayList;
import java.util.Scanner;

public class HandValueAssignments
	{
		static int hand1Value = 0;
		static int hand2Value = 0;
		static boolean colorIsTheSame;
		static boolean numbersAreConsecutive;
		static int trueCount;
		static int valueOfHighestCardHand1;
		static int valueOfHighestCardHand2;

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

		public static void mainButNotReally()
			{
				// HAND 1
				findHighestCardHand1();
				checkPairAndThreeOfAKindHand1();
				//checkTwoPairHand1();
				checkStraightHand1();
				checkFlushHand1();
				checkFullHouseHand1();
				//checkFourOfAKindHand1();
				checkStraightFlushHand1();
				checkRoyalFlushHand1();
				
				System.out.println("Hand 1 Value: " + hand1Value);

				// HAND 2
				findHighestCardHand2();
				checkPairAndThreeOfAKindHand2();
				//checkTwoPairHand2();
				checkStraightHand2();
				checkFlushHand2();
				checkFullHouseHand2();
				//checkFourOfAKindHand2();
				checkStraightFlushHand2();
				checkRoyalFlushHand2();
				
				System.out.println("Hand 2 Value: " + hand2Value);
			}

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
						if (Hand.hand1.get(0).getCardValue() == 14 && Hand.hand1.get(1).getCardValue() == 13
								&& Hand.hand1.get(2).getCardValue() == 12 && Hand.hand1.get(3).getCardValue() == 11
								&& Hand.hand1.get(4).getCardValue() == 10)
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
						if (Hand.hand2.get(0).getCardValue() == 14 && Hand.hand2.get(1).getCardValue() == 13
								&& Hand.hand2.get(2).getCardValue() == 12 && Hand.hand2.get(3).getCardValue() == 11
								&& Hand.hand2.get(4).getCardValue() == 10)
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

//		public static void checkFourOfAKindHand1()
//			{
//				
//			}

		public static void checkFullHouseHand1()
			{
				//from http://www.cs.princeton.edu/courses/archive/spr15/cos126/docs/PokerHand.java.html
		        int rank1 = Hand.hand1.get(0).getCardValue();
		        int sumRank1 = 1;
		        int rank2 = Hand.hand1.get(4).getCardValue();
		        int sumRank2 = 1;
		        for (int i = 1; i < Hand.hand1.size() - 1; i++)
		        	{
		            if (Hand.hand1.get(i).getCardValue() == rank1)
		            	{
		            		sumRank1++;
		            	}
		            if (Hand.hand1.get(i).getCardValue() == rank2)
		            	{
		            		sumRank2++;
		            	}
		        }
		        
		        if (sumRank1 == 3 && sumRank2 == 2)
		        	{
		        		hand1Value = 6;
		        	}
		        if (sumRank1 == 2 && sumRank2 == 3)
		        	{
		        		hand1Value = 6;
		        	}
		        else
		        	{
		        		
		        	}
			}
		
		public static void checkFullHouseHand2()
			{
				//from http://www.cs.princeton.edu/courses/archive/spr15/cos126/docs/PokerHand.java.html
		        int rank1 = Hand.hand2.get(0).getCardValue();
		        int sumRank1 = 1;
		        int rank2 = Hand.hand2.get(4).getCardValue();
		        int sumRank2 = 1;
		        for (int i = 1; i < Hand.hand2.size() - 1; i++)
		        	{
		            if (Hand.hand2.get(i).getCardValue() == rank1)
		            	{
		            		sumRank1++;
		            	}
		            if (Hand.hand2.get(i).getCardValue() == rank2)
		            	{
		            		sumRank2++;
		            	}
		        }
		        
		        if (sumRank1 == 3 && sumRank2 == 2)
		        	{
		        		hand2Value = 6;
		        	}
		        if (sumRank1 == 2 && sumRank2 == 3)
		        	{
		        		hand2Value = 6;
		        	}
		        else
		        	{
		        		
		        	}
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

//		public static void checkTwoPairHand1()
//			{
//				
//			}

		public static void checkPairAndThreeOfAKindHand1()
			{
				trueCount = 0;
				for (int i = 0; i < Hand.hand1.size(); i++)
					{
						for (int a = 0; a < Hand.hand1.size(); a++)
							{
								if (Hand.hand1.get(i).getCardValue() == (Hand.hand1.get(a).getCardValue()))
									{
										trueCount++;
									} else
									{
										
									}
							}
					}
				trueCount = trueCount / 3;
				if (trueCount == 2)
					{
						hand1Value = 1;
					} else if (trueCount == 3)
					{
						hand1Value = 3;
					} else if (trueCount == 4)
					{
						System.out.println("The computer has detected either a two pair or four of a kind in your hand...");
						System.out.println(
								"Could you tell me which one it is? Please type 1 for two pair, and 2 for four of a kind.");
						Scanner userInput = new Scanner(System.in);
						int number = userInput.nextInt();
						if (number == 1)
							{
								hand1Value = 2;
							}
						else if (number == 2)
							{
								hand1Value = 7;
							}
						// four of a kind is 7, and two pair is 2
						// hand1Value = 0;
					} else
					{

					}
			}
		
		public static void checkPairAndThreeOfAKindHand2()
			{
				trueCount = 0;
				for (int i = 0; i < Hand.hand2.size(); i++)
					{
						for (int a = 0; a < Hand.hand2.size(); a++)
							{
								if (Hand.hand2.get(i).getCardValue() == (Hand.hand2.get(a).getCardValue()))
									{
										trueCount++;
									} else
									{
										
									}
							}
					}
				trueCount = trueCount / 3;
				if (trueCount == 2)
					{
						hand2Value = 1;
					} else if (trueCount == 3)
					{
						hand2Value = 3;
					}
				else if (trueCount == 4)
					{
						System.out.println("The computer has detected either a two pair or four of a kind. in the computer's hand..");
						System.out.println("Could you tell me which one it is? Please type 1 for two pair, and 2 for four of a kind.");
						Scanner userInput = new Scanner(System.in);
						int number = userInput.nextInt();
						if (number == 1)
							{
								hand2Value = 2;
							}
						else if (number == 2)
							{
								hand2Value = 7;
							}
						//four of a kind is 7, and two pair is 2
						//hand2Value = 0;
					}
					else
					{
						
					}
			}

		public static void findHighestCardHand1()
			{
				valueOfHighestCardHand1 = Hand.hand1.get(0).getCardValue();
			}

		public static void findHighestCardHand2()
			{
				valueOfHighestCardHand2 = Hand.hand2.get(0).getCardValue();
			}
	}