package by.Prileipishev.out.production.L_27_03_2025;

import by.Prileipishev.out.production.L_10_03_2025.Transport2.Transport;
import by.Prileipishev.out.production.L_13_02_2025.HT.Animal;
import by.Prileipishev.out.production.L_13_02_2025.HT.Cat;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
