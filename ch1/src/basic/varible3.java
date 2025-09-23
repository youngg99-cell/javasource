package basic;

public class varible3 {
    public static void main(String[] args) {
        // 실수형 : float, double (기본타입)
        // float Source1 = 50;
        // float :F,f
        float score1 = 50.15f;
        // double : d,D
        double score2 = 45.125d;
        System.out.println("score1 = " + score1); // 50.0
        System.out.println("score2 = " + score2); // 45.0
        // %10.2f : %전체자릿수.소수점자릿수
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2); // 45.0
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2); // 45.0

    }
}
