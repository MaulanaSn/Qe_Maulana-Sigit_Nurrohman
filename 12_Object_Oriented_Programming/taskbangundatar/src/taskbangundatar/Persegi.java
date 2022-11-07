package taskbangundatar;
import java.util.Scanner;
public class Persegi extends tampilanawal {
    public void Persegi(){
        double s,luas,keliling;
        Scanner input = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("=PERSEGI=");
        System.out.println("===============");
        System.out.print("Masukkan sisi : ");
        s = input.nextDouble();     
        luas = s*s;
        keliling = 4*s;
        System.out.println("---------------------------------");
        System.out.println("Luas Persegi adalah : "+luas);
        System.out.println("Keliling Persegi adalah : "+keliling);
    }  
}
