package Lr2;


import java.util.Scanner;

public class job1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int x;
        x = number % 3;
        if (x > 0) {
            System.out.println("Число не делится на 3 ");
        }
        else {
            System.out.println("Число делится на 3");
        }
        scanner.close();

    }

}