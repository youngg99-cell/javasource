package basic;

import java.util.Scanner;

public class ScaennerEX3 {
    public static void main(String[] args) {
        // 키보드에서 입력받기 코드
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자입력 : ");
        int num1 = sc.nextInt(); // 35엔터
        System.out.println("연산자 입력 : "); // +, -,*,/
        String op = sc.nextLine(); // 20엔터
        System.out.println("두번째 숫자입력 : ");
        int num2 = sc.nextInt();
        System.out.println(op);
        System.out.println(num1 + num2);
        sc.close();

    }
}
