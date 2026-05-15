package org.example;

public class Task3 {
    public static void main(String[] args) {
//        3. for -ით დაბეჭდეთ მასივში არსებული ყოველი ელემენტი, გარდა მეხუთე
//პოზიციაზე მდგომისა
        int[] numbers = {1, 3, 4, 22, 62, 42, 34, 74, 52, 35, 55};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(numbers[i]);
        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (i != 4) {
//                System.out.println(numbers[i]);
//            }
//        }
    }

}
