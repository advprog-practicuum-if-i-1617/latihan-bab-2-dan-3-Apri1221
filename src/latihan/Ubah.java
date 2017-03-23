/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author apriy
 */
public class Ubah {

    private int nomor;
    private String kata;
    private int awal, akhir, tengah, belas;
    private boolean tes = false;

    String satuan[] = {"satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};

    public Ubah() {

    }

    public void toKata(int a) {
        if (a < 10) {
            System.out.println(satuan[a - 1]);
        } else if (a == 11) {
            System.out.println("sebelas");
        } else if (a > 11 && a < 20) {
            int b = a % 10;
            System.out.println(satuan[b - 1] + " belas");
        } else if (a > 20 && a < 100 || a == 10) {
            int b = a / 10;
            int c = a % 10;
            if (a == 10) {
                System.out.println("sepuluh");
            } else if (a % 10 == 0 && a != 10) {
                System.out.println(satuan[b - 1] + " puluh");
            } else {
                System.out.println(satuan[b - 1] + " puluh " + satuan[c - 1]);
            }
        } else if (a > 100 && a < 1000) {
            int b = a / 100;
            int c = a / 10;
            int d = a % (c * 10);
            int e = (a % (b * 100)) / 10;
            if (a % 10 == 0 && (a % 100 != 0)) {
                System.out.println(satuan[b - 1] + " ratus " + satuan[e - 1] + " puluh ");
            } else if (a % 100 == 0) {
                System.out.println(satuan[b - 1] + "ratus");
            } else if (a % 100 != 0 && e == 0) {
                System.out.println(satuan[b - 1] + " ratus " + satuan[d - 1]);
            } else {
                System.out.println(satuan[b - 1] + " ratus " + satuan[e - 1] + " puluh " + satuan[d - 1]);
            }
        } else if (a == 1000) {
            System.out.println("seribu");
        }
    }

    public void toNomer(String a) {
        a.toLowerCase();
        for (int i = 0; i < satuan.length; i++) {
            if ((satuan[i].equalsIgnoreCase(a))) {
                int satuan = i + 1;
                System.out.println(satuan);
                this.tes = true;
                break;
            } else if (a.contains(satuan[i]) && a.contains("belas") && (!a.contains("ratus"))) {
                int belasan = i + 11;
                System.out.println(belasan);
                this.tes = true;
                break;
            } else if (a.contains("sepuluh")) {
                System.out.println("10");
                this.tes = true;
                break;
            } else if (a.contains("sebelas") && (!a.contains("ratus"))) {
                System.out.println("11");
                this.tes = true;
                break;
            } else if (a.contains("seratus")) {
                System.out.println("100");
                this.tes = true;
                break;
            } else if (a.contains("seribu")) {
                System.out.println("1000");
                this.tes = true;
                break;
            }
        }

        if (tes == false && (!a.contains("ratus"))) {
            a.toLowerCase();
            if (a.length() > 14) {
                for (int i = 0; i < satuan.length; i++) {
                    if (a.substring(10).contains(satuan[i])) {
                        this.akhir = i + 1;
                    }
                }
                for (int i = 0; i < satuan.length; i++) {
                    if (a.substring(0, 9).contains(satuan[i])) {
                        this.awal = (i + 1) * 10;
                    }
                }
                System.out.println(this.awal + this.akhir);
            }
            else if (a.length() < 14){
                for (int i = 0; i < satuan.length; i++) {
                    if (a.substring(0, 9).contains(satuan[i])) {
                        this.awal = (i + 1) * 10;
                    }
                }
                System.out.println(this.awal + this.akhir);
            }
        } else if (tes == false && (a.contains("ratus")) && (!a.contains("puluh")) && !a.contains("ratus")) {
            a.toLowerCase();
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(9).contains(satuan[i])) {
                    this.akhir = i + 1;
                }
            }
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(0, 8).contains(satuan[i])) {
                    this.awal = (i + 1) * 100;
                }
            }
            System.out.println(this.awal + this.akhir);

        } else if (tes == false && (a.contains("ratus") && (a.contains("puluh")))) {
            a.toLowerCase();
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(18).contains(satuan[i])) {
                    this.akhir = i + 1;
                }
            }
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(9, 23).contains(satuan[i])) {
                    this.tengah = (i + 1) * 10;
                }
            }
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(0, 8).contains(satuan[i])) {
                    this.awal = (i + 1) * 100;
                }
            }
            System.out.println(this.awal + this.tengah + this.akhir);

        } else if (tes == false && (a.contains("ratus")) && (a.contains("belas"))) {
            a.toLowerCase();
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(9).contains("belas")) {
                    this.belas = 11;
                }
            }
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(9).contains(satuan[i])) {
                    this.akhir = i;
                }
            }
            for (int i = 0; i < satuan.length; i++) {
                if (a.substring(0, 8).contains(satuan[i])) {
                    this.awal = (i + 1) * 100;
                }
            }
            System.out.println(this.awal + this.belas + this.akhir);
        }
    }
}
