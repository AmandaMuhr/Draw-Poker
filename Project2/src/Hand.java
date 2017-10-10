import java.util.ArrayList;
import java.util.Collections;

public class Hand
	{
		static ArrayList<Card> hand1 = new ArrayList<Card>();
		static ArrayList<Card> hand2 = new ArrayList<Card>();
		//make sure to order cards in each hand by number
		
		public static void sortHand1()
			{
				Collections.sort(Hand.hand1, new Hand1Sorter());
				
			}
		
		public static void sortHand2()
			{
				Collections.sort(Hand.hand2, new Hand2Sorter());
			}
	}