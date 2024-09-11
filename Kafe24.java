import java.util.Scanner;
/**
 * Kafe24
 */
public class Kafe24 {

    
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 /100;
        double totalHarga, nominalBayar;
        
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        nominalBayar = totalHarga - (diskon * totalHarga);
        

        int nominalInt = (int) nominalBayar;
        byte totalByte = (byte) totalHarga; 
        
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + "Kopi, " + jmlTeh + "Teh, " + jmlRoti + "Roti, ");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("Nominal bayar (dalam int): Rp " + nominalInt);
        System.out.println("Total harga (dalam byte): " + totalByte);


    }

