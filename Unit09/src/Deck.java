import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		cards = new Card[ranks.length*suits.length];
		int i =0;
			for (int j = 0; j < suits.length; j++) {
				for (int k = 0; k < values.length; k++) {
					Card c =new Card(ranks[k], suits[j], values[k]);
					cards[i] = c;
					i++;
				}
			}		
			size = cards.length;
			shuffle();
		
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (cards.length ==0)
			return true;
		else 
			return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return cards.length;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		int randomInt;
		Card temp;
		
		for (int i = size -1; i >0;i--){
			randomInt=(int) (Math.random()*size);
			temp = cards[i];
			cards[i] = cards[randomInt];
			cards[randomInt] = temp;}
		}
		

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		
		if (cards.length>0){
			size =size-1;
			return cards[size];
		}
		else 
			return null;
		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String output = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			output = output + cards[k];
			if (k != 0) {
				output = output + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				output = output + "\n";
			}
		}

		output = output + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			output = output + cards[k];
			if (k != size) {
				output = output + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				output = output + "\n";
			}
		}

		output = output + "\n";
		return output;
	}
}
