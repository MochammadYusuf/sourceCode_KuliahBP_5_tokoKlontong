package kuliahbp_1;

/*
 * @author MOCHAMMAD YUSUF PRATAMA
 * NPM 21082010063
 * FIK SISTEM INFORMASI
 * PARAREL B082
 */

import java.util.Scanner;

public class KuliahBP_5_TokoKlontong {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Judul Program
        System.out.println("=======================================================");
        System.out.println("Kasir Toko Klontong Sederhana");
        System.out.println("=======================================================");
        System.out.println("Sedia : ");
        System.out.println("1. Aneka Sate.");
        System.out.println("2. Aneka Pecel.");
        System.out.println("3. Aneka Penyetan.");
        System.out.println("=======================================================");
        
        int menu, hargaPembelian = 0, hargaAkhir = 0, kembalian = 0, uangPembayaran;
        
        System.out.print("Pilih Menu : ");
        menu = input.nextInt();
        
        switch(menu) {
            case 1: int sate, tusuk;
                    System.out.println("Aneka Menu Sate dan Harga : ");
                    System.out.println("1. Sate Ayam Rp1.500 per Tusuk.");
                    System.out.println("2. Sate Kambing Rp3.000 per Tusuk.");
                    System.out.print("Pilih Menu Sate : ");
                    sate = input.nextInt();
                    
                    if (sate == 1) {
                        // Sate Ayam
                        System.out.print("Masukkan Jumlah Tusuk Sate : ");
                        tusuk = input.nextInt();
                        hargaPembelian = tusuk * 1500;
                        System.out.println("Total Harga : " + hargaPembelian);                        
                    } else if (sate == 2) {
                        // Sate Kambing
                        System.out.print("Masukkan Jumlah Tusuk Sate : ");
                        tusuk = input.nextInt();
                        hargaPembelian = tusuk * 3000;
                        System.out.println("Total Harga : " + hargaPembelian);
                    } 
                    
                    break;
                    
            case 2: int pecel, porsiPecel;
                    System.out.println("Aneka Menu Pecel dan Harga : ");
                    System.out.println("1. Lauk Ayam Rp13.000 per Porsi.");
                    System.out.println("2. Lauk Empal Rp15.000 per Porsi.");
                    System.out.print("Pilih Menu Pecel : ");
                    pecel = input.nextInt();
                    
                    if (pecel == 1) {
                        // Pecel Lauk Ayam
                        System.out.print("Masukkan Jumlah Porsi Pecel : ");
                        porsiPecel = input.nextInt();
                        hargaPembelian = porsiPecel * 13000;
                        System.out.println("Total Harga : " + hargaPembelian);                        
                    } else if (pecel == 2) {
                        // Pecel Lauk Empal
                        System.out.print("Masukkan Jumlah Porsi Pecel : ");
                        porsiPecel = input.nextInt();
                        hargaPembelian = porsiPecel * 15000;
                        System.out.println("Total Harga : " + hargaPembelian);
                    } 
                    
                    break;
            
            case 3: int penyetan, porsiPenyetan;
                    System.out.println("Aneka Menu Penyetan dan Harga : ");
                    System.out.println("1. Lauk Tahu/Tempe Rp5.000 per Porsi.");
                    System.out.println("2. Lauk Telur Rp7.000 per Porsi.");
                    System.out.println("3. Lauk Ayam Rp10.000 per Porsi.");
                    System.out.print("Pilih Menu Penyetan : ");
                    penyetan = input.nextInt();
                    
                    switch(penyetan) {
                        case 1 : // Penyetan Tahu / Tempe
                                 System.out.print("Masukkan Jumlah Porsi Penyetan : ");
                                 porsiPenyetan = input.nextInt();
                                 hargaPembelian = porsiPenyetan * 5000;
                                 System.out.println("Total Harga : " + hargaPembelian);
                                 break;
                        case 2 : // Penyetan Telur
                                 System.out.print("Masukkan Jumlah Porsi Penyetan : ");
                                 porsiPenyetan = input.nextInt();
                                 hargaPembelian = porsiPenyetan * 7000;
                                 System.out.println("Total Harga : " + hargaPembelian);
                                 break;
                        case 3 : // Penyetan Ayam
                                 System.out.print("Masukkan Jumlah Porsi Penyetan : ");
                                 porsiPenyetan = input.nextInt();
                                 hargaPembelian = porsiPenyetan * 10000;
                                 System.out.println("Total Harga : " + hargaPembelian);
                                 break;
                    }
                                        
                    break;
            
            default : System.out.println("Pilihan Tidak Ada!!!");
        }
        
        System.out.println("=======================================================");
        
        String kartuMember;
        
        System.out.print("Memiliki Kartu Member Toko Klontong [ya/tidak]: ");
        kartuMember = input.next();
        
        switch(kartuMember) {
            case "ya"   :   // Memiliki Kartu
                            hargaAkhir = (int)(hargaPembelian - (hargaPembelian * 0.05));
                            System.out.println("Harga Member : " + hargaAkhir);
                            System.out.print("Uang Pembayaran : ");
                            uangPembayaran = input.nextInt();
                            kembalian = uangPembayaran - hargaAkhir;
                            break;
            case "tidak" :  // Memiliki Kartu
                            System.out.println("Tidak Mendapatkan Diskon");
                            System.out.print("Uang Pembayaran : ");
                            uangPembayaran = input.nextInt();
                            kembalian = uangPembayaran - hargaPembelian;
                            break;
        }
        
        if(kembalian == 0) {
            System.out.println("Uang Anda Pas");
        } else {
            System.out.println("Uang Kembali : Rp " + kembalian);
        }
        
        System.out.println("=======================================================");
        System.out.println("Terima Kasih Telah Mampir.");
        
    }
    
}
