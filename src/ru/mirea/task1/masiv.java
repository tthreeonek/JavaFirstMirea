package ru.mirea.task1;

public class masiv {
    public static void main(String[] args) {

        System.out.println("Задание номер 1");

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("Ответ: " + sum);
    }
}