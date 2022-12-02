public class Main {
    public static void main(String[] args) {
        Persyaratan srt = new Persyaratan();

        srt.Luas(5, 2, 4);
        srt.Berat = 1;

        System.out.println("Harga : " + srt.Syarat());
    }
}
