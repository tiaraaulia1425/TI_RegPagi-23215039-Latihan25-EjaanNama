package pertemuan5new;

/**
 *
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 *  Program meminta nama dari pengguna 
 * dan menampilkan ejaan setiap huruf 
 * dalam nama tersebut satu per satu
 */
    import java.util.Scanner;
public class latihan25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama dari user
        System.out.print("Masukkan nama depan anda untuk dieja: ");
        String nama = scanner.nextLine();

        // Menampilkan hasil ejaan
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }

        scanner.close();
    }
}
