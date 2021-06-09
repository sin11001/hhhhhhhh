/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @modified by Harjot Singh
 * Student id - 991611367
 *  
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random number = new Random();
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(number.nextInt(13)+1);
            c.setSuit(Card.SUITS[number.nextInt(4)]);
            magicHand[i]=c;
                     
}
        for(int i=0;i < magicHand.length ;i++)
        {
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }        Card cards =new Card();
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a card Value between 1 and 13"); 
        int cardValue = input.nextInt();
        
        System.out.println("Please Select a card Suit");
        System.out.println("1 for Hearts, 2 for Diamonds, 3 for Spade,4 for Clubs");
        int suit = input.nextInt();
        
        cards.setValue(cardValue);
        cards.setSuit(Card.SUITS[suit-1]);
       Card card4 = new Card();
        card4.setValue(5);
        card4.setSuit(card4.SUITS[3]);
      boolean mvalue = false;
        for(int i=0; i<magicHand.length; i++)
        {
            if((magicHand[i].getSuit().equals(cards.getSuit())) && (magicHand[i].getValue() == cards.getValue())) 
                    {
                       mvalue = true;       
        }
                else
                {
                mvalue =false;
            }
        }
        if(mvalue)
                  System.out.println("The magicHand does contain your card");
        else
                  System.out.println("The magicHand does not contain your card"); 
            
        
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
}
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here    
