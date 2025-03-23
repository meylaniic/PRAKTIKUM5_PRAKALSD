public class sortingmain10 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        sorting10 dataurut1 = new sorting10(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("Data sudah di urutkan dengan Bubble Sort (ASC)");
        dataurut1.tampil();
        System.out.println();


        int b[] = {30, 20, 2, 8, 14};
        sorting10 dataurut2 = new sorting10(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionsort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
        System.out.println();

        int c[] = {40, 10, 4, 9, 3};
        sorting10 dataurut3 = new sorting10(c, c.length);
        
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionsort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();

    }
}
