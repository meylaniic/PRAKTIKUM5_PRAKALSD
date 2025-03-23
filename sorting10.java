public class sorting10 {
    int [] data;
    int jumdata;

    public sorting10(int Data[], int jmldat) {
        jumdata = jmldat;
        data = new int[jmldat];
        for (int i = 0; i < jumdata; i++) {
            data[i] = Data[i];
        }
    }

    void bubblesort() {
        int temp = 0;
        for (int i = 0; i < jumdata-1; i++) {
            for (int j = 1; j < jumdata; j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j];
                    data[j]=data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    void tampil() {
        for (int i = 0; i < jumdata; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
    }

    void selectionsort() {
        for (int i = 0; i < jumdata-1; i++) {
            int min = i;
            for (int j = i+1; j < jumdata; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i]=data[min];
            data[min]=temp;
        }
    }

    void insertionsort() {
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j=i-1;
            while (j>=0 && data[j]>temp) {
                data[j+1] = data[j];
                j--;
                data[j+1] = temp;
            }
        }
    }

    
}
