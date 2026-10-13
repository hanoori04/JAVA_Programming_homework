
import java.util.Scanner;

public class Homework4 {

    // 재귀호출을 이용한 최대공약수 계산
    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        return gcd(n, m % n);
    }

    // 반복문을 이용한 최대공약수 계산
    public static int gcdLoop(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }

        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("두 수의 최대공약수는 " + gcd(m, n) + "입니다.");

        sc.close();
    }
}
