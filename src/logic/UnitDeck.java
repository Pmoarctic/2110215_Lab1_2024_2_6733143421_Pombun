package logic;
import java.util.ArrayList;

public class UnitDeck {
	
	ArrayList<CardCounter> cardsInDeck;
	String deckName;
	
	private UnitDeck(String deckName) {
		super();
		this.deckName = deckName;
	}
	
	public void addCard(UnitCard newCard, int  count){
		if(count < 1)return;
		
//		int idx=-1;
//		for(int i = 0 ; i < cardsInDeck.size() ; i++) {
//			if(cardsInDeck.)
//		}
		CardCounter tmp = new CardCounter(newCard,count);
		int idx = cardsInDeck.indexOf(tmp);
		
		if(idx < 0)
		{
			cardsInDeck.add(tmp);
		}
		else
		{
			int currentCount = cardsInDeck.get(idx).getCount();
			cardsInDeck.get(idx).setCount(currentCount+count);
		}
	}
	
	public void removeCard(UnitCard toRemove, int count) {
		CardCounter tmp = new CardCounter(toRemove,count);
		if(count < 1 || !(cardsInDeck.contains(tmp)) ) {
			
		}
	}
	
}
