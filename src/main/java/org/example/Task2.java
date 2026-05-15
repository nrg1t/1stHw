package org.example;

public class Task2 {
    public static void main(String[] args) {
//       2. შექმენით ცვლადი და გადაეცით თქვენთვის სასურველი ნებისმიერი
//წინადადება და შეამოწმეთ, თუ ამ წინადადების სიგრძე იქნება ლუწი რიცხვი,
//დაბეჭდეთ :"ლუწი", თუ კენტი მაშინ: "კენტი"
        String text = "დავაგვიანე დავალების დაწერა";
        int textLength = text.length();

        if (textLength % 2 ==0 ){
            System.out.println("წინადადებაში სიმბოლოების რაოდენობა არის ლ უ წ ი");
        }
        else {
            System.out.println("წინადადებაში სიმბოლოების რაოდენობა არის კ ე ნ ტ ი");
        }

    }
}
