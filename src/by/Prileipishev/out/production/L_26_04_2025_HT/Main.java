package by.Prileipishev.out.production.L_26_04_2025_HT;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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

        //    Все суммы транзакций
        //    Соберите List<Double> всех сумм:

        List<Double> sumList = accounts.stream()
                .flatMap(a -> a.getTransactions().stream())
                .map(Transaction::getAmount)
                .collect(Collectors.toList());

        System.out.println(sumList);

//        Список депозитов
//        Получите List<Transaction> только депозитов:

        List<Transaction> transactions = accounts.stream()
                .flatMap(a -> a.getTransactions().stream())
                .collect(Collectors.toList());

        System.out.println(transactions);

//        Даты снятий
//        Соберите List<LocalDate> дат снятий:

        List<LocalDate> dates = accounts.stream()
                .flatMap(a -> a.getTransactions().stream())
                .map(Transaction::getDate)
                .collect(Collectors.toList());

        System.out.println(dates);

//        Имена владельцев
//        Распечатайте всех владельцев:

        List<BankAccount> owners = accounts.stream()
                .peek(a -> System.out.println(a.getOwnerName()))
                .collect(Collectors.toList());

//        Большие транзакции
//        Найдите транзакции больше 1000 Br:

        List<Transaction> bigTransaction = accounts.stream()
                .flatMap(a -> a.getTransactions().stream())
                .filter(t -> t.getAmount() > 1000)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(bigTransaction);

//        Сортировка по сумме
//        Отсортируйте все транзакции по возрастанию суммы:

        List<Transaction> sortTransaction = accounts.stream()
                .flatMap(a -> a.getTransactions().stream())
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());

        System.out.println(sortTransaction);

//        Выберите List top2, два самых крупных снятия:
//        *Усложнение, не List а Класс типа Pair которые будет содержать top1 и top2

        List<Transaction> topTransactions = accounts.stream()
                .flatMap(a -> a.getTransactions().stream())
                .sorted(Comparator.comparing(Transaction::getAmount).reversed())
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(topTransactions);

        // как то ничего другого на ум не приходит тут, будет интересно узнать другой метод решения
        Pair pair = new Pair(topTransactions.get(0), topTransactions.get(1));
        System.out.println(pair);

//        Количество транзакций по счёту
//        Выведите accountNumber и число транзакций:

        Map<String, Integer> accountTransactions = accounts.stream()
                .collect(Collectors.toMap(BankAccount::getAccountNumber, a -> a.getTransactions().size()));

        System.out.println(accountTransactions);

//        Пустые счета
//        Проверьте, есть ли счёт без транзакций:

        List<BankAccount> emptyAcc = accounts.stream()
                .filter(a -> a.getTransactions().size() == 0)
                .collect(Collectors.toList());

        String message = emptyAcc.size() == 0 ? "Пустых аккаунтов нет:" : "Пустых аккаунтов: " + emptyAcc.size();

        System.out.println(message);

//        Владельцы с депозитами
//        Соберите Set<String> имён владельцев, которые делали депозиты:

        Set<String> depositOwners = accounts.stream()
                .filter(a -> a.getTransactions().stream()
                        .anyMatch(t -> t.getType() == Transaction.Type.DEPOSIT))
                .map(BankAccount::getOwnerName)
                .collect(Collectors.toSet());

        System.out.println(depositOwners);

    }

}
