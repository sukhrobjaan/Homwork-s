package lesson7.example_5;

public class Kasr {
    int surat;
    int maxraj;

    public Kasr(int surat, int maxraj) {
        this.surat = surat;
        this.maxraj = maxraj;
    }

    void showInfo() {
        System.out.print("hozirgi kasrmiz => ");
        System.out.println(surat + "/" + maxraj);
    }

    void addTwoKasr(int surat1, int maxraj1, int surat2, int maxraj2) {
        int surat0=0;
        if(ekuk(maxraj1,maxraj2)==1) System.out.println(surat1+surat2);
        else  surat0 = surat1 * ekuk(maxraj1, maxraj2) / maxraj1 + surat2 * ekuk(maxraj1, maxraj2) / maxraj2;
        System.out.println("add Kasr's = " + surat0/ekub(surat0,ekuk(maxraj1,maxraj2)) + "/"
                + ekuk(maxraj1, maxraj2)/ekub(surat0,ekuk(maxraj1,maxraj2)));
    }

    void multiplyTwoKasr(int surat1, int maxraj1, int surat2, int maxraj2) {
        if(maxraj1 * maxraj2 / ekub(surat1 * surat2, maxraj1 * maxraj2)==1)
            System.out.println("Kasrlarni ko'patmasi = " + surat1 * surat2 / ekub(surat1 * surat2, maxraj1 * maxraj2));
        else System.out.println("Kasrlarni ko'patmasi = " + surat1 * surat2 / ekub(surat1 * surat2, maxraj1 * maxraj2) +
                "/" + maxraj1 * maxraj2 / ekub(surat1 * surat2, maxraj1 * maxraj2));
    }
    void divisionTwoKasr(int surat1, int maxraj1, int surat2, int maxraj2){
        if(maxraj1 * surat2 / ekub(surat1 * maxraj2, maxraj1 * surat2)==1)
            System.out.println("Kasrlarni nisbati = " + surat1 * maxraj2 / ekub(surat1 * maxraj2, maxraj1 * surat2));
        else System.out.println("Kasrlarni nisbati = " + surat1 * maxraj2 / ekub(surat1 * maxraj2, maxraj1 * surat2) +
                "/" + maxraj1 * surat2 / ekub(surat1 * maxraj2, maxraj1 * surat2));
    }


    int ekuk(int maxraj1, int maxraj2) {
        int a = maxraj1;
        int b = maxraj2;
        while (maxraj1 != maxraj2) {
            if (maxraj1 > maxraj2) maxraj1 -= maxraj2;
            else maxraj2 -= maxraj1;
        }
        return a * b / maxraj1;
    }

    int ekub(int maxraj1, int maxraj2) {
        while (maxraj1 != maxraj2) {
            if (maxraj1 > maxraj2) maxraj1 -= maxraj2;
            else maxraj2 -= maxraj1;
        }
        return maxraj1;
    }
}
