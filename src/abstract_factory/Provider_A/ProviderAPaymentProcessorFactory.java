package abstract_factory.Provider_A;

import abstract_factory.*;

public class ProviderAPaymentProcessorFactory implements PaymentProcessorFactory {
    @Override
    public CreditCardProcessor createCreditCardProcessor() {
        return new ProviderACreditCardProcessor();
    }

    @Override
    public PayPalProcessor createPayPalProcessor() {
        return new ProviderAPayPalProcessor();
    }

    @Override
    public GooglePayProcessor createGooglePayProcessor() {
        return new ProviderAGooglePayProcessor();
    }
}
