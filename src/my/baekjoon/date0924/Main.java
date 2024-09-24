package my.baekjoon.date0924;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    x = arr[i];
                    y = arr[j];
                }
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x || arr[j] == y) {
                System.out.println("동일 값"+arr[j]);
                
                continue;
            }
            System.out.println(arr[j]);
        }
    }
}
