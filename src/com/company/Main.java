package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(number( 18));
        System.out.println(number( 0));
        System.out.println(number( 35));
        System.out.println(number( -10));
        System.out.println(number( 20));
        System.out.println(generateRandomAge());
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int agePerson = random.nextInt(45);
        return agePerson;

    }

    public static String number( int temperature) {
        if (generateRandomAge() > 20 && generateRandomAge() < 45 && temperature > -20 && temperature < 30) {
            return "можно идти гулять";
        } else if (generateRandomAge() < 20 && temperature > 0 && temperature < 28) {
            return "  можно идти гулять ";
        } else if (generateRandomAge() > 45 && temperature > -10 && temperature < 25) {
            return "можно идти гулять";
        }else {
            return "оставайтесь дома";
        }
    }


}
