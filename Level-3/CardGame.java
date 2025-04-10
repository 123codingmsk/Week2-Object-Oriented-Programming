import java.util.*;

public class CardGame {

    public static String[] initialize() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int)(Math.random()*(deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distribute(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cannot distribute cards equally to players.");
            return null;
        }
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        int index = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of cards to distribute: ");
        int numOfCards = sn.nextInt();
        System.out.print("Enter the number of players: ");
        int numOfPlayers = sn.nextInt();
        String[] deck = initialize();
        deck = shuffle(deck);
        String[][] players = distribute(deck, numOfCards, numOfPlayers);
        if (players != null) {
            printPlayersAndCards(players);
        }
        sn.close();
    }
}

