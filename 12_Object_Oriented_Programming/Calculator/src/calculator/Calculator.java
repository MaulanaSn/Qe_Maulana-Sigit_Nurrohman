package calculator;
import java.util.*;
public class Calculator {
 public static void main(String[] args) { 
        int pil; 
        Penjumlahan A = new Penjumlahan();
        Pengurangan B = new Pengurangan();
        Pembagian   C = new Pembagian();
        Perkalian   D = new Perkalian();
        
        Scanner input = new Scanner(System.in);
        System.out.println("============================="); 
        System.out.println("========Calculator===========");
        System.out.println("============================="); 
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan ");        
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.print("Pilihan : ");
        pil = input.nextInt();
                  switch(pil){ //metode switch case untuk menentukan ingin menghitung bangun datar apa
            case 1 : A.Penjumlahan();break;
            case 2 : B.Pengurangan();break;
            case 3 : C.Pembagian();break;
            case 4 : D.Perkalian();break;
        }
         
        }
}