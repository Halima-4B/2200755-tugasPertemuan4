/*
Buatlah algoritma dalam bahasa Java, yang menerima masukan tiga buah sisi, dimana
jika semua sisi sama maka tampilkan “Termasuk Kubus”, jika ada sisi yang tidak sama
maka tampilkan bukan kubus.
*/

package Soal;

import java.util.Scanner;

public class noDua{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        // Array untuk menyimpan panjang tiga sisi kubus
        int[] sisi = new int[3]; 

        // Meminta pengguna memasukkan panjang tiga sisi kubus
        for (int i = 0; i < 3; i++){
            System.out.print("Masukkan Sisi " + (i + 1) + " = ");
            sisi[i] = scanner.nextInt();
        }

        // Memeriksa apakah semua sisi memiliki panjang yang sama
        boolean semuaSisiSama = true;
        for (int i = 1; i < 3; i++){
            if (sisi[i] != sisi[0]){ 
                semuaSisiSama = false;
                break;
            }
        }

        // Mencetak hasil berdasarkan hasil pengecekan
        if (semuaSisiSama){
            System.out.println("Termasuk Kubus");
        } else{
            System.out.println("Tidak Termasuk Kubus");
        }

        scanner.close();
    }
}