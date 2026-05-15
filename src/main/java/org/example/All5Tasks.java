package org.example;

public class All5Tasks {
    public static void main(String[] args) {
        System.out.println("#1 სავარჯიშოს პასუხი");
        System.out.println("____________");
//       1. 3-ზე გამრავლების ტაბულა
        int a = 1;
        while (a < 10){
            int result = 3 * a;
            System.out.println("3*" + a + "=" + result );
            a++;
        }


//      2. String-ში სიმბოლოების რაოდენობის ლუწ-კენტობა
        System.out.println();
        System.out.println("#2 სავარჯიშოს პასუხი");
        System.out.println("____________");

        String text = "დავაგვიანე დავალების დაწერა";
        int textLength = text.length();

        if (textLength % 2 ==0 ){
            System.out.println("წინადადებაში: \"" + text + "\"" + "სიმბოლოების რაოდენობა არის ლ უ წ ი.");
        }
        else {
            System.out.println("წინადადებაში: \"" + text + "\"" + " სიმბოლოების რაოდენობა არის კ ე ნ ტ ი.");
        }


//      3. მასივის ყველა ელემენტი მეხუთეს გარდა
        System.out.println();
        System.out.println("#3 სავარჯიშოს პასუხი");
        System.out.println("____________");

        int[] numbers = {1, 3, 4, 22, 62, 42, 34, 74, 52, 35, 55};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 4) {
                continue;
            }

            System.out.println(numbers[i]);
        }


//      4. String-ში ხმოვნების დათვლა for-ით
        System.out.println();
        System.out.println("#4 სავარჯიშოს პასუხი");
        System.out.println("____________");

        String text2 = "ნებისმიერი სტრინგია ეს";
        int raod = 0;
        int x = 0;

        for (; x<text2.length(); x++){
            char simb = text2.charAt(x);
            if ((simb=='ა' || simb=='ე' || simb=='ი' || simb=='ო' || simb=='უ')){
                raod++;
            }
        }
        System.out.println("მოცემულ ტექსტში: " +"- \"" + text2 +"\" - "+ "ხმოვნების რაოდენობაა: " + raod);


//      5. String-ში თანხმოვნების დათვლა while-ით
        System.out.println();
        System.out.println("#5 სავარჯიშოს პასუხი");
        System.out.println("____________");

        String text3 = "ნებისმიერი სტრინგია ეს";
        int count = 0;
        int i = 0;

        while (i < text3.length()){
            char ch = text3.charAt(i);
            if (Character.isLetter(ch)){
                if (!(ch=='ა' || ch=='ე' || ch=='ი' || ch=='ო' || ch=='უ')){
                    count++;
                }
            }
            i++;
        }
        System.out.println("მოცემულ ტექსტში: " +"- \"" + text3 +"\" - "+ "ხმოვნების რაოდენობაა: " + count);
    }
}