package calculator;
import java.util.Scanner;  
 public class Perkalian extends Calculator {
   public void Perkalian(){ 
       System.out.println("== Perkalian ==");
      Scanner input = new Scanner(System.in);  
      System.out.print("Masukan Angka Pertama : ");  
      int angkaPertama = input.nextInt();  
      System.out.print("Masukan Angka Kedua : ");  
      int angkaKedua = input.nextInt();  
      System.out.println("");  
      int hasilPerkalian = (angkaPertama*angkaKedua);  
      System.out.println("Hasil Perkalian "+angkaPertama+" * "+angkaKedua+" = "+hasilPerkalian);   
  }  
 }  