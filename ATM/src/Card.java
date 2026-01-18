public class Card {
    String cardPin;
    String cardNumber;
    String cardExpiry;
    public Card(String cardNumber, String cardPin, String cardExpiry)
    {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.cardExpiry = cardExpiry;
    }
    public String getCardPin()
    {
        return cardPin;
    }
}
