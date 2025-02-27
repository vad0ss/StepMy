package by.Prileipishev.out.production.L_24_02_2025_HT;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PaymentMethod> pm = new ArrayList<PaymentMethod>();

        pm.add(new CreditCard("5342 1933 4507 2811", "Иван Иванов"));
        pm.add(new PayPal("example@example.com"));
        pm.add(new Cash());

        for (PaymentMethod payment : pm) {
            payment.pay(150.00);
            System.out.println(payment);
        }
    }
}
