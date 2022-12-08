package strategyFactory;

public interface PayStrategy {
	boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
