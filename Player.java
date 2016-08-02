// An object that represents a Player in a card game with a Hand and score.
public class Player { 

	// Member variables.
	private Hand hand;
	private int score;

	// Constructor.
	public Player()
	{
		this.hand = new Hand();
		this.score = 0;
		
	}

	// Adds a card to the player's hand.
	public void hit(Card c)
	{
		hand.addCard(c); // refers to the add card method in the hand class
	}


	// Returns the value of current hand.
	public int total()
	{
		return this.hand.total(); // refers to the total class in the hand method
	}

	// Returns the string representation of the current hand.	  
	public String getHand()
	{
		return hand.getCards(); // refers to the get cards method in the hand class
	}
	
	// Add given points to the players current score.
	public void addPoints(int p)
	{
		score+=p; // the score of the players is the current score plus the new points achieved
	}

	// Return the player's current score.
	public int getScore()
	{
		return score; // returns the value of score
	}

	// Discard/Clear all the cards in the current player's hand so it's empty.
	public void handClear()
	{
		hand.clear(); // refers to the clear method in the hand class
	}

}
