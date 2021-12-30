package SOLIDPrinciples;

public class SolidPrinciplesViolation {
    public static void main(String[] args) {

    }
}
interface paymentMethods{

        public void debitCardTransaction();
        public void creditCardTransaction();
}
class UPI {
    public void UPITransaction(){

    }
}

class Payment extends UPI implements paymentMethods{

    @Override
    public void debitCardTransaction() {

    }

    @Override
    public void creditCardTransaction() {

    }
    public void showPaymentDetails(){

    }
}

