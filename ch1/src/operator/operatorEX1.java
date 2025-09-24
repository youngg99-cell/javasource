package operator;

public class operatorEX1 {
    public static void main(String[] args) {
        // 단향연산자 ++ --
        // ++ : +1,-- : -1
        int i = 5;
        i++; // i = i_+i;
        System.out.println(i);
        i--; // 1 = i -i;
        System.out.println(i);

        int j = 10;
        ++j;
        System.out.println(j);

        int k = 5, l = 0;
        l = k++; // l=k; k++;
        System.out.println("l= k++; 실행 후 , k=" + ",l=" + l);

        k = 5;
        l = 0;
        l = ++k; // ++k; l=k;
        System.out.println("l= k++; 실행 후 , k=" + k + ",l=" + l); // k=6,l=6

    }
}
