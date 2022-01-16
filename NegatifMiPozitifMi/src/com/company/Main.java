package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        double sayi = scanner.nextDouble();
        if(sayi < 0.0){
            System.out.println("Girilen sayı negatiftir\n");
        }else if(sayi > 0.0){
            System.out.println("Girilen sayı pozitiftir\n");
        }else {
            System.out.println("Girilen sayı sıfırdır\n");
        }
    }
}
