package by.Prileipishev.out.production.L_24_02_2025_HT;

public class CreditCard implements PaymentMethod {

    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " с кредитной карты " + this.cardNumber + " " + this.cardHolder);
    }
}
