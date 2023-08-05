package abstract_factory.Provider_B;

import abstract_factory.CreditCardProcessor;

public class ProviderBCreditCardProcessor implements CreditCardProcessor {
    @Override
    public void processCreditCardPayment(double amount) {
        System.out.println("ProviderB Credit Card Processor: Processing payment of $" + amount);
    }
}
