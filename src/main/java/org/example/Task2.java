package org.example;

public class Task2 {
    public static void main(String[] args) {
//       2. ტექსტის სიგრძის ლუწ-კენტობა
        String sentence = "დავაგვიანე დავალების დაწერა";
        int sentLength = sentence.length();

        if (sentLength % 2 ==0 ){
            System.out.println("წინადადებაში სიმბოლოების რაოდენობა არის ლ უ წ ი");
        }
        else {
            System.out.println("წინადადებაში სიმბოლოების რაოდენობა არის კ ე ნ ტ ი");
        }

    }
}
