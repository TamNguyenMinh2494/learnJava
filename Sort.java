package JavaTest;

import java.util.Scanner;

public class Sort {
    static void swap(int a, int b){

    }
    static void interchangeSort(int[] array){
        for(int i=0; i<array.length-1;i++)
            for (int j = i+1; j<array.length;j++)
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
    }
    static void bubbleSort2(int[] array){
        for(int i=0;i<array.length-1;i++)
            for (int j=array.length -1;j>i;j--)
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
    }
    static int[] getArray1(int numOfElement) {
        int[] result = new int[numOfElement];
        for (int i = 0; i < numOfElement; i++) {
            result[i] = numOfElement-i;
        }
        return result;
    }

    static void display1(int[] array) {
        for (int element : array)
            System.out.printf("\n " + element);
        System.out.println("");
    }

    public static void main(String[] args) {

        int[] array;
        int n;
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = Input.nextInt();

        array = getArray1(n);
        display1(array);
//        System.out.println("\n-----------------------------------------");
//        System.out.println("InterChangeSort\n");
//        interchangeSort(array);
//        display1(array);

        System.out.println("\n-----------------------------------------");
        System.out.println("BubbleSort2\n");
        bubbleSort2(array);
        display1(array);
    }
}
