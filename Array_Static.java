package JavaTest;

import java.util.Scanner;

public class Array_Static {

    static int [] getArray(int numOfElement){
        int [] result = new int[numOfElement];
        for(int i = 0; i<numOfElement;i++){
            result[i] = i+1;
        }
        return result;
    }
    static void display(int [] array){
        for (int element : array) {
            System.out.println("\nelement = " + element);
        }
    }
    public static void main(String[] args) {

        int[] array;
        int n;
        Scanner Input = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = Input.nextInt();

        array  = getArray(n);
        display(array);
    }
}
