package control;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        // 현재 월 입력받기
        // 월이 3,4,5 : 현재 계절은 봄입니다.
        // 월이 3,4,5 : 현재 계절은 여름입니다.
        // 월이 3,4,5 : 현재 계절은 가을입니다.
        // 월이 3,4,5 : 현재 계절은 겨울입니다.

        Scanner sc = new Scanner(System.in);
        System.out.println(" 현재 월 입력하세요 ");
        int momth = Integer.parseInt(sc.nextLine());
        if (momth ==3 || momth ==4 momth || ==) {
            System.out.println("현재 계절은 봄입니다.");
        } else if (momth == 9 || momth == 20 || momth ==11) {
            
        }

         switch (args) {
         case 3:
         case 4 :
         case 5 :
                 System.out.println(x:"현재 계절은 봄입니다");
                 break;
        case 6 :
        case 7 :
        case 8 :
                System.out.println("현재 계절은 여름입니다");     
                break;
        case 9 :
        case 10 :
        case 11 :
                 System.out.println(" 현재 계절은 가을입니다");
                 break;
        case 12 : 
        case 1 :
        case 2 :
               System.out.println(" 현재 계절은 겨울입니다");
               break;
               

        break;

         default:
         break;
         }
    }
}
