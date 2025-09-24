package operator;

public class operatorEX5 {
  public static void main(String[] args) {
      //삼향연산자
      // 조건 ? 참일때 : 거짓일때
     //a > 10 ? "크다" : "작다" 
     int x 10, y = 5, z = 0;
     
     int result1 = x > = 0 ? x : -x;
     int result2 = y > = 0 ? y : -y;
     int result3 = z > = 0 ? z : -z;

    // 0 : 기호 없음, > 0 : +, < 0 : -
     char sign1, sign2, sign3
     sign1 = x > 0 ? '+' : (x == 0 ? '' : '-');
     sign2 = y > 0 ? '+' : (y == 0 ? '' : '-');
     sign3 = z > 0 ? '+' : (z == 0 ? '' : '-');
    
     // x=+10
     System.out.printf(format: "x= %c5d\n",sing1, result1);
     System.out.printf(format: "y= %c5d\n",sing2, result2);
     System.out.printf(format: "z= %c5d\n",sign3, result3);
    }
}
