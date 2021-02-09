/*
 * Khuzaima Ashraf
* 991586242
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {

            // random number generator for card value and suit
            int value = ((int) (Math.random() * 13 + 1));
            String suit = Card.SUITS[(int) (Math.random() * 4)];

            Card randomCard = new Card(value, suit);
            magicHand[i] = randomCard;
            switch (randomCard.getValue()) {
                case 1:
                    System.out.println("Card number " + (i + 1) + " is: The Ace of " + randomCard.getSuit());
                    break;
                case 11:
                    System.out.println("Card number " + (i + 1) + " is: The Jack of " + randomCard.getSuit());
                    break;
                case 12:
                    System.out.println("Card number " + (i + 1) + " is: The Queen of " + randomCard.getSuit());
                    break;
                case 13:
                    System.out.println("Card number " + (i + 1) + " is: The King of " + randomCard.getSuit());
                    break;
                default:
                    System.out.println("Card number " + (i + 1) + " is: The " + randomCard.getValue() + " of " + randomCard.getSuit());
                    break;
            }
        }
        boolean search = false;
        Card luckyCard = new Card(4, "Hearts");
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                search = true;
                break;
            }
        }
        System.out.print("\n");
if (search){System.out.println("YOU WIN");}
else{System.out.println("Sorry You Lose");}
    }
}
