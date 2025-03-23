import java.util.Scanner;

public class Dosenmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Datadosen10 d = new Datadosen10();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Sorting Usia DSC (Selection Sort)");
            System.out.println("5. Sorting Usia DSC (Insertion Sort)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=Laki-laki, false=Perempuan): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    d.tambah(new Dosen10(kode, nama, jk, usia));
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    d.tampil();
                    break;

                case 3:
                    d.sortingASC();
                    System.out.println("Data telah diurutkan secara ASC (Bubble Sort)");
                    d.tampil();
                    break;

                case 4:
                    d.sortingDSC();
                    System.out.println("Data telah diurutkan secara DSC (Selection Sort)");
                    d.tampil();
                    break;

                case 5:
                    d.insertionsort();
                    System.out.println("Data telah diurutkan secara DSC (Insertion Sort)");
                    d.tampil();
                    break;

                case 6:
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }
}
