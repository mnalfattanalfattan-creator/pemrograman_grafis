package latihan;

import java.util.Scanner;

public class latihan_3_kondisi {
  public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
    
     System.out.print("masukkan nilai siswa: ");
     double nilai = input.nextDouble();
     
     if (nilai >= 85 && nilai <= 100) {
        System.out.println( "nilai huruf: A");
        System.out.println("EXcellent");
     }
     else if (nilai >= 75 && nilai < 85) {
            System.out.println("Nilai huruf: B");
            System.out.println("Good job!");
     }
     else if (nilai >= 65 && nilai <= 75) {
            System.out.println("nilai huruf:C");
            System.out.println("fair");
     }
     else if (nilai >= 50 && nilai < 65) {
            System.out.println("nilai huruf:D");
            System.out.println("Need improvement");
     }
     else if (nilai >= 0 && nilai <= 50) {
            System.out.println("Nilai huruf: E");
            System.out.println("failed");
     }
     else {
           System.out.println("nilai tidak valid:");
     }
  }
}



    

