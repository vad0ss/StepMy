package by.Prileipishev.out.production.L_24_02_2025_HT;

public class PayPal implements PaymentMethod {

    private String email;

    private double amount;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Оплата " + amount + " через PayPal аккаунт " + this.email;
    }
}
