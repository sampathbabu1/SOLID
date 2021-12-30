package SOLIDPrinciples.Cards;

import SOLIDPrinciples.Details.TransactionDetails;

public class CardTransaction implements DebitCard,CreditCard, TransactionDetails {

    @Override
    public void cardTransaction() {
        //Steps for transaction of Debit or Credit Cards.
        System.out.println("Processing Card Transaction");
    }

    @Override
    public void getTransactionDetails() {
        System.out.println("Getting Transaction Details");
    }
}
