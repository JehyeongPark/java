package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        int minNum, maxNum;

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        minNum = num[0];
        maxNum = num[0];

        for (int i = 1; i < n; i++) {
            if (num[i] < minNum) {
                minNum = num[i];
            }
            if (num[i] > maxNum) {
                maxNum = num[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
