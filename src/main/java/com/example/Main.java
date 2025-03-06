
package com.example;

public class Main {
    public void printEvenNumbers() {
        System.out.print("Even numbers: ");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing numbers
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.printEvenNumbers();
    }
}
