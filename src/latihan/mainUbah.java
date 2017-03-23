/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.*;

/**
 *
 * @author apriy
 */
public class mainUbah {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Ubah Angka menjadi Kata\n"
                    + "2. Ubah Kata menjadi Angka\n"
                    + "3. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    Ubah a = new Ubah();
                    System.out.print("Ubah(1 - 1000) : ");
                    int x = in.nextInt();
                    a.toKata(x);
                    break;
                case 2:
                    Ubah b = new Ubah();
                    System.out.print("Ubah(Satu - Seribu) : ");
                    String y = in2.nextLine().toLowerCase();
                    b.toNomer(y);
                    break;
                case 3:
                    System.out.println("Anda akan keluar");
                    break;
                default :
                    System.out.println("Tidak ada dalam pilihan");
                    break;
            }
        } while (pilihan != 3);
    }
}