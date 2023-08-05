package abstract_factory;

import abstract_factory.Provider_A.ProviderAPaymentProcessorFactory;

public class MainForA {
    public static void main(String[] args) {
        PaymentProcessorFactory providerAPaymentProcessorFactory = new ProviderAPaymentProcessorFactory();
        CreditCardProcessor providerACreditCardProcessor = providerAPaymentProcessorFactory.createCreditCardProcessor();
        PayPalProcessor providerAPayPalProcessor = providerAPaymentProcessorFactory.createPayPalProcessor();
        GooglePayProcessor providerAGooglePayProcessor = providerAPaymentProcessorFactory.createGooglePayProcessor();

        double paymentAmount = 100.00;

        providerACreditCardProcessor.processCreditCardPayment(paymentAmount);
        providerAPayPalProcessor.processPayPalPayment(paymentAmount);
        providerAGooglePayProcessor.processGooglePayPayment(paymentAmount);
    }
}
