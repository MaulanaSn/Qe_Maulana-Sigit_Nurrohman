import java.util.Scanner;
public class Exponention {
        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.print("Masukkan Bilangan :");
            int A=input.nextInt();
            System.out.print("pangkat:");
            int B=input.nextInt();
            int Hasil=(int) Math.pow(A, B);
            System.out.println("Hasil :"+Hasil);
        }

    }
