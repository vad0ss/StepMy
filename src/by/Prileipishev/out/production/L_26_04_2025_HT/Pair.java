package by.Prileipishev.out.production.L_26_04_2025_HT;

public class Pair {

    Transaction top1;
    Transaction top2;

    public Pair(Transaction top1, Transaction top2) {
        this.top1 = top1;
        this.top2 = top2;
    }

    public Transaction getTop2() {
        return top2;
    }

    public Transaction getTop1() {
        return top1;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "top1=" + top1 +
                ", top2=" + top2 +
                '}';
    }
}
