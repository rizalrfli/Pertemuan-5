import java.util.Scanner;

public class PemilihanBilangan01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan sebuah angka: ");
        int angka= sc.nextInt();

        //percbangan
        //if (angka % 2 == 0)
        //{
          //  System.out.println("Angka " + angka + "termasuk bilangan genap ");
       // }
        //else
        //{
          //  System.out.println("Angka " + angka + "termasuk bilangan ganjil ");
        //}

        //modifikasi tenary operator
        String hasil = (angka % 2 == 0) ? angka + "adalah bilangan genap" : angka + "adalah bilangang ganjil";
        System.out.println(hasil);
    }    
}