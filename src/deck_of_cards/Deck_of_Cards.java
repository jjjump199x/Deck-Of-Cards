/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck_of_cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author 1styrGroupB
 */
public class Deck_of_Cards {

    public static ArrayList<Card> cards = new ArrayList<Card>();
    public static String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    public static String[] suits = {"Clover", "Diamond", "Heart", "Spade"};
    
    
    static int Choice() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    
    static void Create() {      
        for (String suit: suits) {
            for(String rank: ranks){
                Card card = new Card(rank , suit);
                cards.add(card);
            }
        }
        System.out.println("Successfully created!");
    }

    
    static void Shuffle() {
        if (cards.isEmpty()) {
            System.out.println("Card is empty!");
            return;
        }
        
        Collections.shuffle(cards);
        System.out.println("Cards are shuffled!");
    }
    
    
    static void Deal(int num) {
        if (cards.isEmpty()) {
            System.out.println("Card is empty!");
            return;
        }
        
        if (num > cards.size()) {
            System.out.println("Card is insufficient!");
            return;
        }
        
        for (int i = 0; i < num; i++) {
            System.out.println(cards.get(0).cardToString());
            cards.remove(0);
        }
    }

    
    static void Display(){
        if (cards.isEmpty()) {
            System.out.println("Card is empty!");
            return;
        }
        
        for (int i = 0; i < cards.size(); i++) {
            System.out.println(cards.get(i).cardToString());
        }
    }
}
