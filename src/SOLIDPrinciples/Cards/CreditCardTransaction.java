package SOLIDPrinciples.Cards;

import SOLIDPrinciples.Details.TransactionDetails;

public class CreditCardTransaction extends CardTransaction implements CreditCard, TransactionDetails {


    @Override
    public void cardTransaction() {
        System.out.println("Credit Transaction");
    }

    @Override
    public void getTransactionDetails() {
    }
}
