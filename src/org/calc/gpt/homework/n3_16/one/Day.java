package org.calc.gpt.homework.n3_16.one;

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public static boolean isWeekend(Day day) {
        return day == SATURDAY || day == SUNDAY;
    }
}