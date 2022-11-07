package calculator;
import java.util.Scanner;  
 public class Pembagian extends Calculator {
   public void Pembagian(){ 
       System.out.println("== Pembagian ==");
      Scanner input = new Scanner(System.in);  
      System.out.print("Masukan Angka Pertama : ");  
      int angkaPertama = input.nextInt();  
      System.out.print("Masukan Angka Kedua : ");  
      int angkaKedua = input.nextInt();  
      System.out.println("");  
      int hasilPembagian = (angkaPertama/angkaKedua);   
      System.out.println("Hasil Pembagian "+angkaPertama+" / "+angkaKedua+" = "+hasilPembagian);   
  }  
 }  