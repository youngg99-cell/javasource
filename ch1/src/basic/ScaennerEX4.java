package basic;

import java.util.Scanner;

public class ScaennerEX4 {
    public static void main(String[] args) {
        // ScaennerEX3 개선
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자입력 : ");

        // 입력받기 : sc.nextLine()==>""
        // ""을 없애야 한다면 : Integer.parsInt or Float.parseFlot or Doubel.parseDoeble

        String num1 = sc.nextLine(); // 35엔터
        int input1 = Integer.parseInt(num1);
        int input1 =

                System.out.println("연산자 입력 : "); // +, -,*,/
        String op = sc.nextLine();

        System.out.println("두번째 숫자입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        System.out.println(op);
        System.out.println(input1 + input2);
        sc.close();

    }
}
