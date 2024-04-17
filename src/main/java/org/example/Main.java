package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        // Виведення арифметичної суми
        System.out.println(x + y);

        // Виведення значень змінних поспіль
        System.out.println("" + x + y);

        // Подати у десятковому вигляді наступні числа
        System.out.println(101);
        System.out.println(11);
        System.out.println(111);

        // Подати у двійковому вигляді такі числа
        System.out.println(Integer.parseInt("10", 2)); // 2
        System.out.println(Integer.parseInt("10111", 2)); // 23
        System.out.println(Integer.parseInt("1111", 2)); // 15

        // Коди із змінною "i"
        int i = 5;
        i = i + +;
        System.out.println(i); // 6

        i = 5;
        i = i++ + i++;
        System.out.println(i); // 11

        i = 5;
        i = i++ + ++i;
        System.out.println(i); // 12

        i = 5;
        i = ++i + ++i;
        System.out.println(i); // 13
}

}