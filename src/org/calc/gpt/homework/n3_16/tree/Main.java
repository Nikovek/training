package org.calc.gpt.homework.n3_16.tree;


public class Main {
    public static void main(String[] args) {
        AccessLevel level = AccessLevel.ADMIN;

        if (AccessLevel.canEdit(level)) {
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Доступ запрещён");
        }
    }
}
