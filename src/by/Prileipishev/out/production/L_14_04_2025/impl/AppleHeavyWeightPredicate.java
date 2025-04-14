package by.Prileipishev.out.production.L_14_04_2025.impl;

import by.Prileipishev.out.production.L_14_04_2025.Apple;
import by.Prileipishev.out.production.L_14_04_2025.predicate.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
