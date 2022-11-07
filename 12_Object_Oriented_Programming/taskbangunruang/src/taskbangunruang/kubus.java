package taskbangunruang;
import java.util.Scanner;
public class kubus extends Taskbangunruang{
   public void kubus(){
       System.out.println("== Volume Kubus ==");
        Scanner input = new Scanner(System.in);
        double sisi, hasil;
       
        System.out.print("Masukkan Sisi : ");
             sisi = input.nextDouble();
     
        hasil = sisi*sisi*sisi;
       
        System.out.println("Volumenya : " + hasil);
    }
}
   

