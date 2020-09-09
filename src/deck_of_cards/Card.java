/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deck_of_cards;

/**
 *
 * @author 1styrGroupB
 */
public class Card {
    
    private String rank;
    private String suit;
    
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }
    
    public String cardToString() {
        return this.rank + this.suit;
    }
    
//    public String getSuit(){
//        return suit;
//    }
//    
//    public String setSuit(String suit){
//        this.suit = suit;
//    }
//    
//    public String getRank(){
//        return rank;
//    }
//    
//    public void setRank(String rank){
//        this.rank = rank;
//    }
    
//    public enum Suits {
//        Cloves,
//        Diamond,
//        Heart,
//        Spade
//    }
//    
//    public enum Rank{
//        Ace,
//        Two,
//        Three,
//        Four,
//        Five,
//        Six,
//        Seven,
//        Eight,
//        Nine,
//        Ten,
//        Jack,
//        Queen,
//        King
//    }
}
