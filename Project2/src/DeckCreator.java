import java.util.ArrayList;

public class DeckCreator
	{
		static ArrayList<Card> deck = new ArrayList<Card>();
		
		// Suits: Hearts, Diamonds, Clubs, Spades
		// Names: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace
		
		public static void fillCardDeck()
			{
					{
						// ALL CLUBS
						deck.add(new Card("Two", "clubs", "black", 2));
						deck.add(new Card("Three", "clubs", "black", 3));
						deck.add(new Card("Four", "clubs", "black", 4));
						deck.add(new Card("Five", "clubs", "black", 5));
						deck.add(new Card("Six", "clubs", "black", 6));
						deck.add(new Card("Seven", "clubs", "black", 7));
						deck.add(new Card("Eight", "clubs", "black", 8));
						deck.add(new Card("Nine", "clubs", "black", 9));
						deck.add(new Card("Ten", "clubs", "black", 10));
						deck.add(new Card("Jack", "clubs", "black", 11));
						deck.add(new Card("Queen", "clubs", "black", 12));
						deck.add(new Card("King", "clubs", "black", 13));
						deck.add(new Card("Ace", "clubs", "black", 14));
					}
				// ALL SPADES
					{
						deck.add(new Card("Two", "spades", "black", 2));
						deck.add(new Card("Three", "spades", "black", 3));
						deck.add(new Card("Four", "spades", "black", 4));
						deck.add(new Card("Five", "spades", "black", 5));
						deck.add(new Card("Six", "spades", "black", 6));
						deck.add(new Card("Seven", "spades", "black", 7));
						deck.add(new Card("Eight", "spades", "black", 8));
						deck.add(new Card("Nine", "spades", "black", 9));
						deck.add(new Card("Ten", "spades", "black", 10));
						deck.add(new Card("Jack", "spades", "black", 11));
						deck.add(new Card("Queen", "spades", "black", 12));
						deck.add(new Card("King", "spades", "black", 13));
						deck.add(new Card("Ace", "spades", "black", 14));
					}
				// ALL DIAMONDS
					{
						deck.add(new Card("Two", "diamonds", "red", 2));
						deck.add(new Card("Three", "diamonds", "red", 3));
						deck.add(new Card("Four", "diamonds", "red", 4));
						deck.add(new Card("Five", "diamonds", "red", 5));
						deck.add(new Card("Six", "diamonds", "red", 6));
						deck.add(new Card("Seven", "diamonds", "red", 7));
						deck.add(new Card("Eight", "diamonds", "red", 8));
						deck.add(new Card("Nine", "diamonds", "red", 9));
						deck.add(new Card("Ten", "diamonds", "red", 10));
						deck.add(new Card("Jack", "diamonds", "red", 11));
						deck.add(new Card("Queen", "diamonds", "red", 12));
						deck.add(new Card("King", "diamonds", "red", 13));
						deck.add(new Card("Ace", "diamonds", "red", 14));
					}
				//ALL HEARTS
					{
						deck.add(new Card("Two", "hearts", "red", 2));
						deck.add(new Card("Three", "hearts", "red", 3));
						deck.add(new Card("Four", "hearts", "red", 4));
						deck.add(new Card("Five", "hearts", "red", 5));
						deck.add(new Card("Six", "hearts", "red", 6));
						deck.add(new Card("Seven", "hearts", "red", 7));
						deck.add(new Card("Eight", "hearts", "red", 8));
						deck.add(new Card("Nine", "hearts", "red", 9));
						deck.add(new Card("Ten", "hearts", "red", 10));
						deck.add(new Card("Jack", "hearts", "red", 11));
						deck.add(new Card("Queen", "hearts", "red", 12));
						deck.add(new Card("King", "hearts", "red", 13));
						deck.add(new Card("Ace", "hearts", "red", 14));
					}
			}
	}
