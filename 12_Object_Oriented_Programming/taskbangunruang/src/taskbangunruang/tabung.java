package taskbangunruang;
import java.util.Scanner;
public class tabung extends Taskbangunruang {
    public void tabung(){
        System.out.println("== Volume Tabung ==");
          System.out.print("Masukkan jari-jari alas tabung : ");
            Scanner input = new Scanner(System.in); 
            double jari = input.nextDouble();
            System.out.print("Masukkan tinggi tabung : ");
            double tinggi = input.nextDouble();
            System.out.println("Volumenya" + tinggi*jari*jari*22/7);
        }
    }
 