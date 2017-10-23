import java.util.Scanner;

public class TradeCards
	{
		public static int cardTrade;
		public static boolean noCardTrade;
		static boolean stillTradingCards = true;
		
		public static void tradeCardsGreeting()
			{
				System.out.println(
						"Look at your hand and type a number from 1 to 5 to select a card to trade. If you do not want to trade any cards, please type 0.");
				Scanner userInput2 = new Scanner(System.in);
				cardTrade = userInput2.nextInt();
				
				if (cardTrade == 0)
					{
						noCardTrade = true;
					}
				else
					{
						tradeCards();
					}
			}
			
		public static void tradeCards()
			{
				while (stillTradingCards)
					{
						switch (cardTrade)
							{
							case 0:
								{
									break;
								}
							case 1:
								{
									Hand.hand1.set(0, DeckCreator.deck.get(0));
									DeckCreator.deck.remove(0);
									break;
								}
							case 2:
								{
									Hand.hand1.set(1, DeckCreator.deck.get(0));
									DeckCreator.deck.remove(0);
									break;
								}
							case 3:
								{
									Hand.hand1.set(2, DeckCreator.deck.get(0));
									DeckCreator.deck.remove(0);
									break;
								}
							case 4:
								{
									Hand.hand1.set(3, DeckCreator.deck.get(0));
									DeckCreator.deck.remove(0);
									break;
								}
							case 5:
								{
									Hand.hand1.set(4, DeckCreator.deck.get(0));
									DeckCreator.deck.remove(0);
									break;
								}
							default:
								{
									System.out.println("problem");
									break;
								}
							}

						System.out.println("Would you like to trade another card? Press 1 if yes, and 2 if no.");
						Scanner userInput4 = new Scanner(System.in);
						int areYouStillTrading = userInput4.nextInt();

						if (areYouStillTrading == 1)
							{
								System.out.println("Ok!");
								stillTradingCards = true;
								tradeCardsGreeting();
							} else if (areYouStillTrading == 2)
							{
								System.out.println("All right!");
								stillTradingCards = false;
							}
					}
			}
	}