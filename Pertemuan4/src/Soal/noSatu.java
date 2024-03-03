/* 
Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai 
dengan n, dimana n diinput dari alat masukan, n>=1.
*/

package Soal;

import java.util.Scanner;

public class noSatu{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = scanner.nextInt();

        // Memastikan bahwa n >= 1
        if (n < 1){
            System.out.println("Masukkan nilai n yang lebih besar dari atau sama dengan 1.");
        } else{
            // Menampilkan bilangan dari satu sampai dengan n ke bawah
            System.out.println("Bilangan dari 1 sampai dengan " + n + ":");
            for (int i = 1; i <= n; i++){
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}