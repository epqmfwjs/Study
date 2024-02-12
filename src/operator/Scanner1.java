package operator;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입렵하세요:" );
        int num1 = scanner.nextInt();

        System.out.print("둑 번째 숫자를 입렵하세요:" );
        int num2 = scanner.nextInt();


        if (num1 > num2) {
            System.out.println(num1);
        }else if (num1 < num2) {
            System.out.println(num2);
        }else{
            System.out.println("두숫자의값이 같습니다");
        }
    }
}
