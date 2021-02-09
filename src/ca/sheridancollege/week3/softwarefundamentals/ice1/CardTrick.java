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
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(1+ Math.random() * 13));
            c.setSuit("x");
            switch (c.getValue()) {
                case 1:
                    System.out.println("Card number " + (i + 1) + " is: The Ace of " + c.getSuit());
                    break;
                case 11:
                    System.out.println("Card number " + (i + 1) + " is: The Jack of " + c.getSuit());
                    break;
                case 12:
                    System.out.println("Card number " + (i + 1) + " is: The Queen of " + c.getSuit());
                    break;
                case 13:
                    System.out.println("Card number " + (i + 1) + " is: The King of " + c.getSuit());
                    break;
                default:
                    System.out.println("Card number " + (i + 1) + " is: The " + c.getValue() + " of " + c.getSuit());
                    break;
            }
        }
            
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
       
        Scanner k = new Scanner(System.in);
         System.out.println("Pick a Card. Any Card! (Enter a suit)");
         String inp_suit = k.nextLine();
         System.out.println("Enter a number between 1 - 13 ");
         int inp_card = k.nextInt();
         
    }

}
