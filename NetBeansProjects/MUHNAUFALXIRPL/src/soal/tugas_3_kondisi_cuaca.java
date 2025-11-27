package SOAL;

import java. util.Scanner;

public class tugas_3_kondisi_cuaca{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kondisi cuaca (cerah, hujan, berawan, badai, salju): ");
        String cuaca = input.nextLine();

        if (cuaca.equalsIgnoreCase("cerah")) {
            System.out.println("Cuaca cerah 🌞, enak untuk beraktivitas di luar.");
        } else if (cuaca.equalsIgnoreCase("hujan")) {
            System.out.println("Cuaca hujan 🌧️, jangan lupa bawa payung.");
        } else if (cuaca.equalsIgnoreCase("berawan")) {
            System.out.println("Cuaca berawan ☁️, kemungkinan hujan turun.");
        } else if (cuaca.equalsIgnoreCase("badai")) {
            System.out.println("Cuaca badai ⛈️, sebaiknya tetap di rumah.");
        } else if (cuaca.equalsIgnoreCase("salju")) {
            System.out.println("Cuaca salju ❄️, gunakan pakaian hangat.");
        } else {
            System.out.println("Kondisi cuaca tidak dikenali.");
        }

        input.close();
    }
}


 








  




 


    

