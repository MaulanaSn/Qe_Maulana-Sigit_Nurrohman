public class Persyaratan{
    int Panjang,Lebar,Tinggi,Berat,Luas;

    public int Luas(int Panjang, int Lebar, int Tinggi){
        int Hasil;
        Hasil = Panjang * Lebar * Tinggi;
        return Hasil;
    }

    public int Syarat(){
        Luas = Luas(Panjang, Lebar, Tinggi);
        if(Luas <= 50 && Berat <= 1 ){
            return 5000;
        }else {
            return 10000;
        }
    }
}