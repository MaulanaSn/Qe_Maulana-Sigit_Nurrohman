import java.util.*;

public class burjo {
    static Scanner scan = new Scanner(System.in);
    static Scanner pilihan;
    static Scanner [][] itemmakanan_bonus = new String[2][10],static int[2][10]hargamakanan_qty=new int[2][10];
    static int jumlah_jenis_menu = 0;

    static void headermenu(){

        System.out.println("                  MENU BURJO ");
        System.out.println("JL. KUSUMA BANGSA NO. 30 LAWEYAN – SURAKARTA ");
}

static void menupaket(){
        headermenu();
        System.out.println("NO 	NAMA PAKET           MENU PAKET       		  BONUS  	   HARGA ");
        System.out.println("1. PAKET PEDAS 1 	AYAM GEPREK + ES TEH 		NASI PUTIH	RP. 12.000,- ");
        System.out.println("2. PAKET PEDAS 2 	AYAM GEPREK + ES SUSU 		NASI PUTIH	RP. 12.000,- ");
        System.out.println("3. PAKET HEMAT 1 	NASI SAYUR  + ES TEH 		TEH ANGET	RP. 9.000,- ");
        System.out.println("4. PAKET MEWAH 1 	NASI CAMPUR + ES SUSU 		TEH ANGET   RP. 15.000,-");
        System.out.println("5. Pilihan Dengan Menu Terpisah");
        System.out.println("NOTE = Diskon 5% bila jumlah bayar => Rp.50.000");
        System.out.println("Masukan pilihan anda => ");
        pilihan = scan.nextLIne();
        prosesnya();
