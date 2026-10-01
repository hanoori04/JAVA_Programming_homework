import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받을 정수 개수 입력
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = scanner.nextInt();

        // 입력받은 개수만큼 배열 생성
        int[] numbers = new int[n];

        // 정수 입력
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 최소값과 최대값을 배열의 첫 번째 요소로 초기화
        int max = numbers[0];
        int min = numbers[0];

        // 배열을 탐색하면서 최대값과 최소값 찾기
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        scanner.close();
    }
}
