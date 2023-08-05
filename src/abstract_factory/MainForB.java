package abstract_factory;

import abstract_factory.Provider_B.ProviderBPaymentProcessorFactory;

public class MainForB {
    public static void main(String[] args) {
        PaymentProcessorFactory providerBPaymentProcessorFactory = new ProviderBPaymentProcessorFactory();
        CreditCardProcessor providerBCreditCardProcessor = providerBPaymentProcessorFactory.createCreditCardProcessor();
        PayPalProcessor providerBPayPalProcessor = providerBPaymentProcessorFactory.createPayPalProcessor();
        GooglePayProcessor providerBGooglePayProcessor = providerBPaymentProcessorFactory.createGooglePayProcessor();

        double paymentAmount = 100.00;

        providerBCreditCardProcessor.processCreditCardPayment(paymentAmount);
        providerBPayPalProcessor.processPayPalPayment(paymentAmount);
        providerBGooglePayProcessor.processGooglePayPayment(paymentAmount);
    }
}
