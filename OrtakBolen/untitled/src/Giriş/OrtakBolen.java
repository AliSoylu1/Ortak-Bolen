package Giriş;

import java.util.Scanner;

public class OrtakBolen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k;
        System.out.println("Lütfen Bir Sayı Girin: ");
        k = input.nextInt();
        int toplam = 0;
        int sayac = 0;
        for (int i = 1; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {

                toplam = toplam + i;
                sayac++;
            }
        }
        System.out.println(toplam / sayac);
    }
}
