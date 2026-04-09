
public class LecturerData {
    Lecturer[] data = new Lecturer[10];
    int idx = 0;

    void add(Lecturer dsn) {
        if (idx < data.length) {
            data[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    void print() {
        if (idx == 0) {
            System.out.println("No data available.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            data[i].print();
        }
    }

    // ASC (youngest → oldest) → Bubble Sort
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (data[j].age > data[j + 1].age) {
                    Lecturer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // DSC (oldest → youngest) → Selection Sort
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (data[j].age > data[max].age) {
                    max = j;
                }
            }
            Lecturer temp = data[max];
            data[max] = data[i];
            data[i] = temp;
        }
    }
}