package by.Prileipishev.out.production.L_27_03_2025.RandomPicker.manager;

import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.enums.Sex;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.DuplicateParticipantException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.MaxWinnersExceededException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.NotInitializedException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.exception.UnderageException;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.models.Participant;

import java.util.*;

public class LotteryMachine<T extends Participant> {

    private static final int WINNERS_SIZE = 2;

    private final List<T> allItems = new ArrayList<>();
    private final Set<T> winners = new HashSet<>();
    private final Queue<T> queue = new LinkedList<>();
    private boolean initialized = false;
    private int roundWinnerCount = 0;

    public void add(T item) throws UnderageException, DuplicateParticipantException {
        if (item.getAge() < 18) throw new UnderageException("Возраст должен быть не меньше 18 лет!");
        if (checkPassportId(item.getPasportId())) throw new DuplicateParticipantException("Паспорт с таким ид уже есть в системе");
        allItems.add(item);
    }

    public void init() {
        Collections.shuffle(allItems);
        queue.addAll(allItems);
        initialized = true;
        roundWinnerCount = 0;
    }

    public T pick() throws MaxWinnersExceededException {
        if (!initialized) {
            init();
        }

        if (roundWinnerCount == WINNERS_SIZE) {
            throw new MaxWinnersExceededException("Максимальное количество победителей!");
        } else {
            T winner = queue.poll();
            winners.add(winner);
            roundWinnerCount++;
            return winner;
        }
    }

    public void reset() throws NotInitializedException {
        if (!initialized) {
            throw new NotInitializedException("Первый розыгрыш не состоялся!");
        }

        queue.clear();
        init();
    }

    public int remaining() {
        return queue.size();
    }

    public Map<String, Integer> ageToWinners() {
        Map<String, Integer> map = new HashMap<>(Map.of("18-30 лет", 0, "30-50 лет", 0, "50 и больше", 0));

        for (T winner : winners) {
            if (winner.getAge() >= 18 && winner.getAge() <= 30) {
                map.put("18-30 лет", map.get("18-30 лет") + 1);
            } else if (winner.getAge() >= 31 && winner.getAge() <= 50) {
                map.put("30-50 лет", map.get("30-50 лет") + 1);
            } else if (winner.getAge() > 50) {
                map.put("50 и больше", map.get("50 и больше") + 1);
            }
        }
        return map;
    }

    public Map<Sex, Integer> sexToWinners() {
        Map<Sex, Integer> map = new EnumMap<>(Map.of(Sex.MALE, 0, Sex.FEMALE, 0));

        for (T winner : winners) {
            Sex sex = winner.getSex();
            map.put(sex, map.get(sex) + 1);
        }
        return map;
    }

    private boolean checkPassportId(Integer passportId) {
        for (T item : allItems) {
            if (item.getPasportId() == passportId) {
                return true;
            }
        }
        return false;
    }

}
