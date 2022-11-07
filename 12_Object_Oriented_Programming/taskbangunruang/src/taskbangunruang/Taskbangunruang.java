package taskbangunruang;
import java.util.*;
public class Taskbangunruang {
 public static void main(String[] args) { 
        int pil; 
        kubus  A = new kubus();
        balok  B = new balok();
        tabung C = new tabung();
        
        Scanner input = new Scanner(System.in);
        System.out.println("============================="); 
        System.out.println("=====Volume Bangun Ruang=====");
        System.out.println("============================="); 
        System.out.println("1. Kubus");
        System.out.println("2. Balok ");        
        System.out.println("3. Tabung");
        System.out.print("Pilihan : ");
        pil = input.nextInt();
                  switch(pil){ //metode switch case untuk menentukan ingin menghitung bangun datar apa
            case 1 : A.kubus();break;
            case 2 : B.balok();break;
            case 3 : C.tabung();break;
        }
         
        }
}