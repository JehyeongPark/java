package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =0;
        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while (true) {
            n = sc.nextInt();
            if(n == -1){
                break;
            }
            sum +=n;
            count++;
        }
        double average = (double)sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
