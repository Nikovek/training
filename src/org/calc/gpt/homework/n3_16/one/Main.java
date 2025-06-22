package org.calc.gpt.homework.n3_16.one;

public class Main {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        if (Day.isWeekend(today)) {
            System.out.println(today + " — это выходной!");
        } else {
            System.out.println(today + " — это будний день.");
        }
    }
}

