package by.Prileipishev.out.production.L_26_04_2025_HT;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new BankAccount("12345", "Иван Иванов", List.of(
                        new Transaction(LocalDate.of(2025,1,5),  Transaction.Type.DEPOSIT,    500.0),
                        new Transaction(LocalDate.of(2025,2,10), Transaction.Type.WITHDRAWAL, 120.0)
                )),
                new BankAccount("67890", "Мария Петрова", List.of(
                        new Transaction(LocalDate.of(2025,3,1),  Transaction.Type.DEPOSIT,    1500.0),
                        new Transaction(LocalDate.of(2025,3,5),  Transaction.Type.WITHDRAWAL, 200.0),
                        new Transaction(LocalDate.of(2025,3,7),  Transaction.Type.DEPOSIT,    300.0)
                )),
                new BankAccount("54321", "Олег Смирнов", List.of(
                        new Transaction(LocalDate.of(2025,4,1),  Transaction.Type.WITHDRAWAL, 50.0)
                ))
        );
    }

}
