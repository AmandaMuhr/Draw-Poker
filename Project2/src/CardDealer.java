import java.util.Collections;

public class CardDealer
	{
		static int randomNumber = (int) (Math.random() * 50);

		public static void main(String[] args)
			{
				DeckCreator.fillCardDeck();
				shuffleCards();
				dealCards();
			}

		public static void shuffleCards()
			{
				Collections.shuffle(DeckCreator.deck);
			}

		public static void dealCards()
			{
				System.out.println("Here is your hand:");
				System.out.println("");
				for (int i = 0; i < 5; i++)
					{
						Hand.hand.add(DeckCreator.deck.get(0));
						DeckCreator.deck.remove(0);
					}
				for (int a = 0; a < Hand.hand.size(); a++)
					{
						System.out.println(Hand.hand.get(a).getName() + " of " + Hand.hand.get(a).getSuit());
					}
			}
	}