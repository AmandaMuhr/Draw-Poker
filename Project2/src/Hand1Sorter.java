import java.util.Comparator;

public class Hand1Sorter implements Comparator<Card>
	{
	public int compare (Card c1, Card c2)
		{
		if(c1.getCardValue() < c2.getCardValue())
			return 1;
		else
			return -1;
		}
	}