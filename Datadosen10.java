public class Datadosen10 {
    Dosen10 [] datadosen = new Dosen10[10];
    int idx;

    void tambah (Dosen10 dsn) {
        if (idx < datadosen.length) {
            datadosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh.");
        }
    }

    void tampil () {
        if (idx == 0) {
            System.out.println("Belum ada data dosen");
            return;
        }
        for (int i = 0; i < idx; i++) {
            datadosen[i].tampil();
            System.out.println("--------------------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx -1; i++) {
            for (int j = 1; j < idx -i; j++) {
                if (datadosen[j].usia < datadosen[j-1].usia) {
                    Dosen10 tmp = datadosen[j];
                    datadosen[j] = datadosen[j-1];
                    datadosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx; i++) {
            int idxmin = i;
            for (int j = i+1; j < idx; j++) {
                if (datadosen[j].usia > datadosen[idxmin].usia) {
                    idxmin=j;
                }
            } 
            Dosen10 tmp = datadosen[idxmin];
            datadosen[idxmin] = datadosen[i];
            datadosen[i]=tmp;  
        }
    }

    void insertionsort() {
        for (int i = 0; i < idx; i++) {
            Dosen10 temp = datadosen[i];
            int j=i;
            while (j > 0 && datadosen[j-1].usia < temp.usia) {
                datadosen[j] = datadosen[j-1];
                j--;
            }
            datadosen[j]= temp;
        }
    }
}
