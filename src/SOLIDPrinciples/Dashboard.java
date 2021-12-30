package SOLIDPrinciples;

import SOLIDPrinciples.Cards.CardTransaction;
import SOLIDPrinciples.Cards.CreditCardTransaction;
import SOLIDPrinciples.Cards.DebitCardTransaction;

public class Dashboard {
    public static void main(String[] args) {
        DebitCardTransaction d = new DebitCardTransaction();
        CardTransaction a = new DebitCardTransaction(); //Upcasted..
        a.cardTransaction();
        a.getTransactionDetails();
        //Steps to show payment methods.....
        System.out.println("------");
        d.cardTransaction();
        d.getTransactionDetails();
        System.out.println("------");
        a=new CreditCardTransaction();
        a.cardTransaction();
        a.getTransactionDetails();
    }
}

