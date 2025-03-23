import java.util.Scanner;
public class Mahasiswademo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah data mahasiswa yang akan anda masukkan : ");
        int jumlahmhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBeprestasi10 list = new MahasiswaBeprestasi10(jumlahmhs);

        for (int i = 0; i < jumlahmhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("--------------------");

            Mahasiswa10 m = new Mahasiswa10(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data Mahasiswa Sebelum Sorting");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunkan INSERTION SORT (ASC)");
        list.insertionsort();
        list.tampil();

        //System.out.println("Data yang sudah terurut menggunkan SELECTION SORT (ASC)");
        //list.selectionsort();
        //list.tampil();

        //System.out.println("List mahasiswa setelah sorting");
        //list.bubblesort();
        //list.tampil();

        

    }
}
