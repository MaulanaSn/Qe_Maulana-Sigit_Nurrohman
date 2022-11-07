import java.util.Scanner;

public class Konversi_Nilai {
    public static void main(String[] args) {
        int total = 100;
        Scanner nilai = new Scanner(System.in);
        System.out.print("Nilai = ");
        int Total = nilai.nextInt();
        if ((total<=100)&&(total>=90)){
            System.out.println("Nilai Akhirnya adalah = A");
        }
        else if((total<90)&&(total>=80)){
            System.out.println("Nilai Akhirnya adalah = B");
        }
        else if((total<80)&&(total>=70)){
            System.out.println("Nilai Akhirnya adalah = C");
        }
        else if((total<70)&&(total>=60)){
            System.out.println("Nilai Akhirnya adalah = D");
        }
        else if(total<60){
            System.out.println("Nilai Akhirnya adalah = E");
        }
        else{ System.out.println("Nilainya Error");
        }
    }
}
