package sk.itsovy.nemeth.school;

import java.util.Random;

public class Temp {
    public static void test(int sizeY, int sizeX) {
        Random rnd=new Random();
        int[][] arr = new int[sizeY][sizeX];
        int n=10, count=0, maxValue=arr[0][0], minValue=arr[0][0];
        System.out.println();
        for (int i=0; i<sizeY; i++) {
            for (int j=0; j<sizeX; j++) {
                arr[i][j]=rnd.nextInt(99);
                n++;
                if (arr[i][j]>maxValue) {
                    maxValue=arr[i][j];
                }
                if (arr[i][j]==maxValue) {
                    System.out.print(arr[i][j]+"* ");
                } else {
                    System.out.print(arr[i][j]+" ");
                }
                count+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total sum: "+count);
        System.out.println("Max value: "+maxValue);
    }
}
