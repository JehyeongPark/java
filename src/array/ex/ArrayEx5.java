package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int count = sc.nextInt();

        int[] num = new int[count];
        int total = 0;


        System.out.print(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
            total += num[i];
        }

        double average = (double) total / count;

        System.out.println("입력한 정수 총합: " + total);
        System.out.println("입력한 정수 평균: " + average);

    }
}
