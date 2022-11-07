package taskbangundatar;
import java.util.*;  //perintah untuk memasukan data dari peralatan input
public class Segitiga extends tampilanawal { //menghubungakan class tampilan awal dengan class segitiga
    public void Segitiga(){
        double luas,keliling,alas,tinggi,sisi; //variable luas,keliling,alas,tinggi,sisi bertipe data double supaya bisa menampung inputan angka desimal.
        Scanner input = new Scanner(System.in); //perintah untuk membaca data masuk
        System.out.println("=========="); //tampilan output
        System.out.println("=SEGITIGA= ");
        System.out.println("==========");
        System.out.println();
        System.out.print ("Masukkan alas : "); //memasukan inputan alas
        alas = input.nextDouble();                     //inputan alas akan ditampung di var alas
        System.out.print ("Masukkan tinggi :");  //memasukan inputan tinggi
      tinggi = input.nextDouble();                    //inputan tinggi akan ditampung di var tinggi
        System.out.print ("Masukkan sisi : ");   //memasukan inputan sisi
        sisi = input.nextDouble();
        luas = (alas*tinggi)/2;    //mendeklarasikan var luas dengan rumus hitung luas
        keliling = (sisi*2)+alas; //mendeklarasikan var keliling dengan rumus hitung keliling
        System.out.println("----------------------------------"); //menampilkan output
        System.out.println("Luas Segitiga adalah : "+luas); //menampilkan output & pemanggilan var luas
        System.out.println("Keliling Segitiga adalah : "+keliling);
       
    }
}