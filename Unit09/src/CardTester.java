/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card chicken = new Card("King", "Diamonds", 10);
		Card chicken2 = new Card("Queen", "Spades", 20);
		Card chicken3 = new Card("King", "Diamonds", 10);
		System.out.println(chicken.rank());
		System.out.println(chicken2.suit());
		System.out.println(chicken.pointValue());
		System.out.println(chicken2.matches(chicken3));
		System.out.println(chicken.matches(chicken2));
		System.out.println(chicken);
	}
}
