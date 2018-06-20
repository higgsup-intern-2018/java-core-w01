package session02.web_exercises;

public class Question09 {
    /*
    *9.Guess the biggest number. Consider the following game.
     * Alice writes down two integers between 0 and 100 on two cards.
     * Bob gets to select one of the two cards and see its value.
     * After looking at the value, Bob commits to one of the two cards.
     * If he chooses a card with the largest value, he wins; otherwise he loses.
     * Devise a strategy (and corresponding computer program) for Bob so that he guarantees to win strictly more than half the time.
    * */
    public static void main(String[] args) {

        int cardValue = (int) (Math.random()*99) +1 ;

        if (cardValue == 50){
            System.out.println("Bob can choose any cards he want");
        }else if(cardValue > 50) {
            System.out.println("Bob will choose the card that contains the value " + cardValue);
        } else
            System.out.println("Bob will choose the other card ");
    }
}
