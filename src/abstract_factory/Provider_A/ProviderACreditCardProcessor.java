package abstract_factory.Provider_A;

import abstract_factory.CreditCardProcessor;

public class ProviderACreditCardProcessor implements CreditCardProcessor {
    @Override
    public void processCreditCardPayment(double amount) {
        System.out.println("ProviderA Credit Card Processor: Processing payment of $" + amount);

    }
}
