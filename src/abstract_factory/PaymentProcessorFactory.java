package abstract_factory;

public interface PaymentProcessorFactory {
    CreditCardProcessor createCreditCardProcessor();
    PayPalProcessor createPayPalProcessor();
    GooglePayProcessor createGooglePayProcessor();
}
