package logic;
import java.util.ArrayList;
import java.util.Objects;

public class UnitDeck {
	
	private ArrayList<CardCounter> cardsInDeck = new ArrayList<CardCounter>();
	private String deckName;
	
	public UnitDeck(String deckName) {
		super();
		setDeckName(deckName);
	}
	
	public ArrayList<CardCounter> getCardsInDeck() {
		return cardsInDeck;
	}

	public void setCardsInDeck(ArrayList<CardCounter> cardsInDeck) {
		this.cardsInDeck = cardsInDeck;
	}

	public String getDeckName() {
		return deckName;
	}

	public void setDeckName(String deckName) {
		if(deckName.isBlank())deckName = "Untitled Deck";
		this.deckName = deckName;
	}

	public void addCard(UnitCard newCard, int  count){
		if(count < 1)return;
		
		for(CardCounter iterateCard : this.cardsInDeck) {
			if(iterateCard.getCard().equals(newCard)) {
				iterateCard.setCount(iterateCard.getCount()+count);
				return;
			}
		}
		CardCounter temporary = new CardCounter(newCard,count);
		this.cardsInDeck.add(temporary);
	}
	
	public void removeCard(UnitCard toRemove, int count) {
		if(count < 1 || !(this.existsInDeck(toRemove)) )return;
		
		for(int i=0;i<cardsInDeck.size();i++) {
			if(cardsInDeck.get(i).getCard().equals(toRemove))
			{
				int newCount = cardsInDeck.get(i).getCount()-count;
				if(newCount <= 0) {
					cardsInDeck.get(i).setCount(0);
					cardsInDeck.remove(i);
					return;
				}
				cardsInDeck.get(i).setCount(newCount);
			}
		}
		
	}
	
	public boolean existsInDeck(UnitCard card) {
		for(CardCounter iterateCard : this.cardsInDeck) {
			if(iterateCard.getCard().equals(card)) {
				return true;
			}
		}
		return false;
	}
	
	public int cardCount() {
		int countCard = 0;
		for(int i = 0 ; i < cardsInDeck.size() ; i++ ) {
			countCard = countCard + cardsInDeck.get(i).getCount();
		}
		return countCard;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnitDeck other = (UnitDeck) obj;
		return Objects.equals(deckName, other.deckName);
	}
	
	
	
}
