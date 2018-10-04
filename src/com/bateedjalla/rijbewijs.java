package com.bateedjalla;

import java.util.Scanner;

public class rijbewijs {
    public static void main(String[] args){
        String leeftijd = "Wat is uw leeftijd?";
        int a;

        System.out.println("Voordat je verder gaat voor uw rijbewijs kiezen.");

        System.out.println(leeftijd);

        Scanner s = new Scanner(System.in);
        a = s.nextByte();

        if(a == 16 || a == 17){
            System.out.println("Jij mag beginnen met je scooter rijbewijs");
        }


        if(a == 18){
            System.out.println("Je mag je mag starten met je auto rijbewijs halen.");
        }else if(a > 18){
            System.out.println("Je mag je mag starten met je auto rijbewijs halen.");
        }else{
            System.out.println("KK nu op.");
        }


    }
}
