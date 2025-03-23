public class MahasiswaBeprestasi10 {
    Mahasiswa10 [] listmhs;
    int idx=0;

    public MahasiswaBeprestasi10(int jumlah) {
        listmhs = new Mahasiswa10[jumlah];
    }

    void tambah(Mahasiswa10 m) {
        if (idx < listmhs.length) {
            listmhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    } 
    
    void tampil () {
        for (Mahasiswa10 m : listmhs) {
            m.tampilinformasi();
            System.out.println("----------------------------------");   
        }
    }

    void bubblesort() {
        for (int i = 0; i < listmhs.length-1; i++) {
            for (int j = 1; j < listmhs.length-i; j++) {
                if (listmhs[j].ipk > listmhs[j-1].ipk) {
                    Mahasiswa10 tmp = listmhs[j];
                    listmhs[j] = listmhs[j-1];
                    listmhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionsort() {
        for (int i = 0; i < listmhs.length; i++) {
            int idxmin = i;
            for (int j = i+1; j < listmhs.length; j++) {
                if (listmhs[j].ipk < listmhs[idxmin].ipk) {
                    idxmin=j;
                }
            } 
            Mahasiswa10 tmp = listmhs[idxmin];
            listmhs[idxmin] = listmhs[i];
            listmhs[i]=tmp;  
        }
    }

    void insertionsort() {
        for (int i = 0; i < listmhs.length; i++) {
            Mahasiswa10 temp = listmhs[i];
            int j=i;
            while (j > 0 && listmhs[j-1].ipk < temp.ipk) {
                listmhs[j] = listmhs[j-1];
                j--;
            }
            listmhs[j]= temp;
        }
    }
}
