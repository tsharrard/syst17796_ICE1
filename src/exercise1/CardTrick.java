package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Scott Sharrard - Feb 2022 - New
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];   // declaring a arry called hand and it consist of seven objects from the card class
                                                     // objects have two variables - randome number 1 to 4
                                                     // random number one to 13

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card(((int)(Math.random()*13)+1),((int)(Math.random()*4)+1));
            //  remove  comments from line below to see computer cards and check routine
            //   System.out.println(hand[i].getSuit()+hand[i].getValue());
        }
        
        java.util.Scanner input = new java.util.Scanner(System.in); 
        System.out.print("Enter the Suit \"Hearts\" "
                + "or \"Clubs\" or \"Spades\" or \"Diamonds\" in upper or lowercase: "); 
        String s1 = input.next().toLowerCase();
        System.out.print("Enter a card value  1 = ace to 13 = king: ");
        int s2 = input.nextInt();
        // add some comment
        boolean correctSuit;
        boolean correctValue;
        boolean cardMatch;
              
        
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].getValue()== s2) {
                correctValue = true;
            } 
                else correctValue = false;
           if (hand[i].getSuit().equals(s1)) {
               correctSuit = true;
           } else correctSuit = false;
           System.out.print(hand[i].getSuit()+ " " + hand[i].getValue());
            if (correctValue && correctSuit){
                System.out.println(" - Its a match - looks like we have a winner!!!!");
                printInfo();
                break;
            }
            else System.out.println(" - Nope - did not match!");
        }
        }
            
           
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Scott, but you can call me Scott or Scotty");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Graduate with Good Grades");
        System.out.println("-- Make lots of money");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Rust");
        System.out.println("-- Mindcraft");
        System.out.println("-- Rust");
        System.out.println("-- Mindcraft");

        System.out.println();
        
    
    }
}

