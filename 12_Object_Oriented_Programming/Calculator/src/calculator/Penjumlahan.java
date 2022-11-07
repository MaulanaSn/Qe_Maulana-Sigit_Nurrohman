package calculator;
import java.util.Scanner;  
 public class Penjumlahan extends Calculator {
   public void Penjumlahan(){
       System.out.println("== Penjumlahan ==");
      Scanner input = new Scanner(System.in);  
      System.out.print("Masukan Angka Pertama : ");  
      int angkaPertama = input.nextInt();  
      System.out.print("Masukan Angka Kedua : ");  
      int angkaKedua = input.nextInt();  
      System.out.println("");  
      int hasilPenjumlahan = (angkaPertama+angkaKedua);  
      System.out.println("Hasil penjumlahan "+angkaPertama+" + "+angkaKedua+" = "+hasilPenjumlahan);  
  }  
 }  
   