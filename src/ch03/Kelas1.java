package ch03;

import java.util.Scanner;

public class Kelas1 {
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);

        System.out.println("=== Menentukan Nilai Tertinggi ===");
            int x,y;
        System.out.print("Masukkan nilai x = ");
            x = nilai.nextInt();
        System.out.print("Masukkan nilai y = ");
            y = nilai.nextInt();

        if (x >= y) {
            System.out.println("Nilai tertinggi antara variabel x dan y adalah " + x);
        }else if(x <= y) {
            System.out.println("Nilai tertinggi antara variabel x dan y adalah " + y);
        }
    }
}
