package by.Prileipishev.out.production.L_27_03_2025.RandomPicker;

import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.MaxWinnersExceededException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.NotInitializedException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.UnderageException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.factory.ParticipiantFactory;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.manager.LotteryMachine;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.models.Participant;

public class Main {

    public static void main(String[] args) throws UnderageException {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();

        // Добавляем участников
        for (int i = 0; i < 10; i++) {
            Participant participant = ParticipiantFactory.next();
            try {
                lotto.add(participant);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("🎰 Первый розыгрыш:");

        while (true) {
            try {
                Participant winner = lotto.pick();
                System.out.println("Выбран: " + winner);
            } catch (MaxWinnersExceededException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("\n🔁 Новый розыгрыш:");

        try {
            lotto.reset();
        } catch (NotInitializedException e) {
            System.out.println(e.getMessage());
        }

        while (true) {
            try {
                Participant winner = lotto.pick();
                System.out.println("Снова выбран: " + winner);
            } catch (MaxWinnersExceededException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println(lotto.ageToWinners());
        System.out.println(lotto.sexToWinners());
    }
}
