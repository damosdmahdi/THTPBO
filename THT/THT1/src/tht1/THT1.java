/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tht1;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author damos
 */
public class THT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Input data mahasiswa
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Usia Mahasiswa: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Jumlah Mata Kuliah yang Diambil: ");
        int jumlahmatkul = input.nextInt();
        
        double totalNilai = 0;
        for (int i = 1; i <= jumlahmatkul; i++) {
            System.out.print("Masukkan nilai untuk Mata Kuliah " + i + ": ");
            totalNilai += input.nextDouble();
        }
        
        double rataRata = totalNilai / jumlahmatkul;
        double ipk = (rataRata / 100) * 4;

        boolean usiaLebih22 = usia > 22;
        boolean ipkTinggi = ipk >= 3.5 && jumlahmatkul > 4;
        boolean ipkRendah = ipk < 2.5 || jumlahmatkul < 4;
        int nomorAntrian = random.nextInt(100) + 1;
        
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia);
        System.out.println("Jumlah Mata Kuliah: " + jumlahmatkul);
        System.out.printf("Rata-rata Nilai: %.2f\n", rataRata);
        System.out.printf("IPK: %.2f\n", ipk);
        
        if (usiaLebih22) {
            System.out.println("Mahasiswa berusia lebih dari 22");
        }
        if (ipkTinggi) {
            System.out.println("Mahasiswa memiliki IPK tinggi");
        }
        if (ipkRendah) {
            System.out.println("Mahasiswa memiliki IPK rendah");
        }
        
        System.out.println("Nomor Antrian Konsultasi Akademik: " + nomorAntrian);
        
        input.close();
    }
    
}
