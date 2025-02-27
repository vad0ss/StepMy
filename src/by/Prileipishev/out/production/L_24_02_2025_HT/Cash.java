package by.Prileipishev.out.production.L_24_02_2025_HT;

public class Cash implements PaymentMethod {

    private  double amount;

    @Override
    public void pay(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Оплата " + amount + " наличными";
    }

}
