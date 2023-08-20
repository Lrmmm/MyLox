package lrm;

public class Fault {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        for (int item : array){
            System.out.println(item);
        }
        array[5] = 2;
        System.out.println(array);
    }
}
