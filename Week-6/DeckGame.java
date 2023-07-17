package assigment;
//deck game:while jack,queen,king must be 11,12,13 and joker is not included.
//So,total cards will be 52.shuffle the deck and give two cards to each players(player1 and player2)
//and then players have to sum their cards numbers. The player with the highest card wins. 
import java.util.ArrayList;
import java.util.Collections;

public class DeckGame {

    private static ArrayList<String> deck = new ArrayList<>();
    private static ArrayList<String> player1 = new ArrayList<>();
    private static ArrayList<String> player2 = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1; i < 14; i++) {
            deck.add(i + " of clubs");
            deck.add(i + " of spades");
            deck.add(i + " of hearts");
            deck.add(i + " of diamonds");
        }
        Collections.shuffle(deck);
        //print out the shuffled deck to check the answer is correct or not.
        System.out.println(deck);        
        //give cards to player one by one(player1,player2,player1,player2).
        player1.add(deck.remove(0));
        player2.add(deck.remove(0));
        player1.add(deck.remove(0));
        player2.add(deck.remove(0));

        int player1Total = getTotalCardValue(player1);
        int player2Total = getTotalCardValue(player2);
        System.out.println("Player 1 Total: " + player1Total);
        System.out.println("Player 2 Total: " + player2Total);
        if (player1Total > player2Total) {
            System.out.println("Player 1 wins with a total card value of " + player1Total+".");
            System.out.println("Player 2 must say something bad. ");
        } else if (player2Total > player1Total) {
            System.out.println("Player 2 wins with a total card value of " + player2Total+".");
            System.out.println("Player 1 must say something bad. ");
        } else {
            System.out.println("It's a tie with a total card value of " + player1Total+".");
        }
    }
    public static int getTotalCardValue(ArrayList<String> hand) {
        int total = 0;
        for (String card : hand) {
            total += getRank(card);
        }
        return total;
    }
    public static int getRank(String card) {
        return Integer.parseInt(card.split(" ")[0]);
    }
}