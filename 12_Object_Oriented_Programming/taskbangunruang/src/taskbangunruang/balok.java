package taskbangunruang;
import java.util.Scanner;
public class balok extends Taskbangunruang {
    public void balok(){
        System.out.println("== Volume Balok ==");
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();
 
        // hitung luas balok;
        hasil = panjang * lebar* tinggi;
 
        System.out.println("Volumenya: " + hasil);
 
    }
}
