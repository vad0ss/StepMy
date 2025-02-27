package by.Prileipishev.out.production.L_24_02_2025_HT;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата " + amount + " наличными");
    }
}
