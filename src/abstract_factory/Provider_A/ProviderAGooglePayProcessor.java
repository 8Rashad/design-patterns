package abstract_factory.Provider_A;

import abstract_factory.GooglePayProcessor;

public class ProviderAGooglePayProcessor implements GooglePayProcessor {
    @Override
    public void processGooglePayPayment(double amount) {
        System.out.println("ProviderA Google Pay Processor: Processing payment of $" + amount);

    }
}
