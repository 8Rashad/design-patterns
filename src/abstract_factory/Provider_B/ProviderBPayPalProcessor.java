package abstract_factory.Provider_B;

import abstract_factory.PayPalProcessor;

public class ProviderBPayPalProcessor implements PayPalProcessor {
    @Override
    public void processPayPalPayment(double amount) {
        System.out.println("ProviderB PayPal Processor: Processing payment of $" + amount);

    }
}
