/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank ={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suit ={"Spades", "Clubs", "Diamonds","Hearts"};
		int[] pointvalue = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck tester = new Deck(rank,suit,pointvalue);
		System.out.println("Deck size " + tester.size());
		System.out.println("Is deck empty? " + tester.isEmpty());
		System.out.println("Card dealt " + tester.deal());
		System.out.println("Card dealt " + tester.deal());
		System.out.println("Card dealt " + tester.deal());
		System.out.println("Card dealt " + tester.deal());
		}}
