package org.calc.gpt.homework.n3_16.two;

public enum TrafficLight {
    RED, YELLOW, GREEN;

    public static String getAction(TrafficLight light) {
        switch (light) {
            case RED:
                return "Стой";
            case YELLOW:
                return "Приготовься";
            case GREEN:
                return "Иди";
            default:
                return "Неизвестный сигнал";
        }
    }
}
