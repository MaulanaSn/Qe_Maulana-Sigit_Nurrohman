package calculator;
import java.util.Scanner;  
 public class Pengurangan extends Calculator {
   public void Pengurangan(){ 
       System.out.println("== Pengurangan ==");
      Scanner input = new Scanner(System.in);  
      System.out.print("Masukan Angka Pertama : ");  
      int angkaPertama = input.nextInt();  
      System.out.print("Masukan Angka Kedua : ");  
      int angkaKedua = input.nextInt();  
      System.out.println("");  
      int hasilPengurangan = (angkaPertama-angkaKedua);  
      System.out.println("Hasil pengurangan "+angkaPertama+" - "+angkaKedua+" = "+hasilPengurangan);  
  }  
 }  