/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck_of_cards;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1styrGroupB
 */
public class main {
    public static void main(String args[]){
        
        while (true){
            menu();
            switch (Deck_of_Cards.Choice()){
                case 1:
                    Deck_of_Cards.Create();
                    break;
                case 2:
                    Deck_of_Cards.Shuffle();
                    break;
                case 3:
                    System.out.println("How many? ");
                    Deck_of_Cards.Deal(Deck_of_Cards.Choice());
                    break;
                case 4:
                    Deck_of_Cards.Display();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.print("\n");
        }
    }
    
    public static void menu() {
        System.out.println("Deck of Cards");
        System.out.print("1 - Create \n"
                + "2 - Shuffle \n"
                + "3 - Deal \n"
                + "4 - Display \n"
                + "Enter choice: ");
    }
    
}
