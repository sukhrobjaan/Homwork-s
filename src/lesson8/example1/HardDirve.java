package lesson8.example1;

public class HardDirve extends File {
    int size;
    int count = 0;
    int summ = 0;
    int sum = 0;

    File[] files = new File[100];

    public HardDirve(String fileName, int fileSize, int size) {
        super(fileName, fileSize);
        this.size = size;
        summ = size;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void write(File file) {
        if ((getSize() > 0) && (file.getFileSize() <= getSize())) {
            files[count++] = file;
            setSize(getSize() - file.getFileSize());
        }
    }

    void remove(int hardRemove) {
        setSize(getSize() + hardRemove);
        sum += hardRemove;
    }

    void clear() {
        setSize(summ);
    }

    boolean isEmpty() {
        return summ == getSize();
    }

    boolean isFull() {
        return getSize() == 0;
    }

    double getUsedSapce() {
        int s = 0;
        for (int i = 0; i < count; i++) {
            s += files[i].getFileSize();
        }
        return s - sum;
    }

    double getFreeSapce() {
        return getSize();
    }
}
