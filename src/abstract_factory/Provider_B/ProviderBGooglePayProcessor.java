package abstract_factory.Provider_B;

import abstract_factory.GooglePayProcessor;

public class ProviderBGooglePayProcessor implements GooglePayProcessor {
    @Override
    public void processGooglePayPayment(double amount) {
        System.out.println("ProviderB Google Pay Processor: Processing payment of $" + amount);

    }
}
