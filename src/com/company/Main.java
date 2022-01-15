package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
	    int mat, turkce, fizik, kimya, tarih;
        int count = 0;
        double toplam = 0;
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        if (mat >= 0 && mat <= 100){
            count++;
            toplam += mat;

        }

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        if (turkce >= 0 && turkce <= 100){
            count++;
            toplam += turkce;

        }

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt()
        ;
        if (fizik >= 0 && fizik <= 100){
            count++;
            toplam += fizik;

        }

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        if (kimya >= 0 && kimya <= 100){
            count++;
            toplam +=kimya;

        }
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        if (tarih >= 0 && tarih <= 100){
            count++;
            toplam += tarih;

        }

        double average = toplam / count;
        if (average >= 55) {System.out.println("Tebrikler Sınıfı Geçtiniz!!!");}
        else {System.out.println("Sınıfta kaldınız seneye görüşürüz!");};
        System.out.println("Ortalama: " + average);
    }
}
