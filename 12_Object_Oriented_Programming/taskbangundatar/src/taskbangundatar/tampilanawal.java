package taskbangundatar;
import java.util.*;   //perintah untuk memasukan data dari peralatan input
public class tampilanawal { //nama class yaitu tampilan awal
        public static void main(String[] args) { //class terbuka dengan tipe data string
        int pil; //variable pil, dengan tipe data integer
        Segitiga S = new Segitiga();
        Persegi B = new Persegi();
        Persegipanjang P = new Persegipanjang();
        Scanner input = new Scanner(System.in);
        System.out.println("============================="); //menampilkan output
        System.out.println(" MENGHITUNG LUAS BANGUN DATAR ");     
        System.out.println("============================="); 
        System.out.println("Input Nomor Pilihan Anda untuk Menghitung Bangun Datar ");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi ");        
        System.out.println("3. Persegi Panjang");

        System.out.print("Pilihan : ");
        pil = input.nextInt();
                  switch(pil){ //metode switch case untuk menentukan ingin menghitung bangun datar apa
            case 1 : S.Segitiga();break;
            case 2 : B.Persegi();break;
            case 3 : P.Persegipanjang();break;
        }
         
        }
}