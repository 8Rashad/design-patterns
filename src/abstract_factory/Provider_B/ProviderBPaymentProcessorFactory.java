package abstract_factory.Provider_B;

import abstract_factory.*;

public class ProviderBPaymentProcessorFactory implements PaymentProcessorFactory {
    @Override
    public CreditCardProcessor createCreditCardProcessor() {
        return new ProviderBCreditCardProcessor();
    }

    @Override
    public PayPalProcessor createPayPalProcessor() {
        return new ProviderBPayPalProcessor();
    }

    @Override
    public GooglePayProcessor createGooglePayProcessor() {
        return new ProviderBGooglePayProcessor();
    }
}
