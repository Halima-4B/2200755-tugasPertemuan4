/*
Buatlah algoritma dalam bahasa Java, yang membaca panjang (integer) tiga buah sisi
sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <= c, lalu menentuka apakah
ketiga sisi tersebut membentuk segitiga siku – siku, segitiga lancip, atau segitiga
tumpul (Petunjuk gunakan hukum Phytagoras).
*/

package Soal;

import java.util.Scanner;

public class noTiga{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan panjang tiga sisi segitiga
        int[] sisi = new int[3];

        // Meminta pengguna memasukkan panjang tiga sisi segitiga
        for (int i = 0; i < 3; i++){
            System.out.print("Masukkan Sisi " + (char) ('a' + i) + " = ");
            sisi[i] = scanner.nextInt();
        }

        // Memeriksa apakah panjang sisi memenuhi syarat a <= b <= c
	if (sisi[0] > sisi[1] || sisi[1] > sisi[2]){
            System.out.println("Masukkan Tidak Valid. Pastikan a <= b <= c.");
            return; // Menghentikan program jika masukan tidak valid
        }

        // Memeriksa apakah segitiga merupakan segitiga siku-siku, tumpul atau lancip
        boolean sikuSiku = (sisi[0] * sisi[0] + sisi[1] * sisi[1] == sisi[2] * sisi[2]);
        boolean tumpul 	 = (sisi[0] * sisi[0] + sisi[1] * sisi[1] < sisi[2] * sisi[2]);

        // Menampilkan hasil berdasarkan jenis segitiga
        if (sikuSiku){
            System.out.println("Segitiga Siku-Siku");
        } else if (tumpul){
            System.out.println("Segitiga Tumpul");
        } else{
            System.out.println("Segitiga Lancip");
        }

        scanner.close();
    }
}