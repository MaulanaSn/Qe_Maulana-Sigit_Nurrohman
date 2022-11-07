import java.util.Scanner;

public class Ubah_Huruf {
    public static void main(String[] args){
        String kamus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String kata = a.nextLine();
        String katabaru = "";

        for (int i = 0; i < kata.length(); i++) {

            int charBerapa = kamus.indexOf(kata.charAt(i));

            int indexHasil = (charBerapa + 10) % 26;

            Character charHasil = kamus.charAt((indexHasil));

            katabaru = katabaru + charHasil;
            System.out.println(katabaru);
        }
    }
}
