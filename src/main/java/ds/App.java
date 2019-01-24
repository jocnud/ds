package ds;

import java.util.HashMap;
import java.util.Map;

public class App {


    public static void main(String[] args) {

//        int arr[][] = new int[3][3];
//
//        // create
//        int data = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j] = ++data;
//            }
//        }
//
////        display(arr);
//
//        //transpose
//        int transpose[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                transpose[i][j] = arr[j][i];
//            }
//        }
//
//        System.out.println();
//
//        //       display(transpose);


        int inputArr1[][] = {{1, 2}, {3, 4}};
        int inputArr2[][] = {{5, 6}, {7, 8}};
        int resultArr[][] = new int[2][2];

        for (int i = 0; i < inputArr1.length; i++) {
            for (int j = 0; j < inputArr1.length; j++) {
                int sum = 0;
                for(int k = 0; k < inputArr1.length; k++){
                    sum = sum + inputArr1[i][k] * inputArr2[k][j];
                }
                resultArr[i][j] = sum;
            }
        }

        display(resultArr);


    }


    private static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " |");
            }
            System.out.println();
        }

        System.out.println();
    }


    public static boolean isPrime(int num) {

        if (num <= 2 || num % 2 == 0)
            return true;


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printTheOddRepeatingNumber(int arr[]) {

        Map<Integer, Integer> lookup = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (lookup.containsKey(arr[i])) {
                lookup.remove(arr[i]);
            } else {
                lookup.put(arr[i], 1);
            }
        }

        if (!lookup.isEmpty()) {
            lookup.entrySet().stream().findFirst().ifPresent(e -> System.out.println(e.getKey()));
        }

    }

    public static void reverseArrayInPlace(int arr[]) {

        if (arr == null)
            return;
        if (arr.length == 0)
            return;

        int front = 0;
        int back = arr.length - 1;

        while (front < back) {

            int temp = arr[front];
            arr[front] = arr[back];
            arr[back] = temp;

            front++;
            back--;

        }
    }
}
