import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> cards;

    public Hand(){
        cards = new ArrayList<Card>();
    }

    public void add(Card card){
        cards.add(card);
    }

    public void print(){
        for(Card card: cards)
            System.out.println(card);
    }

    public void sort(){
        Collections.sort(cards);
    }

    public void sortAgainstSuit(){
        cards.sort(new SortAgainstSuitAndValue());
    }

    private int sum(){
        int sum = 0;
        for(Card card: cards)
            sum += card.getValue();
        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        return sum() - hand.sum();
    }
}
