import java.util.Scanner;
public class Luas_Segitiga {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        float alas, tinggi, luas;
        System.out.println("menghitung luas Segitiga");
        System.out.print("alas : ");
        alas = sc.nextFloat();
        System.out.print("tinggi : ");
        tinggi = sc.nextFloat();
        luas = alas * tinggi / 2;
        System.out.println("luas segitiga adalah : " + luas);

    }

}