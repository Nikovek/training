import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор. Введите 'выход' в любой момент для завершения.");

        while (true) {
            double num1;
            double num2;
            char operator;


            System.out.print("Введите первое число: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("выход")) break;
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число.");
                continue;
            }


            System.out.print("Введите оператор (+, -, *, /): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("выход")) break;
            if (input.length() != 1 || "+-*/".indexOf(input.charAt(0)) == -1) {
                System.out.println("Ошибка: неверный оператор.");
                continue;
            }
            operator = input.charAt(0);


            System.out.print("Введите второе число: ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("выход")) break;
            try {
                num2 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число.");
                continue;
            }


            switch (operator) {
                case '+':
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Результат: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Результат: " + (num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Ошибка: деление на ноль.");
                    } else {
                        System.out.println("Результат: " + (num1 / num2));
                    }
                    break;
            }

            System.out.println();
        }

        System.out.println("Программа завершена.");
        scanner.close();
    }
}
