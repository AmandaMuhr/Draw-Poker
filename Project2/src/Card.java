
public class Card
	{
		String rank;
		String suit;
		String color;
		int value;

		public Card(String n, String s, String c, int cv)
			{
				rank = n;
				suit = s;
				color = c;
				value = cv;
			}

		public String getName()
			{
				return rank;
			}

		public void setName(String name)
			{
				this.rank = name;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public String getColor()
			{
				return color;
			}

		public void setColor(String color)
			{
				this.color = color;
			}

		public int getCardValue()
			{
				return value;
			}

		public void setCardValue(int cardValue)
			{
				this.value = cardValue;
			}
	}
