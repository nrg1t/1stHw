package org.example;

public class Task4 {
    public static void main(String[] args) {
//        5. შემოიტანე ნებისმიერი სტრინგი და while -ით დათვალე ამ სტრინგში
//რამდენი თანხმოვანი არის
        String text = "ნებისმიერი სტრინგია ეს";
        int count = 0;
        int i = 0;

        while (i < text.length()){
            char ch = text.charAt(i);
                if (Character.isLetter(ch)){
                    if (!(ch=='ა' || ch=='ე' || ch=='ი' || ch=='ო' || ch=='უ')){
                        count++;
                    }
                }
                i++;
            }
            System.out.println("ამ წინადადებაში თანხმოვნების რაოდენობა არის: " + count);
        }
    }
