/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner lebokno = new Scanner(System.in);
        String ulangi;
        int n, i, dicari, pertama, terakhir, tengah;
        int arr[] = new int[50];
        System.out.println("FRANKY WAHYU PRASETYO/25/XRPL 6");
        System.out.println("Binary Search");

        System.out.print("Masukan Total Elemen : ");
        n = lebokno.nextInt();

        System.out.println("Masukan " + n + " Elemen:");
        for (i = 0; i < n; i++) {
            arr[i] = lebokno.nextInt();
        }

        System.out.print("Masukan Bilangan Yang Dicari :");
        dicari = lebokno.nextInt();

        pertama = 0;
        terakhir = n - 1;
        tengah = (pertama + terakhir) / 2;

        while (pertama <= terakhir) {
            if (arr[tengah] < dicari) {
                pertama = tengah + 1;
            } else if (arr[tengah] == dicari) {
                System.out.println(dicari + " Ditemukan Di Index " + tengah);
                System.out.println("Terima Kasih Telah Menggunakan Program Saya");
                break;

            } else {
                terakhir = tengah - 1;
            }
            tengah = (pertama + terakhir) / 2;
        }
        if (pertama > terakhir) {
            System.out.println(dicari + " Tidak Ketemu Mungkin yang dimasukan tidak ada di daftar ");
            System.out.println("Terima Kasih Telah Menggunakan Program Saya");

        }

    }
}
