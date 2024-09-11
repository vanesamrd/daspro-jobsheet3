import java.util.Scanner;

import java.util.Scanner;

/**
 * Siakad24
 */
public class Siakad24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir;
        
        System.out.println("Masukkan nama\t\t: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM\t\t: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas\t\t: ");
        kelas = sc.nextLine().charAt(0);
        System.out.println("Masukkan nomor absen\t: ");
        absen = sc.nextByte();
        System.out.println("Masukkan nilai kuis\t: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas\t: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai ujian\t: ");
        nilaiUjian = sc.nextDouble();
        System.out.println("Masukkan nilai UTS\t: ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan nilai UAS\t: ");
        nilaiUAS = sc.nextDouble();
        System.out.println("Masukkan nilai akhir\t: ");
        nilaiAkhir = sc.nextDouble();
       
        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35);
       
        System.out.printf("Output:\nNAma\t: %s\nNIM\t: %s\nKelas\t: %s\nAbsen\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir);
    

    }
}