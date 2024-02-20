package lesson8.example1;

public class Main_Class {
    public static void main(String[] args) {



        HardDirve hardDirve=new HardDirve("salom1",0,100);


        File file=new File("salom",0);

        hardDirve.write(file);
        System.out.println("isEmpty = "+hardDirve.isEmpty());
        hardDirve.write(new File("salom3",100));
        System.out.println("isFull = "+hardDirve.isFull());

        hardDirve.remove(15);
        System.out.println("gatUsedSapce = "+hardDirve.getUsedSapce());
        System.out.println("gatFreeSapce = "+hardDirve.getFreeSapce());
        hardDirve.clear();
        System.out.println(hardDirve.isEmpty());
    }
}
