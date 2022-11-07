import java.util.Scanner;
public class Faktor_Bilangan_II {
    public static void main(String[] args) {
        Scanner a = new Scanner(System. in );
        System.out.print("Masukkan angka : ");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya:");
        for (int i = nilai; i >=1; i--)
            if (nilai % i == 0){
                System.out.println(i);
            }
        }
    }


