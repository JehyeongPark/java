package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] num = new int[5];
        int total = 0;

        System.out.print("5개의 정수를 입력하세요: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            total += num[i];
        }

        double average = (double) total / 5;

        System.out.println("입력한 정수 총합: " + total);
        System.out.println("입력한 정수 평균: " + average);

    }
}
