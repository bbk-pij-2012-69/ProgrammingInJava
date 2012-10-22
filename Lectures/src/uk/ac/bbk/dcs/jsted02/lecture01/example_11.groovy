package lecture01

// Example 11 - Poker, ker, ker, ker...face.

class Card
{
    static valid_card = ["2","3","4","5","6","7","8","9","10","J","Q","K","1"]
    static valid_suit = ["hearts", "diamonds", "clubs", "spades"]

    def card;
    def suit;
    def value;
    def position;
    def Card(String card, String suit)
    {
        this.card = card
        this.suit = suit
        this.position = 1 << this.valid_card.indexOf(this.card) 
        println 1 << this.valid_card.indexOf(this.card) 
        println "creating card: " + this.card + this.suit + " - " + this.position
        
        
        this.position += 1 << 2 
        println this.position
        println ""
    }
    
    
    
    
}

def card_factory(String card, String suit){
    if(Card.valid_card.contains(card) && Card.valid_suit.contains(suit.toLowerCase()))
        return new Card( card, suit.toLowerCase());
    else
    {
        if (!valid_card.contains(card))
            println "Invalid  " + card
        if (!valid_suit.contains(suit))
            println "Invalid " + suit
        return false;
    }
        
}
def check_hand(def hand)
{
//    
//    
//    else
//        println "Nothing"
//    
}

check_hand([new Card("1","hearts"),
            new Card("2","hearts"),
            new Card("10","hearts"),
            new Card("K","hearts"), 
            new Card("2","spades")])

//def hand = []
//while(hand.size() < 5)
//{
//    print "Please enter card: "
//    String card = System.console().readLine()
//    print "Please enter suit: "
//    String suit = System.console().readLine()
//
//    def cardObj = card_factory(card, suit)
//    if(cardObj)
//        hand.add(cardObj)
//    println hand.size()
//}
