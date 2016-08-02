// Object to represent a hand of cards used for any card game.
public class Hand {

	// Member variable to represent the hand of cards.
	private Card[] theHand;  
	private int numCards;


	public Hand()
	{
		// Maximum size hand set to 11 -- very unlikely to occur!
		this.theHand = new Card[11];
		this.numCards = 0;
	}

	// Return a multi-line string representation of the current cards in the hand.
	public String getCards()
	{
		String h = ""; // declare empty string
		for (int i=0; i<numCards; i++){ // loops through cards in hand
			h = h +theHand[i].printCard()+", "; // adds cards to string
		}

		return h; // returns card list
	}

	// Clear the hand of its current cards.
	public void clear()
	{
		for(int i=0; i<theHand.length; i++) // loops through all positions in hand
		{
			theHand[i]=null; // set equal to null
		}
		numCards=0; // sets index back to 0
	}

	// Add a card to the hand.
	public void addCard(Card c)
	{
		theHand[numCards]=c; //adds card brought in by parameter to hand
		numCards++; // increments the index
	}

	// Add up all the values of the cards based on rank.
	// Find the highest value of hand depending on Ace = 1 or 11 points 
	// whichever is to your benefit without going over 21!
	// Also calculate total based on all face cards (Jack, Queen, King) being 10 points.
	// Other cards in deck are based on their face value.
	public int total()
	{
		int a=0; //ace counter
		int total=0; // total counter
		for (int i = 0; i < numCards; i++){ // loops through the hand
			if(theHand[i].getRank()==1){ // if it's an ace
				a++; // increment number of aces
			}
			else if(theHand[i].getRank()>10){ // if its a face card, add 10 points
				total+=10; 
			}
			else{
				total+=theHand[i].getRank(); // if its a number card, add its value
			}

		}
		for(int i=0; i<a; i++){ // To decide if the aces are worth 1 or 11, loop through number of aces in hand
			if((total+11)<=21){ // if the ace at value 11 wont make you go bust
				total+=11; // set ace equal to 11
			}
			else{ // if it does make you go bust at 11
				total+=1; // set ace equal to 1
			}
		}
		return total; // return the sum of the card values

	}


}
