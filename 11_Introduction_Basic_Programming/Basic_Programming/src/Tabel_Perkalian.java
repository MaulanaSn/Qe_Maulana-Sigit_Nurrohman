import java.util.Scanner;

public class Tabel_Perkalian {
    public static void main(String[] args) {
        Scanner a = new Scanner(System. in );
        System.out.print("Masukkan angka : ");
        int nilai = a.nextInt();
        for (int i = 1; i <= nilai; i++) {
            for(int j = 1; j <= nilai; j++){
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n\n");
        }
    }
}