package MayinTarlasi;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    void run() {
        System.out.println("Mayınların Konumu");
        int mayin_sayisi = (rowNumber * colNumber) / 4;
        String[][] mayin_tarlasi = new String[rowNumber][colNumber];
        String[][] bos_mayin_tarlasi = new String[rowNumber][colNumber];

        int rasgelesatir;
        int rasgelesutun;

        for (int h = 0; h < rowNumber; h++) {
            for (int f = 0; f < colNumber; f++) {
                mayin_tarlasi[h][f] = " - ";
            }
        }

        int gecici_mayin_sayisi = mayin_sayisi;

        while (gecici_mayin_sayisi > 0) {
            rasgelesatir = (int) (Math.random() * rowNumber);
            rasgelesutun = (int) (Math.random() * colNumber);
            if (!(mayin_tarlasi[rasgelesatir][rasgelesutun].equals(" * "))) {
                mayin_tarlasi[rasgelesatir][rasgelesutun] = " * ";
                gecici_mayin_sayisi--;
            }
        }

        for (int h = 0; h < rowNumber; h++) {
            for (int f = 0; f < colNumber; f++) {
                System.out.print(mayin_tarlasi[h][f]);
            }
            System.out.println();
        }

        System.out.println("==============================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");

        for (int j = 0; j < rowNumber; j++) {
            for (int k = 0; k < colNumber; k++) {
                bos_mayin_tarlasi[j][k] = " - ";
                System.out.print(bos_mayin_tarlasi[j][k]);
            }
            System.out.println();
        }

        int satir, sutun;
        int hak = (mayin_tarlasi.length * mayin_tarlasi[0].length) - mayin_sayisi;
        Scanner input = new Scanner(System.in);

        while (hak > 0) {
            int sayac = 0;
            System.out.print("Satır giriniz: ");
            satir = input.nextInt();

            System.out.print("Sütun giriniz: ");
            sutun = input.nextInt();

            System.out.println("=====================");

            if (mayin_tarlasi[satir][sutun].equals(" * ")) {
                System.out.println("Mayına Bastınız. Oyunu kaybettiniz !");
                break;
            }

            if ((satir >= 0 && satir < rowNumber) && (sutun >= 0 && sutun < colNumber)) {

                for (int i = satir - 1; i <= satir + 1; i++) {
                    if (i >= 0 && i < rowNumber) {
                        for (int j = sutun - 1; j <= sutun + 1; j++) {
                            if (j >= 0 && j < colNumber) {
                                if (mayin_tarlasi[i][j].equals(" * ")) {
                                    sayac++;
                                }
                            }
                        }
                    }
                }
            }

            String sayacc = " " + String.valueOf(sayac) + " ";
            bos_mayin_tarlasi[satir][sutun] = sayacc;

            for (int l = 0; l < rowNumber; l++) {
                for (int m = 0; m < colNumber; m++) {
                    System.out.print(bos_mayin_tarlasi[l][m]);
                }
                System.out.println();
            }

            if (hak == 1) {
                System.out.println("Oyunu kazandınız !");
                break;
            }
            hak--;
        }
    }

}
