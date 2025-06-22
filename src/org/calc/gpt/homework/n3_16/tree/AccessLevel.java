package org.calc.gpt.homework.n3_16.tree;

public enum AccessLevel {
    GUEST, USER, ADMIN;

    public static boolean canEdit(AccessLevel level) {
        return level == USER || level == ADMIN;
    }
}
