package by.Prileipishev.out.production.L_27_03_2025.RandomPicker;

import java.util.*;

public class LotteryMachine<T> {

    private int WINNERS_SIZE = 2;

    private List<T> allItems = new ArrayList<>();
    private List<T> winners = new ArrayList<>(WINNERS_SIZE);
    private Queue<T> queue = new LinkedList<>();
    private boolean initialized = false;


    public void add(T item) {
        allItems.add(item);
    }

    public void init() {

        if (winners.isEmpty()) {
            Collections.shuffle(allItems);
            queue.addAll(allItems);
            initialized = true;
        } else {
            for (T item : allItems) {
                if (!inWinner(item)) {
                   queue.add(item);
                }
            }
        }
    }

    public T pick() {
        if (!initialized) {
            init();
        }

        T winner = queue.poll();
        if (winners.size() < WINNERS_SIZE) {
            winners.add(winner);
        }

        return inWinner(winner) ? winner : null;
    }

    public void reset() {
        queue.clear();
        init();
    }

    public int remaining() {
        return queue.size();
    }

    private boolean inWinner(T winner) {
        for (T t : winners) {
            if (t.equals(winner)) {
                return true;
            }
        }
        return false;
    }

}
