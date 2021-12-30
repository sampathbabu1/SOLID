package SOLIDPrinciples.Cards;

import SOLIDPrinciples.Details.TransactionDetails;

public class DebitCardTransaction extends CardTransaction implements DebitCard, TransactionDetails {

    @Override
    public void cardTransaction() {
        //Steps
        System.out.println("Processing Debit Card Transaction");
    }

    @Override
    public void getTransactionDetails() {
        System.out.println("Processing Details of Debit Card Transaction");
    }
}
