package abstract_factory.Provider_A;

import abstract_factory.PayPalProcessor;

public class ProviderAPayPalProcessor implements PayPalProcessor {
    @Override
    public void processPayPalPayment(double amount) {
        System.out.println("ProviderA PayPal Processor: Processing payment of $" + amount);
    }
}
