package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int option = 0;
        int deposit = 0;
        int withdraw = 0;

        while (true) {
            System.out.println("------------------------------- \n 1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료 \n--------------------------------");
            System.out.print("선택 : ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.print("입금액을 입력하세요: " );
                deposit = sc.nextInt();

                balance = deposit(balance, deposit);
            }else if (option == 2) {
                System.out.print("출금액을 입력하세요: " );
                withdraw = sc.nextInt();

                balance = withdraw(balance, withdraw);
            }else if (option == 3) {
                message(balance);
            }else if (option == 4) {
                System.out.println("프로그램을 종료합니다");
                break;
            }else{
                System.out.println("잘못된 입력 값입니다.");
            }
        }

    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        }else{
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    public static void message(int balance) {
        System.out.println("잔액 확인 : " + balance);
    }
}
