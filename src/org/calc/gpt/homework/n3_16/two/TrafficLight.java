package org.calc.gpt.homework.n3_16.two;

public enum TrafficLight {
    RED, YELLOW, GREEN;
    public static String getAction(TrafficLight light) {
        if (light == RED) {
            return "Стой";
        } else if (light == YELLOW) {
            return "Приготовься";
        } else {
            return "Иди";
        }
    }
}
